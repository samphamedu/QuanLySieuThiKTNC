package com.supermarket.DAO;

import com.supermarket.ENTITY.SanPham;
import com.supermarket.UTILS.JdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SanPhamDAO extends HeThongDAO<SanPham, String> {

    String insert = "INSERT INTO SANPHAM VALUES (?,?,?,?,?)";
    String delete = "DELETE SANPHAM WHERE MASP = ?";
    String update = "UPDATE SANPHAM SET TENSP = ?, SOLUONG = ?, GIATHANH = ?, MACL = ? WHERE MASP = ?";
    String selectAll_SQL = "SELECT * FROM SANPHAM";
    String selectById_SQL = "SELECT * FROM SANPHAM WHERE MASP = ?";

    @Override
    public void insert(SanPham entity) {
        JdbcHelper.update(insert, entity.getMaSP(), entity.getTenSP(), entity.getSoLuong(), entity.getGiaThanh(), entity.getMaCL());
    }

    @Override
    public void update(SanPham entity) {
        JdbcHelper.update(update, entity.getTenSP(), entity.getSoLuong(), entity.getGiaThanh(), entity.getMaCL(), entity.getMaSP());
    }

    @Override
    public void delete(String entity) {
        JdbcHelper.update(delete, entity);
    }

    @Override
    public List<SanPham> selectAll() {
        return selectSql(selectAll_SQL);
    }

    @Override
    public SanPham selectById(String key) {
        List<SanPham> list = selectSql(selectById_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<SanPham> selectSql(String sql, Object... args) {
        List<SanPham> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.query(sql, args);
                while (rs.next()) {
                    SanPham entity = new SanPham();
                    entity.setMaSP(rs.getString("masp"));
                    entity.setTenSP(rs.getString("tensp"));
                    entity.setSoLuong(rs.getInt("soluong"));
                    entity.setGiaThanh(rs.getFloat("giathanh"));
                    entity.setMaCL(rs.getString("macl"));
                    list.add(entity);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }

    public List<SanPham> selectByKeyword(String keyword) {
        return this.selectSql("SELECT * FROM SANPHAM WHERE TENSP LIKE ?", "%" + keyword + "%");
    }
}

package com.supermarket.DAO;

import com.supermarket.ENTITY.ChiTietDonHang;
import com.supermarket.UTILS.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ChiTietDonHangDAO extends HeThongDAO<ChiTietDonHang, String> {

    String selectAll_SQL = "SELECT * FROM CHITIETDONHANG";
    String selectById_SQL = "SELECT * FROM CHITIETDONHANG WHERE MADH = ?";

    @Override
    public void insert(ChiTietDonHang entity) {
        String str = "INSERT INTO CHITIETDONHANG VALUES(?,?,?,?)";
        JdbcHelper.update(str, entity.getSoLuong(),entity.getThanhTien(),entity.getMaSP(),entity.getMaDH());
    }

    @Override
    public void update(ChiTietDonHang entity) {
    }

    @Override
    public void delete(String entity) {
    }

    @Override
    public List<ChiTietDonHang> selectAll() {
        return selectSql(selectAll_SQL);
    }

    @Override
    public ChiTietDonHang selectById(String key) {
        List<ChiTietDonHang> list = selectSql(selectById_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<ChiTietDonHang> selectSql(String sql, Object... args) {
        List<ChiTietDonHang> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                ChiTietDonHang entity = new ChiTietDonHang();
                entity.setMaDH(rs.getString("madh"));
                entity.setMaSP(rs.getString("masp"));
                entity.setSoLuong(rs.getInt("soluong"));
                entity.setThanhTien(rs.getFloat("thanhtien"));
                list.add(entity);
            }
        } catch (Exception e) {
            e.toString();
        }
        return list;
    }

    public List<ChiTietDonHang> selectByKeyword(String keyword) {
        return this.selectSql("SELECT * FROM CHITIETDONHANG WHERE MADH LIKE ?",  keyword );
    }
}

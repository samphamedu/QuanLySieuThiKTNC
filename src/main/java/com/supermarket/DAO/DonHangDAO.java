package com.supermarket.DAO;

import com.supermarket.ENTITY.DonHang;
import com.supermarket.UTILS.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DonHangDAO extends HeThongDAO<DonHang, String> {

    String delete = "DELETE DONHANG WHERE MADH = ?";
    String selectAll_SQL = "SELECT * FROM DONHANG";
    String selectAllCoTongTienSQL = "SELECT DONHANG.MADH, DONHANG.NGAYDATHANG, DONHANG.MAKH, SUM(CHITIETDONHANG.THANHTIEN)\n"
            + "FROM DONHANG INNER JOIN CHITIETDONHANG\n"
            + "ON DONHANG.MADH = CHITIETDONHANG.MADH\n"
            + "GROUP BY DONHANG.MADH, DONHANG.NGAYDATHANG, DONHANG.MAKH";
    String selectById_SQL = "SELECT DONHANG.MADH, DONHANG.NGAYDATHANG, DONHANG.MAKH, SUM(CHITIETDONHANG.THANHTIEN)\n"
            + "FROM DONHANG INNER JOIN CHITIETDONHANG\n"
            + "ON DONHANG.MADH = CHITIETDONHANG.MADH\n"
            + "WHERE DONHANG.MADH = ?\n"
            + "GROUP BY DONHANG.MADH, DONHANG.NGAYDATHANG, DONHANG.MAKH";

    @Override
    public void insert(DonHang entity) {
        String str = "INSERT INTO DONHANG (NGAYDATHANG, MAKH) VALUES (?,?)";
        JdbcHelper.update(str, entity.getNgayDatHang(),entity.getMaKH());
    }

    @Override
    public void update(DonHang entity) {
     }

    @Override
    public void delete(String entity) {
        JdbcHelper.update(delete, entity);
    }

    @Override
    public List<DonHang> selectAll() {
        return selectSql(selectAllCoTongTienSQL);
    }

    @Override
    public DonHang selectById(String key) {

        List<DonHang> list = selectSql(selectById_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);

    }

    @Override
    public List<DonHang> selectSql(String sql, Object... args) {
        List<DonHang> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                DonHang entity = new DonHang();
                entity.setMaDH(rs.getString("madh"));
                entity.setNgayDatHang(rs.getDate("ngaydathang"));
                entity.setMaKH(rs.getString("makh"));
                entity.setTongTien(rs.getFloat(4));
                list.add(entity);
            }
        } catch (Exception e) {
            e.toString();
        }
        return list;
    }
}

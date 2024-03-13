package com.supermarket.DAO;

import com.supermarket.ENTITY.HoaDon;
import com.supermarket.UTILS.JdbcHelper;
import com.supermarket.UTILS.MsgBox;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HoaDonDAO extends HeThongDAO<HoaDon, String> {

    @Override
    public void insert(HoaDon entity) {
        String sql = "INSERT INTO HOADON (NGAYLAPHD,MANV) VALUES(?, ?)";
        int k = JdbcHelper.update(sql, entity.getNgayLapHD(), entity.getMaNV());
    }

    @Override
    public void update(HoaDon entity) {
    }

    @Override
    public void delete(String MaHD) {
        String sql = "DELETE FROM HOADON WHERE MAHD = ?";
        int k = JdbcHelper.update(sql, MaHD);
        if (k != 0) {
            MsgBox.alert(null, "Xóa hóa đơn thành công");
        }
    }

    @Override
    public List<HoaDon> selectAll() {
        String sql = "SELECT HOADON.MAHD, HOADON.NGAYLAPHD, HOADON.MANV, SUM(CHITIETHOADON.THANHTIEN)\n"
                + "FROM HOADON INNER JOIN CHITIETHOADON\n"
                + "ON HOADON.MAHD = CHITIETHOADON.MAHD\n"
                + "GROUP BY HOADON.MAHD, HOADON.NGAYLAPHD, HOADON.MANV";
        return selectSql(sql);
    }

    @Override
    public HoaDon selectById(String MaHD) {
        String sql = "SELECT * FROM HOADON WHERE MAHD = ?";
        try {
            ResultSet rs = JdbcHelper.query(sql, MaHD);
            if (rs.next()) {
                HoaDon hd = new HoaDon(rs.getString(1), rs.getDate(2), rs.getString(3));
                return hd;
            }
            rs.getStatement().getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public List<HoaDon> selectSql(String sql, Object... args) {
        List<HoaDon> hoaDonList = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                HoaDon hd = new HoaDon(rs.getString(1), rs.getDate(2), rs.getString(3), rs.getFloat(4));
                hoaDonList.add(hd);
            }
            rs.getStatement().getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hoaDonList;
    }
}

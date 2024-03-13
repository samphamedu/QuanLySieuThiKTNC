package com.supermarket.DAO;

import java.util.List;
import com.supermarket.ENTITY.ChiTietHoaDon;
import com.supermarket.UTILS.JdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChiTietHoaDonDAO extends HeThongDAO<ChiTietHoaDon, String> {

    @Override
    public void insert(ChiTietHoaDon entity) {
        String sql = "INSERT INTO CHITIETHOADON VALUES (?, ?, ?, ?)";
        int k = JdbcHelper.update(sql, entity.getSoLuong(), entity.getThanhTien(), entity.getMaSP(), entity.getMaHD());
    }

    @Override
    public void update(ChiTietHoaDon entity) {
    }

    @Override
    public void delete(String entity) {
    }

    @Override
    public List<ChiTietHoaDon> selectAll() {
        String sql = "SELECT * FROM CHITIETHOADON";
        return selectSql(sql);
    }

    @Override
    public ChiTietHoaDon selectById(String MaHD) {
        String sql = "SELECT * FROM CHITIETHOADON WHERE MAHD = ?";
        try {
            ResultSet rs = JdbcHelper.query(sql, MaHD);
            if (rs.next()) {
                ChiTietHoaDon cthd = new ChiTietHoaDon(rs.getInt(1), rs.getFloat(2), rs.getString(4), rs.getString(3));
                return cthd;
            }
            rs.getStatement().getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietHoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public List<ChiTietHoaDon> selectSql(String sql, Object... args) {
        List<ChiTietHoaDon> chiTietHoaDonList = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                ChiTietHoaDon cthd = new ChiTietHoaDon(rs.getInt(1), rs.getFloat(2), rs.getString(4), rs.getString(3));
                chiTietHoaDonList.add(cthd);
            }
            rs.getStatement().getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietHoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return chiTietHoaDonList;
    }

    public List<ChiTietHoaDon> SelectByMaHD(String mahd) {
        return selectSql("SELECT * FROM CHITIETHOADON WHERE MAHD LIKE ?", mahd);
    }
}

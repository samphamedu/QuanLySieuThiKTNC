package com.supermarket.DAO;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.supermarket.UTILS.JdbcHelper;

public class ThongKeDAO {

    private String selectAll = "select YEAR(HOADON.NGAYLAPHD) as N'Năm', SUM(CHITIETHOADON.THANHTIEN) as N'Tổng Tiền',\n"
            + "MAX(CHITIETHOADON.SOLUONG) as N'Hoá Đơn Bán Nhiều Nhất', MIN(CHITIETHOADON.SOLUONG) as N'Hoá Đơn Bán Ít Nhất' from HOADON\n"
            + "inner join CHITIETHOADON on HOADON.MAHD = CHITIETHOADON.MAHD\n"
            + "inner join SANPHAM on SANPHAM.MASP = CHITIETHOADON.MASP\n"
            + "GROUP BY YEAR(HOADON.NGAYLAPHD)";

    private List<Object[]> getListOfArray(String sql, String[] col, Object... args) {
        try {
            List<Object[]> list = new ArrayList<>();
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                Object[] vals = new Object[col.length];
                for (int i = 0; i < col.length; i++) {
                    vals[i] = rs.getObject(col[i]);
                }
                list.add(vals);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Object[]> getThongKe() {
        String sql = selectAll;
        String[] col = {"Năm", "Tổng Tiền", "Hoá Đơn Bán Nhiều Nhất", "Hoá Đơn Bán Ít Nhất"};
        return getListOfArray(sql, col);
    }
}

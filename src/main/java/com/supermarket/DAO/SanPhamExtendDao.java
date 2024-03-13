package com.supermarket.DAO;

import com.supermarket.ENTITY.SanPhamExtend;
import com.supermarket.UI.KhachHangFrame;
import com.supermarket.UTILS.JdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SanPhamExtendDao extends HeThongDAO<SanPhamExtend, String>{
    String update = "UPDATE SANPHAM SET SOLUONG -= ? WHERE TENSP = ?";

    @Override
    public void insert(SanPhamExtend entity) {
    }

    @Override
    public void update(SanPhamExtend entity) {  
    }

    @Override
    public void delete(String entity) {
    }

    @Override
    public List<SanPhamExtend> selectAll() {
        String selectAll = "select masp, tensp, soluong, giathanh,cl.macl,cl.tencl from sanpham sp inner join chungloai cl on sp.macl = cl.macl";
        return selectSql(selectAll);
    }

    @Override
    public SanPhamExtend selectById(String key) {
        return null;
    }

    @Override
    public List<SanPhamExtend> selectSql(String sql, Object... args) {
        List<SanPhamExtend> spList = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql);
            while (rs.next()) {
                SanPhamExtend sp = new SanPhamExtend(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getFloat(4), rs.getString(5),rs.getString(6));
                spList.add(sp);
            }
            rs.getStatement().getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangFrame.class.getName()).log(Level.SEVERE, null, ex);
        }   
        return spList;
    }
    
}

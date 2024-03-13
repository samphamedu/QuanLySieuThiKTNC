package com.supermarket.DAO;

import com.supermarket.ENTITY.ChungLoai;
import com.supermarket.UTILS.JdbcHelper;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.util.List;

public class ChungLoaiDAO extends HeThongDAO<ChungLoai, String>{
    String insert = "insert into CHUNGLOAI values(?,?,?)";
    String update = "update CHUNGLOAI set TENCL = ?, MIEUTA = ? where MACL = ?";
    String delete = "delete CHUNGLOAI where MACL = ?";
    String selectall = "select * from CHUNGLOAI";
    String selectid = "select * from CHUNGLOAI where MACL = ?";

    @Override
    public void insert(ChungLoai entity) {
        JdbcHelper.update(insert, entity.getMaCL(), entity.getTenCL(), entity.getMieuTa());
    }

    @Override
    public void update(ChungLoai entity) {
        JdbcHelper.update(update, entity.getTenCL(), entity.getMieuTa(), entity.getMaCL());
    }

    @Override
    public void delete(String entity) {
        JdbcHelper.update(delete, entity);
    }

    @Override
    public List<ChungLoai> selectAll() {
        return selectSql(selectall);
    }

    @Override
    public ChungLoai selectById(String key) {
        List<ChungLoai> list = selectSql(selectid, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<ChungLoai> selectSql(String sql, Object... args) {
         List<ChungLoai> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {                
                ChungLoai cl = new ChungLoai();
                cl.setMaCL(rs.getString("macl"));
                cl.setTenCL(rs.getString("tencl"));
                cl.setMieuTa(rs.getString("mieuta"));
                list.add(cl);
            }
        } catch (Exception e) {
            e.toString();
        }
        return list;
    }
}
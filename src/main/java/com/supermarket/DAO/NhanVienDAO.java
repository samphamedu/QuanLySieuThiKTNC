package com.supermarket.DAO;

import com.supermarket.ENTITY.NhanVien;
import com.supermarket.UTILS.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class NhanVienDAO extends HeThongDAO<NhanVien, String> {

    String insert = "INSERT INTO NHANVIEN VALUES (?,?,?,?,?,0)";
    String delete = "DELETE NHANVIEN WHERE MANV = ?";
    String update = "UPDATE NHANVIEN SET MATKHAU = ?, HOTEN = ?, GIOITINH = ?, NGAYSINH = ? WHERE MANV = ?";
    String updatemk = "UPDATE NHANVIEN  SET MATKHAU = ? WHERE MANV = ?";
    String selectAll = "SELECT * FROM NHANVIEN";
    String selectById = "SELECT * FROM NHANVIEN WHERE MANV = ?";

    @Override
    public void insert(NhanVien entity) {
        JdbcHelper.update(insert, entity.getMaNV(), entity.getMatKhau(), entity.getHoTen(), entity.isGioiTinh(), entity.getNgaySinh());
    }

    @Override
    public void update(NhanVien entity) {
        JdbcHelper.update(update, entity.getMatKhau(), entity.getHoTen(), entity.isGioiTinh(), entity.getNgaySinh(), entity.getMaNV());
    }
    
    public void updatemk(String mknew, NhanVien entity){
        JdbcHelper.update(updatemk, mknew, entity.getMatKhau());
    }

    @Override
    public void delete(String entity) {
        JdbcHelper.update(delete, entity);
    }

    @Override
    public List<NhanVien> selectAll() {
        return selectSql(selectAll);
    }

    @Override
    public NhanVien selectById(String key) {
        List<NhanVien> list = selectSql(selectById, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<NhanVien> selectSql(String sql, Object... args) {
        List<NhanVien> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                NhanVien entity = new NhanVien();
                entity.setMaNV(rs.getString(1));
                entity.setMatKhau(rs.getString(2));
                entity.setHoTen(rs.getString(3));
                entity.setGioiTinh(rs.getBoolean(4));
                entity.setNgaySinh(rs.getDate(5));
                entity.setVaiTro(rs.getBoolean(6));
                list.add(entity);
            }
        } catch (Exception e) {
            e.toString();
        }
        return list;
    }
}

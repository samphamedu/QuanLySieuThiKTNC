package com.supermarket.DAO;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import com.supermarket.ENTITY.NhanVien;

public class NhanVienDAOTest {
	private NhanVienDAO dao;

	@BeforeClass
	public static void m1() {
		System.out.println("Bắt đầu quá trình test NhanVienDAOTest");
	}

	@Before
	public void init() {
		dao = new NhanVienDAO();
		System.out.println("Chuẩn bị test");
	}

	@Test
	public void insertTest1() {
		NhanVienDAO nvdao = new NhanVienDAO();
		NhanVien nvTest = new NhanVien("nvTest1", "nvTest1", "Nguyễn Văn A", true, new Date());
		nvdao.insert(nvTest);
		NhanVien nv = nvdao.selectById("nvTest1");
		assertNotNull(nv);
		System.out.println("TestCase insertTest1 thực hiện thành công");
	}
	@Test
	public void insertTest2() {
		NhanVienDAO nvdao = new NhanVienDAO();
		NhanVien nvTest = new NhanVien("nvTest2", "nvTest2", "Lê Thị B", false, new Date());
		nvdao.insert(nvTest);
		NhanVien nv = nvdao.selectById("nvTest2");
		assertNotNull(nv);
		System.out.println("TestCase insertTest2 thực hiện thành công");
	}
	@Test
	public void updateTest1() {
		NhanVienDAO nvdao = new NhanVienDAO();
		NhanVien nvTest = new NhanVien("nvTest1", "nvTest1", "Nguyễn Văn C (Updated)", true, new Date());
		nvdao.update(nvTest);
		List<NhanVien> nv = nvdao.selectSql("SELECT * FROM NHANVIEN WHERE MANV = ? and HOTEN like  ?", "nvTest1","%Updated%");
		assertNotNull(nv);
		System.out.println("TestCase updateTest1 thực hiện thành công");
	}

	@Test
	public void updateTest2() {
		NhanVienDAO nvdao = new NhanVienDAO();
		NhanVien nvTest = new NhanVien("nvTest2", "nvTest2", "Lê Thị D (Updated)", false, new Date());
		nvdao.update(nvTest);
		List<NhanVien> nv = nvdao.selectSql("SELECT * FROM NHANVIEN WHERE MANV = ? and HOTEN like  ?", "nvTest2","%Updated%");
		assertNotNull(nv);
		System.out.println("TestCase updateTest2 thực hiện thành công");
	}
	@Test
	public void updateMKTest1() {
		NhanVienDAO nvdao = new NhanVienDAO();
		NhanVien nvTest = new NhanVien("nvTest1", "nvTest1", "Nguyễn Văn C (Updated)", true, new Date());
		String newPassword = "testPwUpdate1";
		nvdao.updatemk(newPassword,nvTest);
		List<NhanVien> nv = nvdao.selectSql("SELECT * FROM NHANVIEN WHERE MANV = ? and MATKHAU =  ?", "nvTest1",newPassword);
		assertNotNull(nv);
		System.out.println("TestCase updateMKTest1 thực hiện thành công");
	}
	@Test
	public void updateMKTest2() {
		NhanVienDAO nvdao = new NhanVienDAO();
		NhanVien nvTest = new NhanVien("nvTest2", "nvTest2", "Lê Thị D (Updated)", true, new Date());
		String newPassword = "testPwUpdate2";
		nvdao.updatemk(newPassword,nvTest);
		List<NhanVien> nv = nvdao.selectSql("SELECT * FROM NHANVIEN WHERE MANV = ? and MATKHAU =  ?", "nvTest2",newPassword);
		assertNotNull(nv);
		System.out.println("TestCase updateMKTest2 thực hiện thành công");
	}
	@Test
	public void selectALLTest() {
		NhanVienDAO nvdao = new NhanVienDAO();
		List<NhanVien> nv = nvdao.selectAll();
		assertNotNull(nv);
		System.out.println("TestCase selectALLTest thực hiện thành công");
	}
	@Test
	public void selectByIdTest() {
		NhanVienDAO nvdao = new NhanVienDAO();
		String maNV = "Gunsmoke";
		NhanVien nv = nvdao.selectById(maNV);
		assertNotNull(nv);
		System.out.println("TestCase selectByIdTest thực hiện thành công");
	}
	@Test
	public void deleteTest1() {
		NhanVienDAO nvdao = new NhanVienDAO();
        String maNV = "nvTest1";
        nvdao.delete(maNV);
        NhanVien nv = nvdao.selectById(maNV);
        assertNull(nv);  
        System.out.println("TestCase deleteTeset1 thực hiện thành công");
	}
	
	@Test
	public void deleteTest2() {
		NhanVienDAO nvdao = new NhanVienDAO();
        String maNV = "nvTest2";
        nvdao.delete(maNV);
        NhanVien nv = nvdao.selectById(maNV);
        assertNull(nv);  
        System.out.println("TestCase deleteTeset2 thực hiện thành công");
	}

	@After
	public void tearDown() {
		dao = null;
		System.out.println("Kết thúc test");
	}

	@AfterClass
	public static void m2() {
		System.out.println("Kết thúc quá trình test NhanVienDAOTest \n\n\n");
	}

}

package com.supermarket.DAO;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.supermarket.ENTITY.DonHang;
import com.supermarket.ENTITY.KhachHang;

public class KhachHangDAOTest {

	private KhachHangDAO dao;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Bắt đầu quá trình test KhachHangDAOTest");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Kết thúc quá trình test KhachHangDAOTest \n\n\n");
	}

	@Before
	public void setUp() throws Exception {
		dao = new KhachHangDAO();
		System.out.println("Chuẩn bị test");
	}

	@After
	public void tearDown() throws Exception {
		dao = null;
		System.out.println("Kết thúc test");
	}

	@Test
	public void insertTest1() {
		KhachHangDAO khdao = new KhachHangDAO();
		KhachHang kh = new KhachHang("KH015", "sadaa", "Le Thinh Phat", true, new Date(), new Date());
		try {
			khdao.insert(kh);
		} catch (Exception e) {
		}
		KhachHang kh1 = khdao.selectById("KH015");
		assertNotNull(kh1);
		System.out.println("TestCase insertTest1 thực hiện thành công");
	}

	@Test
	public void insertTest2() {
		KhachHangDAO khdao = new KhachHangDAO();
		KhachHang kh = new KhachHang("KH016", "sadaa", "Le Thinh Phat", true, new Date(), new Date());
		try {
			khdao.insert(kh);
		} catch (Exception e) {
		}
		KhachHang kh1 = khdao.selectById("KH016");
		assertNotNull(kh1);
		System.out.println("TestCase insertTest2 thực hiện thành công");
	}

	@Test
	public void updateTest1() {
		KhachHangDAO khdao = new KhachHangDAO();
		KhachHang kh = new KhachHang("KH015", "sadaasdasdsass", "Le Thinh Phat", true, new Date(), new Date());
		khdao.update(kh);
		KhachHang kh1 = khdao.selectById("KH015");
		assertEquals("sadaasdasdsass", kh1.getMatKhau());
		System.out.println("TestCase updateTest1 thực hiện thành công");
	}

	@Test
	public void updateTest2() {
		KhachHangDAO khdao = new KhachHangDAO();
		KhachHang kh = new KhachHang("KH015", "sadaasdasdsass", "Le Thinh Phatttt", true, new Date(), new Date());
		khdao.update(kh);
		KhachHang kh1 = khdao.selectById("KH015");
		assertEquals("Le Thinh Phatttt", kh1.getTenKH());
		System.out.println("TestCase updateTest2 thực hiện thành công");
	}

	@Test
	public void updateMKTest1() {
		KhachHangDAO khdao = new KhachHangDAO();
		String newmk = "abc";
		KhachHang kh = khdao.selectById("KH011");
		khdao.updatemk(newmk, kh);
		KhachHang kh1 = khdao.selectById("KH011");
		assertEquals("abc", kh1.getMatKhau());
		System.out.println("TestCase updateMKTest1 thực hiện thành công");
	}

	@Test
	public void updateMKTest2() {
		KhachHangDAO khdao = new KhachHangDAO();
		String newmk = "xyz";
		KhachHang kh = khdao.selectById("KH010");
		khdao.updatemk(newmk, kh);
		KhachHang kh1 = khdao.selectById("KH010");
		assertEquals("xyz", kh1.getMatKhau());
		System.out.println("TestCase updateMKTest2 thực hiện thành công");
	}

	@Test
	public void selectByIdTest1() {
		KhachHangDAO khdao = new KhachHangDAO();
		String makh = "KH015";
		KhachHang kh = khdao.selectById(makh);
		assertEquals(makh, kh.getMaKH());
		System.out.println("TestCase selectByIdTest1 thực hiện thành công");
	}

	@Test
	public void selectByIdTest2() {
		KhachHangDAO khdao = new KhachHangDAO();
		String makh = "KH016";
		KhachHang kh = khdao.selectById(makh);
		assertEquals(makh, kh.getMaKH());
		System.out.println("TestCase selectByIdTest2 thực hiện thành công");
	}
}

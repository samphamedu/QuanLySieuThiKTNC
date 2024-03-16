package com.supermarket.DAO;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.supermarket.ENTITY.DonHang;

public class DonHangDAOTest {

	private DonHangDAO dao;
	
	@BeforeClass
	public static void m1() {
		System.out.println("Bắt đầu quá trình test DonHangDAOTest");
	}
	
	@Before
	public void init() {
		dao = new DonHangDAO();
		System.out.println("Chuẩn bị test");
	}
	
	@Test
	public void deleteTest1() {
		DonHangDAO dhdao = new DonHangDAO();
        String maDH = "DH002";
        dhdao.delete(maDH);
        DonHang dh = dhdao.selectById(maDH);
        assertNull(dh);  
        System.out.println("TestCase deleteTeset1 thực hiện thành công");
	}
	
	@Test
	public void deleteTest2() {
		DonHangDAO dhdao = new DonHangDAO();
        String maDH = "DH003";
        dhdao.delete(maDH);
        DonHang dh = dhdao.selectById(maDH);
        assertNull(dh);   
        System.out.println("TestCase deleteTeset2 thực hiện thành công");
	}
	
	@After
	public void tearDown() {
		dao = null;
		System.out.println("Kết thúc test");
	}
	
	@AfterClass
	public static void m2() {
		System.out.println("Kết thúc quá trình test DonHangDAOTest \n\n\n");
	}

}

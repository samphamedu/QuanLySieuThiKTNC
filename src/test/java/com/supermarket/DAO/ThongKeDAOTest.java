package com.supermarket.DAO;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ThongKeDAOTest {
	private ThongKeDAO dao;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Bắt đầu quá trình test KhachHangDAOTest");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Kết thúc quá trình test ThongKeDAOTest \n\n\n");
	}

	@Before
	public void setUp() throws Exception {
		dao = new ThongKeDAO();
		System.out.println("Chuẩn bị test");
	}

	@After
	public void tearDown() throws Exception {
		dao = null;
		System.out.println("Kết thúc test");
	}

	@Test
	public void getThongKeTest1() {
		assertNotNull(dao.getThongKe());
		System.out.println("TestCase getThongKeTest1 thực hiện thành công");
	}
	@Test
	public void getThongKeTest2() {
		assertNotNull(dao.getThongKe());
		System.out.println("TestCase getThongKeTest2 thực hiện thành công");
	}
}

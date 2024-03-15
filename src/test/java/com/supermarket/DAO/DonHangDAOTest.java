package com.supermarket.DAO;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.supermarket.ENTITY.DonHang;

public class DonHangDAOTest {
	//test
	private DonHangDAO dao;
	
	@Before
	public void init() {
		dao = new DonHangDAO();
	}
	
	@Test
	public void test() {
		DonHangDAO dhdao = new DonHangDAO();
        String maDH = "DH002";
        dhdao.delete(maDH);
        DonHang dh = dhdao.selectById(maDH);
        assertNull(dh);   
	}
	
	@After
	public void tearDown() {
		dao = null;
	}

}

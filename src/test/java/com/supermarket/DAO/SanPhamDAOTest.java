package com.supermarket.DAO;

import com.supermarket.ENTITY.SanPham;
import org.junit.*;
import org.junit.runners.MethodSorters;

import java.util.List;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SanPhamDAOTest {
    private SanPhamDAO sp;

    @BeforeClass
    public static void m1(){
        System.out.println("Start Test class SanPhamDAO");
    }

    @Before
    public void init(){
        sp = new SanPhamDAO();
        System.out.println("Prepare for test");
    }

    @Test
    public void A(){
        SanPhamDAO spdao = new SanPhamDAO();
        SanPham sp = new SanPham();
        sp.setMaSP("ID_Test1");
        sp.setTenSP("Name_Test1");
        sp.setSoLuong(100);
        sp.setGiaThanh(1187.32f);
        sp.setMaCL("CL001");
        spdao.insert(sp);
        SanPham sTest =  spdao.selectById(sp.getMaSP());
        Assert.assertEquals(sp.getMaSP(),sTest.getMaSP());
        System.out.println("Test case insert 1 complete");
    }

    @Test
    public void B(){
        SanPhamDAO spdao = new SanPhamDAO();
        SanPham sp = new SanPham();
        sp.setMaSP("ID_Test2");
        sp.setTenSP("Name_Test2");
        sp.setSoLuong(199);
        sp.setGiaThanh(142.4f);
        sp.setMaCL("CL002");
        spdao.insert(sp);
        SanPham sTest =  spdao.selectById(sp.getMaSP());
        Assert.assertEquals(sp.getMaSP(),sTest.getMaSP());
        System.out.println("Test case insert 2 complete");
    }

    @Test
    public void C(){
        SanPhamDAO dao = new SanPhamDAO();
        SanPham sp = dao.selectById("ID_Test1");
        sp.setTenSP("Update SP1");
        sp.setGiaThanh(1432f);
        sp.setSoLuong(9);
        dao.update(sp);
        SanPham spcompareto = dao.selectById("ID_Test1");
        Assert.assertEquals(sp.getTenSP(),spcompareto.getTenSP());
        System.out.println("Test case update 1 complete");
    }

    @Test
    public void D(){
        SanPhamDAO dao = new SanPhamDAO();
        SanPham sp = dao.selectById("ID_Test2");
        sp.setTenSP("Update SP2");
        sp.setGiaThanh(1432f);
        sp.setSoLuong(9);
        dao.update(sp);
        SanPham spcompareto = dao.selectById("ID_Test2");
        Assert.assertEquals(sp.getTenSP(),spcompareto.getTenSP());
        System.out.println("Test case update 2 complete");
    }

    @Test
    public void E(){
        SanPhamDAO dao = new SanPhamDAO();
        dao.delete("ID_Test1");
        SanPham sp = dao.selectById("ID_Test1");
        Assert.assertNull(sp);
        System.out.println("Test case delete 1 complete");
    }

    @Test
    public void F(){
        SanPhamDAO dao = new SanPhamDAO();
        dao.delete("ID_Test2");
        SanPham sp = dao.selectById("ID_Test2");
        Assert.assertNull(sp);
        System.out.println("Test case delete 2 complete");
    }

    @Test
    public void G(){
        SanPhamDAO dao = new SanPhamDAO();
        List<SanPham> listSP = dao.selectAll();
        SanPham sp1 = listSP.get(5);
        SanPham sp2 = dao.selectById(sp1.getMaSP());
        Assert.assertEquals(sp1.getMaSP(),sp2.getMaSP());
        System.out.println("Test case function find product by Id1 complete");
    }

    @Test
    public void H(){
        SanPhamDAO dao = new SanPhamDAO();
        List<SanPham> listSP = dao.selectAll();
        SanPham sp1 = listSP.get(7);
        SanPham sp2 = dao.selectById(sp1.getMaSP());
        Assert.assertEquals(sp1.getMaSP(),sp2.getMaSP());
        System.out.println("Test case function find product by Id2 complete");
    }

    @Test
    public void J(){
        SanPhamDAO dao = new SanPhamDAO();
        List<SanPham> listSP = dao.selectAll();
        List<SanPham> listDS = dao.selectByKeyword(listSP.get(3).getTenSP());
        Assert.assertNotNull(listDS);
        System.out.println("Test case function find product by name complete");
    }

    @After
    public void tearDown(){
        sp = null;
        System.out.println("Finish test");
    }

    @AfterClass
    public static void fn(){
        System.out.println("Finish all test");
    }

}

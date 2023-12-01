/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.labti.springHibernate.view;

import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Haryo
 */
public class ViewMahasiswaTest {
    
    public ViewMahasiswaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class ViewMahasiswa.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ViewMahasiswa.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAlamat method, of class ViewMahasiswa.
     */
    @Test
    public void testGetAlamat() {
        System.out.println("getAlamat");
        ViewMahasiswa instance = new ViewMahasiswa();
        JTextArea expResult = null;
        JTextArea result = instance.getAlamat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAlamat method, of class ViewMahasiswa.
     */
    @Test
    public void testSetAlamat() {
        System.out.println("setAlamat");
        JTextArea Alamat = null;
        ViewMahasiswa instance = new ViewMahasiswa();
        instance.setAlamat(Alamat);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKelas method, of class ViewMahasiswa.
     */
    @Test
    public void testGetKelas() {
        System.out.println("getKelas");
        ViewMahasiswa instance = new ViewMahasiswa();
        JTextField expResult = null;
        JTextField result = instance.getKelas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setKelas method, of class ViewMahasiswa.
     */
    @Test
    public void testSetKelas() {
        System.out.println("setKelas");
        JTextField Kelas = null;
        ViewMahasiswa instance = new ViewMahasiswa();
        instance.setKelas(Kelas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNama method, of class ViewMahasiswa.
     */
    @Test
    public void testGetNama() {
        System.out.println("getNama");
        ViewMahasiswa instance = new ViewMahasiswa();
        JTextField expResult = null;
        JTextField result = instance.getNama();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNama method, of class ViewMahasiswa.
     */
    @Test
    public void testSetNama() {
        System.out.println("setNama");
        JTextField Nama = null;
        ViewMahasiswa instance = new ViewMahasiswa();
        instance.setNama(Nama);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNpm method, of class ViewMahasiswa.
     */
    @Test
    public void testGetNpm() {
        System.out.println("getNpm");
        ViewMahasiswa instance = new ViewMahasiswa();
        JTextField expResult = null;
        JTextField result = instance.getNpm();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNpm method, of class ViewMahasiswa.
     */
    @Test
    public void testSetNpm() {
        System.out.println("setNpm");
        JTextField Npm = null;
        ViewMahasiswa instance = new ViewMahasiswa();
        instance.setNpm(Npm);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUmur method, of class ViewMahasiswa.
     */
    @Test
    public void testGetUmur() {
        System.out.println("getUmur");
        ViewMahasiswa instance = new ViewMahasiswa();
        JTextField expResult = null;
        JTextField result = instance.getUmur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUmur method, of class ViewMahasiswa.
     */
    @Test
    public void testSetUmur() {
        System.out.println("setUmur");
        ViewMahasiswa instance = new ViewMahasiswa();
        instance.setUmur();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTabel method, of class ViewMahasiswa.
     */
    @Test
    public void testGetTabel() {
        System.out.println("getTabel");
        ViewMahasiswa instance = new ViewMahasiswa();
        JTable expResult = null;
        JTable result = instance.getTabel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTabel method, of class ViewMahasiswa.
     */
    @Test
    public void testSetTabel() {
        System.out.println("setTabel");
        JTable Tabel = null;
        ViewMahasiswa instance = new ViewMahasiswa();
        instance.setTabel(Tabel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

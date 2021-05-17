/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management.system;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Asus
 */
public class LoadingTest {
    
    public LoadingTest() {
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
     * Test of main method, of class Loading.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Loading.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUploading method, of class Loading.
     */
    @Test
    public void testSetUploading() {
        System.out.println("setUploading");
        Loading instance = new Loading();
        instance.setUploading();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of run method, of class Loading.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        Loading instance = new Loading();
        instance.run();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVisible method, of class Loading.
     */
    @Test
    public void testSetVisible() {
        System.out.println("setVisible");
        boolean b = false;
        Loading instance = new Loading();
        instance.setVisible(b);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

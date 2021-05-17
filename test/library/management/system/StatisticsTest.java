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
public class StatisticsTest {
    
    public StatisticsTest() {
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
     * Test of main method, of class Statistics.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Statistics.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of issueBook method, of class Statistics.
     */
    @Test
    public void testIssueBook() {
        System.out.println("issueBook");
        Statistics instance = new Statistics();
        instance.issueBook();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnBook method, of class Statistics.
     */
    @Test
    public void testReturnBook() {
        System.out.println("returnBook");
        Statistics instance = new Statistics();
        instance.returnBook();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

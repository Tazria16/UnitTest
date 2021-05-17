/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management.system;

import java.awt.event.ActionEvent;
import java.sql.SQLException;
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
public class Login_userTest {

   Login_user p;
    
    public Login_userTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
       p = new Login_user();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of actionPerformed method, of class Login_user.
     * @throws java.sql.SQLException
     */
   // @Test
    //public void testlogin_user() throws SQLException {
      //  assertEquals(true, p.Login_user("tazria","123"));
    //}

    /**
     * Test of actionPerformed method, of class Login_user.
     */
    //@Test
    //public void testActionPerformed() {
      //  System.out.println("actionPerformed");
        //ActionEvent ae = null;
        //Login_user instance = new Login_user();
        //instance.actionPerformed(ae);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    //}

    /**
     * Test of main method, of class Login_user.
     */
    //@Test
    //public void testMain() {
      //  System.out.println("main");
        //String[] args = null;
        //Login_user.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    //}

    /**
     * Test of Login_user method, of class Login_user.
     * @throws java.lang.Exception
     */
    @Test
    public void testLogin_user() throws Exception {
        System.out.println("Login_user");
        String a = "";
        String b = "";
        Login_user instance = new Login_user();
        boolean expResult = false;
        boolean result = instance.Login_user(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
   
    
}

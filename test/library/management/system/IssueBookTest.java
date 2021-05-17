/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management.system;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Asus
 */
public class IssueBookTest {
    IssueBook writer;
    public IssueBookTest() {
        
    }
    
    @Before
    public void setUp() {
        writer=new IssueBook();
    }

  

    @Test
    public void testIssuebook() {
        assertEquals(true,writer.issuebook("Tagore"));
    }
    
}

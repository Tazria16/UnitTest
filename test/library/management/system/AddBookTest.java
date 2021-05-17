/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management.system;

import java.awt.event.ActionEvent;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Asus
 */
public class AddBookTest {
    AddBook b;
    public AddBookTest() {
        
    }
    
    @Before
    public void setUp() {
        b=new AddBook();
    }

    

    @Test
    public void testBook() {
        assertEquals(true,b.book(953));
    }
    
}

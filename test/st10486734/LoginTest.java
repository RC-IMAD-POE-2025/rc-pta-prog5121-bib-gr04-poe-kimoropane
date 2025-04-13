/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package st10486734;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RC_Student_lab
 */
public class LoginTest {
    
    public LoginTest() {
    }

    @Test

    public void testCheckUserName_Valid() {
        Login test = new Login();
        boolean expected = true;
        boolean actual = test.checkUserName("kyl_1");

        assertEquals("Expected 'kyl_1' to be valid", expected, actual);
    }

    @Test
    public void testCheckUserName_Invalid() {
        Login test = new Login();
        boolean expected = false;
        boolean actual = test.checkUserName("kyle!!!!!!");

        assertEquals("Expected 'kyle!!!!!!' to be invalid", expected, actual);
    }

    
}

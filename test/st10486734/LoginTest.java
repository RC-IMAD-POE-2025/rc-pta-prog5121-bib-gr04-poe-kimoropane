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
    Login test = new Login();
    @Test
    public void testUsernameSetter_Valid() {
        
        String expected = "Username successfully captured";
        String actual = test.usernameSetter("kyl_1");

        assertEquals(expected, actual);
    }

    @Test
    public void testUsernameSetter_Invalid() {
        
        String expected = "Username is not correclty formatted, please ensure that your username contains an underscore and is no more than five";
        String actual = test.usernameSetter("kyle!!!!!@");

        assertEquals(expected, actual);
    }
    
    @Test
    public void testPasswordSetter_Valid(){
        String expected ="Password successfully captured" ;
        String actual = test.passwordSetter("Ch&&sec@ke99!");
        assertEquals(expected , actual);
    }
    
    @Test
    public void testPasswordSetter_Invalid(){
        String expected = "Password is not correctly formatted please ensure that the password contains at least eight characters, a capital letter, a number , and a special character";
        String actual = test.passwordSetter("password");
        assertEquals(expected , actual);
    }
    
    @Test 
    public void testCellPhoneNumber_Valid (){
        String expected = "Phone number successfully captured" ;
        String actual = test.phoneSetter("+27838968976");
        assertEquals(expected , actual);
    }
    
    @Test 
    public void testCellPhoneNumber_Invalid (){
        String expected = "Phone number is not correctly formatted. Ensure it includes a country code, followed by no more than 10 digits." ;
        String actual = test.phoneSetter("08966553");
        assertEquals(expected , actual);
    }
    Login login = new Login();
    @Test
    public void testLoginUser_CorrectCredentials() {
        
        login.usernameSetter("kyl_1") ;
        login.passwordSetter("Passw0rd@");
        login.login_username = "kyl_1";
        login.login_password = "Passw0rd@";

        boolean result = login.loginUser();
        assertTrue(result);
       
    }

    @Test
    public void testLoginUser_WrongCredentials() {
   
        login.usernameSetter("kyl_1") ;
        login.passwordSetter("Passw0rd@");
        login.login_username = "Wrong";
        login.login_password = "wrongP@ssword";

        boolean result = login.loginUser();
        assertTrue(result);
       
    }
    
    @Test 
    public void testUsername(){
           
        login.usernameSetter("kyl_1") ;
        boolean result  = login.checkUserName();
        assertTrue(result);  
    }
    @Test
    public void testUsername_invalid(){
           
        login.usernameSetter("kyl_12") ;
        boolean result  = login.checkUserName();
        assertTrue(result);  
    }
    @Test
    public void testCheckPassword(){
        login.passwordSetter("Zack@823") ;
        boolean result  = login.checkPasswordComplexity();
        
        assertTrue(result);  
    }
    @Test
    public void testCheckPassword_invalid(){
           
        login.passwordSetter("password") ;
        boolean result  = login.checkPasswordComplexity();
        assertTrue(result);  
    }
    
        @Test
    public void testCheckCellPhone(){
        login.phoneSetter("+27768699754");
        boolean result  = login.checkCellPhoneNumber();
        
        assertTrue(result);  
    }
    @Test
    public void testCheckCellPhone_invalid(){
           
        login.phoneSetter("0768699754");
        boolean result  = login.checkCellPhoneNumber();
        assertTrue(result);  
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st10486734;

/**
 *
 * @author RC_Student_lab
 */
public class Login {
    
   boolean checkUserName(String username)
   {
       if(username.length() <= 5 && username.contains("_"))
       {
           return true;
       }
       else{
           return false;
       }
   }
   
   boolean checkPasswordComplaxity (String password){
      String password_pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
      if(password.length() >= 8 && password.matches(password_pattern) )
      {
          return true;
      }
      else{
      return false;}   
   }
   
   }
 
}

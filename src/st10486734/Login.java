/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st10486734;

/**
 *
 * @author RC_Student_lab
 */
public class Login extends RegisterUI{
  
   private boolean loginStatus;
   
   boolean checkUserName()
   {
      return getUsername() != null;
      
   }
   
   boolean checkPasswordComplexity (){
        return getPassword() != null;
   }
   
   boolean checkCellPhoneNumber(){
       return getPhone() != null;
   }
   
   String registerUser(String username ,String phoneNumber , String password ){
       if(!this.checkUserName())
       {
         return this.usernameSetter(username) ;
       }
       else if(!this.checkPasswordComplexity())
       {
           return this.passwordSetter(password);
       }
       else if(!this.checkCellPhoneNumber())
       {
           return this.phoneSetter(phoneNumber);
       }
       else {
            return "Welcome" + this.getFirst_name() + " , "+this.getLast_name() + "it is greate to see you again.";
       }      
   }
   
   boolean loginUser ()
   {
       loginStatus = this.getUsername().equals(this.login_username) && this.getPassword().equals(this.login_password);
       return this.getUsername().equals(this.login_username) && this.getPassword().equals(this.login_password);
   }
   
   String returnLoginStatus()
   {
       if(this.loginStatus)
       {
           return "Welcome" + this.getFirst_name() + " , "+this.getLast_name() + "it is greate to see you again.";
       }
       else{
           return "Username or password incorrect, please try again";
       }
       
   }
   
   
 
}

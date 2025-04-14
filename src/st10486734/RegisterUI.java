/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package st10486734;

import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class RegisterUI extends javax.swing.JFrame {

    private String username,password , phone , first_name , last_name ;
    String login_username , login_password;;
    
    public RegisterUI() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        message = new javax.swing.JDialog();
        jOptionPane1 = new javax.swing.JOptionPane();
        jLabel1 = new javax.swing.JLabel();
        register_container = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        First_name = new javax.swing.JTextField();
        Last_name_label = new javax.swing.JLabel();
        Last_name = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        register_button = new javax.swing.JButton();
        register_title = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        username_input = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        phone_input = new javax.swing.JTextField();
        password_input = new javax.swing.JPasswordField();
        Login_container = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        username_input1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        login_button = new javax.swing.JButton();
        register_title1 = new javax.swing.JLabel();
        password_input1 = new javax.swing.JPasswordField();

        javax.swing.GroupLayout messageLayout = new javax.swing.GroupLayout(message.getContentPane());
        message.getContentPane().setLayout(messageLayout);
        messageLayout.setHorizontalGroup(
            messageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        messageLayout.setVerticalGroup(
            messageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Welcome to our chat app");

        jLabel3.setText("First Name:");

        First_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                First_nameActionPerformed(evt);
            }
        });

        Last_name_label.setText("Last Namer:");

        Last_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Last_nameActionPerformed(evt);
            }
        });

        jLabel6.setText("Password:");

        register_button.setBackground(new java.awt.Color(105, 255, 255));
        register_button.setText("Register");
        register_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_buttonActionPerformed(evt);
            }
        });

        register_title.setText("Register");

        jLabel7.setText("Username:");

        username_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_inputActionPerformed(evt);
            }
        });

        jLabel9.setText("Phone number:");

        phone_input.setText("+27000000000");
        phone_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phone_inputActionPerformed(evt);
            }
        });

        password_input.setText("jPasswordField1");
        password_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_inputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout register_containerLayout = new javax.swing.GroupLayout(register_container);
        register_container.setLayout(register_containerLayout);
        register_containerLayout.setHorizontalGroup(
            register_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(register_containerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(register_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(First_name)
                    .addComponent(Last_name, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(Last_name_label, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(register_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(register_title, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username_input)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phone_input, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(password_input))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        register_containerLayout.setVerticalGroup(
            register_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(register_containerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(register_title)
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(First_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Last_name_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Last_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(username_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phone_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(password_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(register_button)
                .addGap(24, 24, 24))
        );

        jLabel5.setText("Username:");

        username_input1.setText("Zac_");
        username_input1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_input1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Password:");

        login_button.setBackground(new java.awt.Color(105, 255, 255));
        login_button.setText("Login");
        login_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_buttonActionPerformed(evt);
            }
        });

        register_title1.setText("Login");

        password_input1.setText("jPasswordField1");
        password_input1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_input1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Login_containerLayout = new javax.swing.GroupLayout(Login_container);
        Login_container.setLayout(Login_containerLayout);
        Login_containerLayout.setHorizontalGroup(
            Login_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Login_containerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Login_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username_input1, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(login_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(register_title1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password_input1))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        Login_containerLayout.setVerticalGroup(
            Login_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Login_containerLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(register_title1)
                .addGap(22, 22, 22)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(username_input1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password_input1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(login_button)
                .addGap(80, 80, 80))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(register_container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(Login_container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Login_container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(register_container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    String getUsername(){
        return this.username;
    }
    String getPassword(){
        return this.password;
    }
    String getPhone(){
        return this.phone;
    }
    String getFirst_name(){
        return first_name;
    }
    
    String getLast_name(){
        return last_name;
    }
    
    String usernameSetter(String username)
    {
        if(username.length() <= 5 && username.contains("_")){
           this.username = username;
            return "Username successfully captured";
        }
        else{
            return "Username is not correclty formatted, please ensure that your username contains an underscore and is no more than five";

        }

    }
   String passwordSetter (String password){
      String password_pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
      if(password.length() >= 8 && password.matches(password_pattern) )
      {
          this.password = password;
          return "Password successfully captured";
      }
      else{
          return "Password is not correctly formatted please ensure that the password contains at least eight characters, a capital letter, a number , and a special character";
      }
      
  }
   String phoneSetter(String phone) {

        String phonePattern = "^\\+\\d{1,4}\\s?\\d{1,10}$";

        if (phone.matches(phonePattern)) {
            this.phone = phone;
            return "Phone number successfully captured";
        } else {
            
            return "Phone number is not correctly formatted. Ensure it includes a country code, followed by no more than 10 digits.";
        }
    }
   
   
    
    private void First_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_First_nameActionPerformed
     String lastName = First_name.getText();
     this.first_name = lastName;  
        
    }//GEN-LAST:event_First_nameActionPerformed

    private void Last_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Last_nameActionPerformed
        // TODO add your handling code here:
     String lastName = Last_name.getText();
     this.last_name = lastName;  
    }//GEN-LAST:event_Last_nameActionPerformed
    
    private void register_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_buttonActionPerformed
        // TODO add your handling code here:
        this.username_inputActionPerformed(evt);
        this.phone_inputActionPerformed(evt);
        this.password_inputActionPerformed(evt);
        this.First_nameActionPerformed(evt);
        this.Last_nameActionPerformed(evt);
        
    }//GEN-LAST:event_register_buttonActionPerformed
    
    private void username_input1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_input1ActionPerformed
        // TODO add your handling code here:
        String username = username_input1.getText();
        login_username = username;
    }//GEN-LAST:event_username_input1ActionPerformed

    private void login_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_buttonActionPerformed
        // TODO add your handling code here:
    this.username_input1ActionPerformed(evt);
    this.password_input1ActionPerformed(evt);
    if (login_username.equals(this.username) && login_password.equals(this.password)) {
        JOptionPane.showMessageDialog(this, "Welcome " + first_name + " , " + last_name + " It is greate to see you again", "Welcome", JOptionPane.INFORMATION_MESSAGE);
        // Navigate to the next screen or allow access
    } else {
        JOptionPane.showMessageDialog(this, "username or password is incorrect , please try again.", "Login Failed", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_login_buttonActionPerformed

    private void username_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_inputActionPerformed
        // TODO add your handling code here:
            String username = username_input.getText();
            String message = this.usernameSetter(username);
            JOptionPane.showMessageDialog(this, message, "message", JOptionPane.INFORMATION_MESSAGE);
            this.username = username;
        
        
    }//GEN-LAST:event_username_inputActionPerformed

    private void phone_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phone_inputActionPerformed
        // TODO add your handling code here:
            String phone  = phone_input.getText();
            String message = this.phoneSetter(phone);
            JOptionPane.showMessageDialog(this, message, "message", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_phone_inputActionPerformed

    private void password_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_inputActionPerformed
        // TODO add your handling code here:
        String password = new String (password_input.getPassword());
        String message = this.passwordSetter(password);
        JOptionPane.showMessageDialog(this, message, "message", JOptionPane.INFORMATION_MESSAGE);
           
    }//GEN-LAST:event_password_inputActionPerformed

    private void password_input1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_input1ActionPerformed
        // TODO add your handling code here:
        login_password = new String (password_input1.getPassword());
        System.out.println(login_password);
    }//GEN-LAST:event_password_input1ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField First_name;
    private javax.swing.JTextField Last_name;
    private javax.swing.JLabel Last_name_label;
    private javax.swing.JPanel Login_container;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JButton login_button;
    private javax.swing.JDialog message;
    private javax.swing.JPasswordField password_input;
    private javax.swing.JPasswordField password_input1;
    private javax.swing.JTextField phone_input;
    private javax.swing.JButton register_button;
    private javax.swing.JPanel register_container;
    private javax.swing.JLabel register_title;
    private javax.swing.JLabel register_title1;
    private javax.swing.JTextField username_input;
    private javax.swing.JTextField username_input1;
    // End of variables declaration//GEN-END:variables
}

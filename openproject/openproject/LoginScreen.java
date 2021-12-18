package openproject;

import javax.swing.*;
import java.awt.event.*;

//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : IT독서실예약시스템
//  @ File Name : LoginScreen.java
//  @ Date : 2021-12-10
//  @ Author : 김나현
//
//


public class LoginScreen extends JFrame {
	String id = "Rewind";
    String pass = "1234";
	
	public LoginScreen() {
	JPanel panel = new JPanel();
	JLabel label = new JLabel("ID : ");
	JLabel pswrd = new JLabel("PassWord : ");
	JTextField txtID = new JTextField(10);
	JPasswordField txtPass = new JPasswordField(10);
	JButton logBtn = new JButton("Log in");
	
	panel.add(label);
    panel.add(txtID);
    panel.add(pswrd);
    panel.add(txtPass);
    panel.add(logBtn);
    
    logBtn.addActionListener( new ActionListener() {
    	 
        
        public void actionPerformed(ActionEvent e) {

                
                
                String input_id= txtID.getText();
                String input_pw =txtPass.getText();
                
               LoginCtrl lc=new LoginCtrl();
                
                if( lc.checkverify(id, pass, input_id, input_pw)==true) {
                	JOptionPane.showMessageDialog( null, "you have logged in successfully" );
                }
                else if(lc.checkverify(id, pass, input_id, input_pw)==false) {
                	JOptionPane.showMessageDialog( null , " you failed to log in ");
                }






        }



} );




add(panel);


setVisible(true);

setSize( 350 , 200);

setLocationRelativeTo(null);

setResizable(false);

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
	
	

	 public static void main(String[] args) {
	      new LoginScreen();
	 
	  }
}

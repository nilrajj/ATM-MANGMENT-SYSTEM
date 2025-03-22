pakage project; 

import javax.swing.*;
import java.awt.*;

class Login extends JFrame{
 public Login(){
   ImageIcon i1 = ImageIcon(classLoader.getResource());
   Image i2 = i1.getScale.getScaledInstance(100,100,Image.SCALE.DEFAULT);
   ImageIcon i3 = new ImageIcon(i2);

   JLabel imglable = new JLable(i1);
   imglable.setBounds(70,10,100,100);
   add(imglable);
   
   

   
   setSize(800,400);
   setLocation(450,300);
   setTitle("Login Page”);
   setVisible(true);
   
 }
  public static void main(String[] args){
    new login();
  }
}

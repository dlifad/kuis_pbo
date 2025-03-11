package kuis_123230049;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class LoginPage extends JFrame{
    JPanel panel = new JPanel();
    JPanel userP = new JPanel();
    JPanel passP = new JPanel();
    JPanel loginP = new JPanel();
    JLabel userL = new JLabel("Username : ");
    JLabel passL = new JLabel("Password : ");
    JTextField userF = new JTextField(20);
    JPasswordField passF = new JPasswordField(20);
    JButton loginB = new JButton("Login");
    
    public LoginPage() {
        setTitle("Frame Login");
        setSize(400, 200);
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);
        
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        userP.setLayout(new FlowLayout(FlowLayout.LEFT));
        userP.add(userL);
        userP.add(userF);
        
        passP.setLayout(new FlowLayout(FlowLayout.LEFT));
        passP.add(passL);
        passP.add(passF);
        
        loginP.add(loginB);
        
        panel.add(userP);
        panel.add(passP);
        panel.add(loginP);
        
        loginB.addActionListener(new AksiLogin(userF, passF, this));
        
        add(panel);
        setVisible(true);
    }
}

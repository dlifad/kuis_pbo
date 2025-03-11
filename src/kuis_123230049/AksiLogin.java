package kuis_123230049;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AksiLogin implements ActionListener {
    private JTextField userF;
    private JPasswordField passF;
    private JFrame frame;
    
    public AksiLogin(JTextField userF, JPasswordField passF, JFrame frame) {
        this.userF = userF;
        this.passF = passF;
        this.frame = frame;
    }
    
    @Override
    public  void actionPerformed(ActionEvent e) {
        String user = userF.getText();
        String pass = new String(passF.getPassword());
        
        if(user.equals("fadli") && pass.equals("049")) {
            JOptionPane.showMessageDialog(null, "Login berhasil", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            frame.dispose();
            new GamePage();
        } else {
            JOptionPane.showMessageDialog(null, "Login gagal, Username atau password salah", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}

package kuis_123230049;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GamePage extends JFrame{
    
    private JTextField nama;
    private JRadioButton batu, kertas, gunting;
    
    
    
    
    public GamePage() {
        setTitle("Frame Game");
        setSize(550, 500);
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);
        
        JPanel panel = new JPanel();
        
        panel.setLayout(new GridLayout(6, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        
        JLabel judul = new JLabel("Game Batu-Kertas-Gunting", SwingConstants.CENTER);
        panel.add(judul);
        
        JPanel playerP1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        playerP1.add(new JLabel("Player 1"));
        panel.add(playerP1);
        
        JPanel namaP1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        namaP1.add(new JLabel("Nama : "));
        namaP1.add(new JTextField(10));
        panel.add(namaP1);
        
        JPanel seranganP1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        seranganP1.add(new JLabel("Serangan : "));
        seranganP1.add(new JRadioButton("Batu"));
        seranganP1.add(new JRadioButton("Kertas"));
        seranganP1.add(new JRadioButton("Gunting"));
        panel.add(seranganP1);
        
        JPanel battleB = new JPanel(new FlowLayout(FlowLayout.CENTER));
        battleB.add(new JButton("Battle"));
        panel.add(battleB);
        
        JPanel hasilL = new JPanel(new FlowLayout(FlowLayout.LEFT));
        hasilL.add(new JLabel("Hasil :"));
        panel.add(hasilL);
        
//        JPanel buttonBawah = new JPanel(new BorderLayout());
//        buttonBawah.add(new JButton("Reset"), BorderLayout.WEST);
//        buttonBawah.add(new JButton("Logout"), BorderLayout.EAST);
//        panel.add(buttonBawah);
        
//        JPanel playerP2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
//        playerP2.add(new JLabel("Player 2"));
//        panel.add(playerP2);
//        
//        JPanel namaP2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
//        namaP2.add(new JLabel("Nama : "));
//        namaP2.add(new JTextField(10));
//        panel.add(namaP2);
//        
//        JPanel seranganP2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
//        seranganP2.add(new JLabel("Serangan : "));
//        seranganP2.add(new JRadioButton("Batu"));
//        seranganP2.add(new JRadioButton("Kertas"));
//        seranganP2.add(new JRadioButton("Gunting"));
//        panel.add(seranganP2);
        
        
        add(panel);
        setVisible(true);
    }
}

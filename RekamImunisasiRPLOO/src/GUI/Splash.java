package GUI;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.UIManager;
import javax.swing.border.Border;

/**
 *
 * @author jie
 */
public class Splash extends JFrame {

    int a = 0;
    JProgressBar progressBar = new JProgressBar(0, 100);
    JLabel label = new JLabel();
    Border border = BorderFactory.createTitledBorder("Waiting…");
    ImageIcon image;

    public Splash() {

        progressBar.setStringPainted(true);
        progressBar.setBorder(border);
        label.setText("Selamat datang di Sistem Infromasi Imunisasi");
        label.setFont(new Font("Tahoma", 1, 24));
        JPanel content = (JPanel) getContentPane();
        content.setBackground(Color.CYAN);
        Color warnaBorder = Color.BLACK;
        content.setBorder(BorderFactory.createLineBorder(warnaBorder, 5));
        setLayout(null);
        add(label);
        label.setBounds(10, 50, 600, 100);
        Component add = add(progressBar);
        progressBar.setBounds(10, 400, 550, 40);
        pack();
        setSize(600, 500);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
        while (a <= 100) {
            progressBar.setValue(a);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
            a += 1;
        }
        Login_menu lm=new Login_menu();
        lm.setVisible(true);
        this.dispose();
    }

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new Splash();
        } catch (Exception ex) {
        }
    }
}
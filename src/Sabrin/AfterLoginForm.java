package Sabrin;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class AfterLoginForm extends JFrame {
    JLabel l1;
    AfterLoginForm()
    {
        setSize(500,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
        setLayout(null);

        JLabel l1 = new JLabel("Khaiya Mor");
        l1.setBounds(50,50,300,50);
        add(l1);
        setVisible(true);
    }

}
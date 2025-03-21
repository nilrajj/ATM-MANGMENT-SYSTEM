package project;

import java.awt.*;
import javax.swing.*;

class JTooltipDemo extends JFrame {
    public JTooltipDemo() {
        Container ct = getContentPane();
        ct.setLayout(null);

        // Username Label
        JLabel l1 = new JLabel("Username");
        l1.setBounds(100, 100, 100, 30);
        ct.add(l1);

        // Username TextField with Tooltip
        JTextField t1 = new JTextField();
        t1.setToolTipText("Enter your username?");
        t1.setBounds(100, 150, 150, 30);
        ct.add(t1);

        // Password Label
        JLabel l2 = new JLabel("Password");
        l2.setBounds(100, 200, 100, 30);
        ct.add(l2);

        // Password TextField with Tooltip
        JTextField t2 = new JTextField();
        t2.setToolTipText("Enter your password?");
        t2.setBounds(100, 250, 150, 30);
        ct.add(t2);

        // Frame settings
        setSize(600, 600);
        setTitle("ToolTip Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JTooltipDemo(); // Create an instance of the frame
    }
}

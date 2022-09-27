package main.frames;

import javax.swing.*;
import java.awt.*;

public class ErrorFrame extends JFrame {

    public ErrorFrame(String s) {
        this.setBounds(50, 50, s.length() * 11, 100);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);

        JLabel exceptionLabel = new JLabel(s);
        exceptionLabel.setBounds(0, 0, s.length() * 11, 100);
        exceptionLabel.setHorizontalAlignment(JLabel.CENTER);
        exceptionLabel.setFont(new Font("Arial", Font.PLAIN, 20));

        this.add(exceptionLabel);
    }
}

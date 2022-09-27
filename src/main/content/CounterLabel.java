package main.content;

import javax.swing.*;
import java.awt.*;

public class CounterLabel extends JLabel {

    public CounterLabel() {
        this.setBounds(0, 100, 256, 60);
        Font font = new Font("Arial", Font.PLAIN, 56);
        this.setFont(font);
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setText("00:00:00");
    }
}

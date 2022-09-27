package main.content;

import javax.swing.*;
import java.awt.*;

public class TextField extends JTextField {

    public TextField() {
        this.setBounds(30, 30, 100, 50);
        Font font = new Font("Arial", Font.PLAIN, 32);
        this.setFont(font);
    }
}

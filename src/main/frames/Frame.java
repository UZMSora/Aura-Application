package main.frames;

import javax.swing.*;
import java.util.Objects;

public class Frame extends JFrame {

    public Frame() {
        this.setTitle("Aura");
        this.setBounds(50, 50, 270, 460);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
        this.setLayout(null);
        ImageIcon icon = new ImageIcon(Objects.requireNonNull(getClass().getResource("/main/content/TreeAlive.png")));
        this.setIconImage(icon.getImage());
    }
}

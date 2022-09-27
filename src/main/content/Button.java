package main.content;

import main.MyTimer;
import main.frames.ErrorFrame;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.util.Objects;

public class Button extends JButton {

    public Button() {
        this.setBounds(162, 23, 64, 64);
        ImageIcon buttonNormal = new ImageIcon(Objects.requireNonNull(getClass().getResource("/main/content/buttonNormal.png")));
        ImageIcon buttonHover = new ImageIcon(Objects.requireNonNull(getClass().getResource("/main/content/buttonHover.png")));
        this.setIcon(buttonNormal);
        this.setOpaque(false);
        this.setContentAreaFilled(false);
        this.setBorderPainted(false);
        this.addMouseListener(new MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                setIcon(buttonHover);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                setIcon(buttonNormal);
            }
        });
    }

    public void initializeButton(MyTimer timer, TextField textField) {
        this.addActionListener(e -> {
            try {
                timer.setSecond((Integer.parseInt(textField.getText()) * 60) % 60);
                timer.setMinute(Integer.parseInt(textField.getText()) % 60);
                timer.setHour(Integer.parseInt(textField.getText()) / 60);
                timer.start();
            } catch (Exception exception) {
                new ErrorFrame("Falsche Eingabe");
            }
        });
    }
}

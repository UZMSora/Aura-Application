package main.content;

import javax.swing.*;
import java.util.Objects;

public class PictureLabel extends JLabel {

    public PictureLabel() {
        this.setBounds(0, 160, 256, 256);
        ImageIcon treeAlive = new ImageIcon(Objects.requireNonNull(getClass().getResource("/main/content/TreeAlive.png")));
        this.setIcon(treeAlive);
    }

    public void changeIcon() {
        Icon treeDead = new ImageIcon(Objects.requireNonNull(getClass().getResource("/main/content/TreeDead.png")));
        this.setIcon(treeDead);
    }
}

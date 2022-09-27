package main;

import main.content.Button;
import main.content.CounterLabel;
import main.content.PictureLabel;
import main.content.TextField;
import main.frames.Frame;

public class GUI {

    private final CounterLabel counterLabel = new CounterLabel();
    private final PictureLabel pictureLabel = new PictureLabel();
    private final TextField textField = new TextField();
    private final Button button = new Button();

    GUI() {
        Frame frame = new Frame();
        frame.add(counterLabel);
        frame.add(pictureLabel);
        frame.add(textField);
        frame.add(button);
    }

    public CounterLabel getCounterLabel() {
        return counterLabel;
    }

    public PictureLabel getPictureLabel() {
        return pictureLabel;
    }

    public Button getButton() {
        return button;
    }

    public TextField getTextField() {
        return textField;
    }
}

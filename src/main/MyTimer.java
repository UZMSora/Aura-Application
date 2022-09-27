package main;

import main.content.CounterLabel;
import main.content.PictureLabel;
import main.frames.ErrorFrame;

import javax.swing.*;
import java.text.DecimalFormat;

public class MyTimer {

    private final DecimalFormat dFormat = new DecimalFormat("00");
    private int second, minute, hour;
    private String dSecond, dMinute, dHour;
    private Timer timer;

    MyTimer(CounterLabel counterLabel, PictureLabel pictureLabel) {
        timer = new Timer(1000, e -> {
            ProcessCheck processCheck = new ProcessCheck();
            String s = processCheck.checkForBanned();
            if (!s.equals("")) {
                new ErrorFrame("Du hast leider " + s + " geöffnet");
                pictureLabel.changeIcon();
                timer.stop();
            }

            second--;
            dSecond = dFormat.format(second);
            dMinute = dFormat.format(minute);
            dHour = dFormat.format(hour);
            counterLabel.setText(dHour + ":" + dMinute + ":" + dSecond);

            if (second < 0) {
                second = 59;
                minute--;
                dSecond = dFormat.format(second);
                dMinute = dFormat.format(minute);
                counterLabel.setText(dHour + ":" + dMinute + ":" + dSecond);
            }
            if (second == 59 && minute < 0) {
                minute = 59;
                hour--;
                dMinute = dFormat.format(minute);
                dHour = dFormat.format(hour);
                counterLabel.setText(dHour + ":" + dMinute + ":" + dSecond);
            }
            if (second == 0 && minute == 0 && hour == 0) {
                timer.stop();
            }
        });
    }

    public void start() {
        timer.start();
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
}

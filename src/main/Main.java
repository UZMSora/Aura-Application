package main;

public class Main {

    public static void main(String[] args) {
        GUI gui = new GUI();
        MyTimer timer = new MyTimer(gui.getCounterLabel(), gui.getPictureLabel());
        gui.getButton().initializeButton(timer, gui.getTextField());
    }
}

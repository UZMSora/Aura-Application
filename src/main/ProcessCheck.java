package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Locale;

public class ProcessCheck {

    private final LinkedList<String> tasklist = new LinkedList<>();
    private final LinkedList<String> bannedTasks = new LinkedList<>();

    ProcessCheck() {
        try {
            initializeBannedTasks();
            String line;
            Process p = Runtime.getRuntime().exec(System.getenv("windir") + "\\system32\\" + "tasklist.exe");
            BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
            while ((line = input.readLine()) != null) {
                tasklist.add(line);
            }
            input.close();
        } catch (Exception err) {
            err.printStackTrace();
        }
    }

    public String checkForBanned() {
        for (String s :
                tasklist) {
            for (String b :
                    bannedTasks) {
                if (s.toLowerCase(Locale.ROOT).contains(b)) {
                    return b;
                }
            }
        }
        return "";
    }

    private void initializeBannedTasks() {
        //bannedTasks.add("discord.exe");
        bannedTasks.add("steam.exe");
        bannedTasks.add("eadesktop.exe");
        bannedTasks.add("origin.exe");
        bannedTasks.add("epicgameslauncher.exe");
        bannedTasks.add("upc.exe");
        bannedTasks.add("battle.net.exe");
        bannedTasks.add("riotclientux.exe");
        bannedTasks.add("valorant.exe");
        //bannedTasks.add("opera.exe");
    }
}

package Controlers;

import CLI.UserConnector;

import java.io.IOException;

public class RunSettingsManager {
    public RunSettingsManager() {

    }

    public void run(String[] args) {
        try {
            if (args.length == 0) {
                new UserConnector();
            } else if (args.length == 2 && args[0].equals("BRUTE_FORCE")) {
                new RunManager().runBruteForce(args[1]);
            } else if (args.length == 3) {
                if (args[0].equals("ENCRYPT")) {
                    new RunManager().runEncrypt(new String[]{args[1], args[2]});
                } else if (args[0].equals("DECRYPT")) {
                    new RunManager().runDecrypt(new String[]{args[1], args[2]});
                }
            }
        } catch (IOException e) {
            System.out.println("Invalid file name entered, please try again.");
        }
    }
}

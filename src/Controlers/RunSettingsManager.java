package Controlers;

import CLI.UserConnecter;
import IO.Reader;

public class RunSettingsManager {
    public RunSettingsManager() {

    }

    public void run(String[] args) {
        if (args.length == 0) {
            new UserConnecter();
        } else if (args.length == 2 && args[0].equals("BRUTE_FORCE")) {
            new Reader().read(args[1]);

            // call correct command
        } else if (args.length == 3) {
            if (args[0].equals("ENCRYPT")) {

                new Reader().read(args[1]);
                // call correct command
            } else if (args[0].equals("DECRYPT")) {
                new Reader().read(args[1]);

                // call correct command
            }
        }
    }
}

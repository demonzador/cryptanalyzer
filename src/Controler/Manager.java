package Controler;

import CLI.UserConnecter;

public class Manager {
    public Manager() {

    }

    public void run(String[] args) {
        if (args.length == 0) {
            new UserConnecter();
        } else if (args.length == 2 && args[0].equals("BRUTE_FORCE")) {
            System.out.println("brute_force");// call correct command
        } else if (args.length == 3) {
            if (args[0].equals("ENCRYPT")) {
                System.out.println("encrypt");// call correct command
            } else if (args[0].equals("DECRYPT")) {
                System.out.println("decrypt");// call correct command
            }
        }
    }
}

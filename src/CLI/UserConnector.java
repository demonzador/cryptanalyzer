package CLI;

import Controlers.RunManager;

import java.io.IOException;
import java.util.Scanner;

// this class for work with program using the console
public class UserConnector {
    public UserConnector() {
        // request what user want
        System.out.println("Hello, chose correct action\n [e] encrypt;  [d] decrypt;  [b] brute force;");
        Scanner console = new Scanner(System.in);
        String command = console.nextLine();
        //choose correct option
        switch (command) {
            case "e", "E" -> {
                System.out.println("Enter filepath and key in format <filepath> <key>");
                command = console.nextLine();
                String[] buff = command.split(" ");
                try {
                    new RunManager().runEncrypt(buff);
                } catch (IOException e) {
                    System.out.println("Invalid file name entered, please try again.");
                    new UserConnector();
                }
            }
            case "d", "D" -> {
                System.out.println("Enter filepath and key in format <filepath> <key>");
                command = console.nextLine();
                String[] buff = command.split(" ");
                try {
                    new RunManager().runDecrypt(buff);
                } catch (IOException e) {
                    System.out.println("Invalid file name entered, please try again.");
                    new UserConnector();
                }
            }
            case "b", "B" -> {
                System.out.println("Enter filepath");
                command = console.nextLine();
                try {
                    new RunManager().runBruteForce(command);
                } catch (IOException e) {
                    System.out.println("Invalid file name entered, please try again.");
                    new UserConnector();
                }
            }
            default -> System.out.println("Good, see you next time");
        }
    }
}

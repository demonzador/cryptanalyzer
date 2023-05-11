package CLI;

import Controlers.RunManager;

import java.util.Scanner;

public class UserConnector {
    public UserConnector() {
        System.out.println("Hello, chose correct action\n [e] encrypt;  [d] decrypt;  [b] brute force;");
        try (Scanner console = new Scanner(System.in)) {
            String command = console.nextLine();
            switch (command) {
                case "e", "E" -> {
                    System.out.println("Enter filepath and key in format <filepath> <key>");
                    command = console.nextLine();
                    String[] buff = command.split(" ");
                    new RunManager().runEncrypt(buff);
                }
                case "d", "D" -> {
                    System.out.println("Enter filepath and key in format <filepath> <key>");
                    command = console.nextLine();
                    String[] buff = command.split(" ");
                    new RunManager().runDecrypt(buff);
                }
                case "b", "B" -> {
                    System.out.println("Enter filepath");
                    command = console.nextLine();
                    new RunManager().runBruteForce(command);
                }
                default -> System.out.println("ok");
            }
        }
    }
}

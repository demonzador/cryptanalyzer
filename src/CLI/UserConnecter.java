package CLI;

import Controlers.RunManager;
import IO.Reader;

import java.util.Scanner;

public class UserConnecter {
    public UserConnecter() {
        System.out.println("Hello, chose correct action\n [e] encrypt;  [d] decrypt;  [b] brute force;");
        try (Scanner console = new Scanner(System.in)) {
            String command = console.nextLine();
            switch (command) {
                case "e" -> {
                    System.out.println("Enter filename and key");
                    command = console.nextLine();
                    String[] buff = command.split(" ");
                    new RunManager().runEncryptFromConsole(buff);
                }
                case "d" -> {
                    System.out.println("Enter filename and key");
                    command = console.nextLine();
                    String[] buff = command.split(" ");
                    new RunManager().runDecryptFromConsole(buff);
                }
                case "b" -> {
                    System.out.println("Enter filename");
                    command = console.nextLine();

                    new Reader().read(command);
                    System.out.println(command + "good1");// call correct command
                }
                default -> System.out.println("ok");
            }
        }
    }
}

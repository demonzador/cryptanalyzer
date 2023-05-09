package CLI;

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
                    new Reader().read(buff[0]);

                    System.out.println(command);// call correct command
                }
                case "d" -> {
                    System.out.println("Enter filename and key");
                    command = console.nextLine();
                    String[] buff = command.split(" ");
                    new Reader().read(buff[0]);

                    System.out.println(command + "good very");// call correct command
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

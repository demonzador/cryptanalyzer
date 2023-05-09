import AlphabetENG.AlphabetENG;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(AlphabetENG.A);
        System.out.println(AlphabetENG.A.ordinal());
        System.out.println(AlphabetENG.A.toString().equals("A"));
        System.out.println(Arrays.toString(AlphabetENG.values()));
        System.out.println(AlphabetENG.values().length);

    }
}
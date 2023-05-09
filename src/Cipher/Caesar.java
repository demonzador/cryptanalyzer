package Cipher;

import AlphabetENG.AlphabetENG;

import java.util.ArrayList;

public class Caesar {

    public void encrypt(char[] source, int key) {
        ArrayList<Character> alphabet = getAlphabet();
        char[] result = new char[source.length];
        for (int i = 0; i < source.length; i++) {
            if (alphabet.contains(source[i])) {
                result[i] = alphabet.get(i + key);
            } else {
                result[i] = source[i];
            }
        }
    }

    public void decrypt(char[] source, int key) {
        encrypt(source, (-1) * key);
    }
    
    public void brutForce() {
        
    }

    public ArrayList<Character> getAlphabet() {
        AlphabetENG[] values = AlphabetENG.values();
        ArrayList<Character> alphabet = new ArrayList<>();
        for (int i = 0; i < values.length; i++) {
            alphabet.set(i, values[i].ordinal());
        }
        return alphabet;
    }
}

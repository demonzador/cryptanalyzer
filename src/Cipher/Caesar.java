package Cipher;

import AlphabetENG.AlphabetENG;

import java.util.ArrayList;

public class Caesar {

    public char[] encrypt(char[] source, int key) {
        ArrayList<Character> alphabet = getAlphabet();
        ArrayList<Character> sourceList = arrayToList(source);
        int sizeOfAlphabet = alphabet.size();
        int sourceLength = source.length;
        char[] result = new char[sourceLength];
        key %= sizeOfAlphabet;
        for (int i = 0; i < source.length; i++) {
            int positionInAlphabet = alphabet.indexOf(sourceList.get(i)) + key;
            while ((positionInAlphabet) >= sizeOfAlphabet) {
                positionInAlphabet -= sizeOfAlphabet;
            }
            while ((positionInAlphabet) < 0) {
                positionInAlphabet += sizeOfAlphabet;
            }
            if (alphabet.contains(source[i])) {

                result[i] = alphabet.get(positionInAlphabet);
            } else {
                result[i] = source[i];
            }
        }
        return result;
    }

    public char[] decrypt(char[] source, int key) {
        return encrypt(source, (-1) * key);
    }

    public void brutForce(char[] source) {
        System.out.println(source);
    }

    public ArrayList<Character> arrayToList(char[] source) {
        ArrayList<Character> result = new ArrayList<>();
        for (char c : source) {
            result.add(c);
        }
        return result;
    }

    public ArrayList<Character> getAlphabet() {
        AlphabetENG[] values = AlphabetENG.values();
        final int length = values.length;
        ArrayList<Character> alphabet = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            Character character = values[i].ordinal();
            alphabet.add(character);
        }
        return alphabet;
    }
}

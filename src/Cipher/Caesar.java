package Cipher;

import AlphabetENG.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

// class encrypts, decrypts and hacks source text
public class Caesar {

    // method for encrypt
    public char[] encrypt(char[] source, int key) {
        ArrayList<Character> alphabet = getAlphabet();
        ArrayList<Character> sourceList = arrayToList(source);
        int alphabetSize = alphabet.size();
        int sourceLength = source.length;
        char[] result = new char[sourceLength];
        key %= alphabetSize;
        for (int i = 0; i < source.length; i++) {
            int positionInAlphabet = alphabet.indexOf(sourceList.get(i)) + key;

            while ((positionInAlphabet) >= alphabetSize) {
                positionInAlphabet -= alphabetSize;
            }
            while ((positionInAlphabet) < 0) {
                positionInAlphabet += alphabetSize;
            }

            if (alphabet.contains(source[i])) {
                result[i] = alphabet.get(positionInAlphabet);
            } else {
                result[i] = source[i];
            }
        }
        return result;
    }

    // method for decrypt
    public char[] decrypt(char[] source, int key) {
        return encrypt(source, (-1) * key);
    }

    // method for hack the cipher
    public HashMap<Integer, char[]> brutForce(char[] source) {
        HashMap<Integer, char[]> result = new HashMap<>();

        // creating map an alphabet with frequencies
        HashMap<Double, Character> frequenciesAlphabet = new AlphabetENGWithFrequencies().getFrequencies();
        // creating map a source text with frequencies of used chars
        HashMap<Double, Character> frequenciesSource = getFreqFromSource(source);

        // find encrypting key
        int key = getKey(frequenciesAlphabet, frequenciesSource);

        // decrypts the text and ads it to result map with key
        result.put(key, decrypt(source, key));
        return result;
    }

    // reforming alphabet to arraylist
    private ArrayList<Character> getAlphabet() {
        AlphabetENG[] values = AlphabetENG.values();
        ArrayList<Character> alphabet = new ArrayList<>();
        for (AlphabetENG value : values) {
            Character character = value.ordinal();
            alphabet.add(character);
        }
        return alphabet;
    }

    // reforming from char array to arraylist
    private ArrayList<Character> arrayToList(char[] source) {
        ArrayList<Character> result = new ArrayList<>();
        for (char c : source) {
            result.add(c);
        }
        return result;
    }

    // this method create map of frequencies used chars
    private HashMap<Double, Character> getFreqFromSource(char[] source) {
        // map for save how many times all chars meets in source
        HashMap<Character, Integer> counter = new HashMap<>();
        // filling the map
        for (char c : source) {
            if (counter.containsKey(c)) {
                int i = counter.get(c);
                counter.replace(c, i, ++i);
            } else {
                counter.put(c, 1);
            }
        }

        // finding how many chars file have
        int countSum = 0;
        for (int i : counter.values()) {
            countSum += i;
        }

        // finding frequencies for all char and add it to result map
        HashMap<Double, Character> result = new HashMap<>();
        double frequenciesOfSymbol;
        for (char c : counter.keySet()) {
            frequenciesOfSymbol = ((double) counter.get(c) / countSum);
            result.put(frequenciesOfSymbol, c);
        }
        return result;
    }

    // method find key comparing frequencies from alphabet and file
    private int getKey(HashMap<Double, Character> source1, HashMap<Double, Character> source2) {
        // extract ten most popular chars from alphabet and file
        char[] mostPopularCharAlphabet = getMostPopularChar(source1);
        char[] mostPopularCharSource = getMostPopularChar(source2);

        // array for saving differences between indexes in alphabet of most popular chars
        int[] dif = new int[10];

        ArrayList<Character> alphabet = getAlphabet();
        for (int i = 0; i < 10; i++) {
            dif[i] = alphabet.indexOf(mostPopularCharSource[i]) - alphabet.indexOf(mostPopularCharAlphabet[i]);
        }

        // key correction
        for (int i = 0; i < dif.length; i++) {
            int value = dif[i];
            if (value < 0) {
                dif[i] = value + alphabet.size();
            } else if (value >= alphabet.size()) {
                dif[i] = value - alphabet.size();
            }
        }
        // searching for the most popular key and return it
        return getKeyWithMaxFrequencies(dif);
    }

    // method finding ten most popular chars using frequencies
    private char[] getMostPopularChar(HashMap<Double, Character> source) {
        char[] result = new char[10];
        ArrayList<Double> freq = new ArrayList<>(source.keySet());
        Collections.sort(freq);
        int counter = 0;
        for (int i = freq.size() - 10; counter < 10; i++) {
            result[counter] = source.get(freq.get(i));
            counter++;
        }
        return result;
    }

    // method find most popular key from ten possible
    private int getKeyWithMaxFrequencies(int[] source) {
        int result = 0;
        // finding how many times all key come across
        HashMap<Integer, Integer> integers = new HashMap<>();
        for (int i : source) {
            if (integers.containsKey(i)) {
                int value = integers.get(i);
                integers.replace(i, ++value);
            } else integers.put(i, 1);
        }

        // find the correct key
        int max = Integer.MIN_VALUE;
        for (int i : integers.values()) {
            max = Math.max(i, max);
        }
        for (var entry : integers.entrySet()) {
            if (entry.getValue() == max) {
                result = entry.getKey();
            }
        }
        return result;
    }
}

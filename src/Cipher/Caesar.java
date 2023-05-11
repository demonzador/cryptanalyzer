package Cipher;

import AlphabetENG.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

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

    public HashMap<Integer, char[]> brutForce(char[] source) {
        ArrayList<Character> alphabet = getAlphabet();
        HashMap<Integer, char[]> result = new HashMap<>();
        HashMap<Double, Character> frequenciesAlphabet = new AlphabetENGWithFrequencies().getFrequencies();
        HashMap<Double, Character> frequenciesSource = getFreqFromSource(source);

        int key = getKey(frequenciesAlphabet, frequenciesSource);
        if (key < 0) key += alphabet.size();

        result.put(key, decrypt(source, key));
        return result;
    }

    public char[] getMostPopularChar(HashMap<Double, Character> source) {
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

    public ArrayList<Character> arrayToList(char[] source) {
        ArrayList<Character> result = new ArrayList<>();
        for (char c : source) {
            result.add(c);
        }
        return result;
    }

    public ArrayList<Character> getAlphabet() {
        AlphabetENG[] values = AlphabetENG.values();
        ArrayList<Character> alphabet = new ArrayList<>();
        for (AlphabetENG value : values) {
            Character character = value.ordinal();
            alphabet.add(character);
        }
        return alphabet;
    }

    public int getKey(HashMap<Double, Character> source1, HashMap<Double, Character> source2) {
        int result = 0;
        char[] mostPopularCharAlphabet = getMostPopularChar(source1);
        char[] mostPopularCharSource = getMostPopularChar(source2);
        int[] dif = new int[10];

        ArrayList<Character> alphabet = getAlphabet();
        for (int i = 0; i < 10; i++) {
            dif[i] = alphabet.indexOf(mostPopularCharSource[i]) - alphabet.indexOf(mostPopularCharAlphabet[i]);
        }

        for (int i = 0; i < dif.length; i++) {
            int value = dif[i];
            if (value < 0) {
                dif[i] = value + alphabet.size();
            } else if (value >= alphabet.size()) {
                dif[i] = value - alphabet.size();
            }
        }

        HashMap<Integer, Integer> integers = new HashMap<>();
        for (int i : dif) {
            if (integers.containsKey(i)) {
                int value = integers.get(i);
                integers.replace(i, ++value);
            } else integers.put(i, 1);
        }

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

    public HashMap<Double, Character> getFreqFromSource(char[] source) {
        HashMap<Character, Integer> counter = new HashMap<>();
        for (char c : source) {
            if (counter.containsKey(c)) {
                int i = counter.get(c);
                counter.replace(c, i, ++i);
            } else {
                counter.put(c, 1);
            }
        }

        int countSum = 0;
        for (int i : counter.values()) {
            countSum += i;
        }

        HashMap<Double, Character> result = new HashMap<>();
        double key;
        for (char c : counter.keySet()) {
            key = ((double) counter.get(c) / countSum);
            result.put(key, c);
        }
        return result;
    }
}

package AlphabetENG;

import java.util.HashMap;

//class for saving frequencies of symbols
public class AlphabetENGWithFrequencies {
    public AlphabetENGWithFrequencies() {

    }


    public HashMap<Double, Character> getFrequencies() {
        return new HashMap<>() {{
            put(8.167, 'a');
            put(1.492, 'b');
            put(2.782, 'c');
            put(4.253, 'd');
            put(12.702, 'e');
            put(2.228, 'f');
            put(2.015, 'g');
            put(6.094, 'h');
            put(6.966, 'i');
            put(0.153, 'j');
            put(0.772, 'k');
            put(4.025, 'l');
            put(2.406, 'm');
            put(6.749, 'n');
            put(7.507, 'o');
            put(1.929, 'p');
            put(0.095, 'q');
            put(5.987, 'r');
            put(6.327, 's');
            put(9.056, 't');
            put(2.758, 'u');
            put(0.978, 'v');
            put(2.360, 'w');
            put(0.150, 'x');
            put(1.974, 'y');
            put(0.074, 'z');
        }};
    }
}

package Controlers;

import Cipher.Caesar;
import IO.Reader;
import IO.Writer;

import java.io.IOException;
import java.util.HashMap;
import java.util.Set;

// this class help to organize realization program processes
public class RunManager {
    public RunManager() {
    }

    // launches encrypt
    public void runEncrypt(String[] buff) throws IOException {
        // read filename from starts arguments
        String fileName = buff[0];
        // reads contents of file
        char[] read = new Reader().read(fileName);
        // gets key from starts arguments
        int key = Integer.parseInt(buff[1]);
        // encrypts source text
        char[] encrypted = new Caesar().encrypt(read, key);
        // write encrypted text
        new Writer().writeEncrypt(encrypted, fileName);
    }

    // launches decrypt
    public void runDecrypt(String[] buff) throws IOException {
        // read filename from starts arguments
        String fileName = buff[0];
        // reads contents of file
        char[] read = new Reader().read(fileName);
        // gets key from starts arguments
        int key = Integer.parseInt(buff[1]);
        // decrypts source text
        char[] decrypted = new Caesar().decrypt(read, key);
        // write decrypted text
        new Writer().writeDecrypt(decrypted, fileName);
    }

    //launches bruteForce
    public void runBruteForce(String fileName) throws IOException {
        // reads contents of file
        char[] read = new Reader().read(fileName);
        // cracks the cipher using the bruteforce method which return the HasMap with only one pair.
        // Where key is encrypt key, value is decrypted text
        HashMap<Integer, char[]> brutted = new Caesar().brutForce(read);

        // extracts the key and decrypted text from HashMap
        Set<Integer> keySet = brutted.keySet();
        int[] keys = new int[keySet.size()];
        for (int i : keySet) {
            keys[0] = i;
        }
        char[] decryptedText = brutted.get(keys[0]);

        // write decrypted text
        new Writer().writeBruteForce(decryptedText, fileName, keys[0]);
    }
}
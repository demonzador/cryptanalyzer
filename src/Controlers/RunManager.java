package Controlers;

import Cipher.Caesar;
import IO.Reader;
import IO.Writer;

import java.io.IOException;
import java.util.HashMap;
import java.util.Set;

public class RunManager {
    public RunManager() {

    }

    public void runEncrypt(String[] buff) throws IOException {
        String fileName = buff[0];
        char[] read = new Reader().read(fileName);
        int key = Integer.parseInt(buff[1]);
        char[] encrypted = new Caesar().encrypt(read, key);
        new Writer().writeEncrypt(encrypted, fileName);
    }

    public void runDecrypt(String[] buff) throws IOException {
        String fileName = buff[0];
        char[] read = new Reader().read(fileName);
        int key = Integer.parseInt(buff[1]);
        char[] decrypted = new Caesar().decrypt(read, key);
        new Writer().writeDecrypt(decrypted, fileName);
    }

    public void runBruteForce(String fileName) throws IOException {
        char[] read = new Reader().read(fileName);
        HashMap<Integer, char[]> brutted = new Caesar().brutForce(read);

        Set<Integer> keySet = brutted.keySet();
        int[] keys = new int[keySet.size()];
        for (int i : keySet) {
            keys[0] = i;
        }
        char[] source = brutted.get(keys[0]);

        new Writer().writeBruteForce(source, fileName, keys[0]);
    }
}
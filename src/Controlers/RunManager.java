package Controlers;

import Cipher.Caesar;
import IO.Reader;

public class RunManager {
    public RunManager() {

    }

    public void runEncrypt(String[] buff) {
        String fileName = buff[0];
        char[] read = new Reader().read(fileName);
        int key = Integer.parseInt(buff[1]);
        new Caesar().encrypt(read, key);
    }

    public void runDecrypt(String[] buff) {
        String fileName = buff[0];
        char[] read = new Reader().read(fileName);
        int key = Integer.parseInt(buff[1]);
        new Caesar().decrypt(read, key);
    }

    public void runBruteForce(String fileName) {
        char[] read = new Reader().read(fileName);
        new Caesar().brutForce(read);
    }
}
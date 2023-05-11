package Controlers;

import Cipher.Caesar;
import IO.Reader;
import IO.Writer;

public class RunManager {
    public RunManager() {

    }

    public void runEncrypt(String[] buff) {
        String fileName = buff[0];
        char[] read = new Reader().read(fileName);
        int key = Integer.parseInt(buff[1]);
        char[] encrypted = new Caesar().encrypt(read, key);
        new Writer().writeEncrypt(encrypted, fileName);
    }

    public void runDecrypt(String[] buff) {
        String fileName = buff[0];
        char[] read = new Reader().read(fileName);
        int key = Integer.parseInt(buff[1]);
        char[] decrypted = new Caesar().decrypt(read, key);
        new Writer().writeDecrypt(decrypted, fileName);
    }

    public void runBruteForce(String fileName) {
        char[] read = new Reader().read(fileName);
        char[] brutted = new Caesar().brutForce(read);
        new Writer().writeBruteForce(brutted,fileName,2);
        System.out.println("you need to add parameter key in RunManager.runBruteForce");
    }
}
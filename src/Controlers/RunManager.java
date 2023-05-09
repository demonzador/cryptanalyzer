package Controlers;

import Cipher.Caesar;
import IO.Reader;

public class RunManager {
    public RunManager() {

    }

    public void runEncryptFromConsole(String[] buff) {
        char[] read = new Reader().read(buff[0]);
        int key = Integer.parseInt(buff[1]);
        new Caesar().encrypt(read, key);
    }

    public void runEncryptFromStartArgs(String[] buff) {
        char[] read = new Reader().read(buff[0]);
        int key = Integer.parseInt(buff[1]);
        new Caesar().encrypt(read, key);
    }

    public void runDecryptFromConsole(String[] buff) {
        char[] read = new Reader().read(buff[0]);
        int key = Integer.parseInt(buff[1]);
        new Caesar().decrypt(read, key);
    }

    public void runDecryptFromCStartArgs(String[] buff) {
        char[] read = new Reader().read(buff[0]);
        int key = Integer.parseInt(buff[1]);
        new Caesar().decrypt(read, key);
    }

    public void runBruteForce(String fileName) {
        char[] read = new Reader().read(fileName);
        new Caesar().brutForce(read);
    }
}
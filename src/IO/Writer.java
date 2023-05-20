package IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public Writer() {

    }

    public void writeEncrypt(char[] source, String oldFileName) throws IOException {
        String[] fileNameParts = oldFileName.split("\\.");
        StringBuilder newFileNameBuilder = new StringBuilder();
        for (int i = 0; i < fileNameParts.length - 1; i++) {
            newFileNameBuilder.append(fileNameParts[i]);
        }
        newFileNameBuilder.append("[ENCRYPTED].");
        newFileNameBuilder.append(fileNameParts[fileNameParts.length - 1]);
        BufferedWriter writer = new BufferedWriter(new FileWriter(newFileNameBuilder.toString()));
        writer.write(source);
        writer.flush();

    }

    public void writeDecrypt(char[] source, String oldFileName) throws IOException {
        String[] fileNameParts = oldFileName.split("\\.");
        StringBuilder newFileNameBuilder = new StringBuilder();
        for (int i = 0; i < fileNameParts.length - 1; i++) {
            newFileNameBuilder.append(fileNameParts[i]);
        }
        newFileNameBuilder.append("[DECRYPTED].");
        newFileNameBuilder.append(fileNameParts[fileNameParts.length - 1]);
        BufferedWriter writer = new BufferedWriter(new FileWriter(newFileNameBuilder.toString()));
        writer.write(source);
        writer.flush();
    }

    public void writeBruteForce(char[] source, String oldFileName, int key) throws IOException {
        String[] fileNameParts = oldFileName.split("\\.");
        StringBuilder newFileNameBuilder = new StringBuilder();
        for (int i = 0; i < fileNameParts.length - 1; i++) {
            newFileNameBuilder.append(fileNameParts[i]);
        }
        newFileNameBuilder.append("[BrutForced (key = ");
        newFileNameBuilder.append(key);
        newFileNameBuilder.append(")].");
        newFileNameBuilder.append(fileNameParts[fileNameParts.length - 1]);
        BufferedWriter writer = new BufferedWriter(new FileWriter(newFileNameBuilder.toString()));
        writer.write(source);
        writer.flush();
    }
}

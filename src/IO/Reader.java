package IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Reader {
    public Reader() {

    }

    public char[] read(String path) throws IOException {
        ArrayList<String> lines = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(path));
        while (reader.ready()) {
            String line = reader.readLine();
            lines.add(line);
            lines.add("\n");
        }

        return linesToCharArray(lines);
    }

    private char[] linesToCharArray(ArrayList<String> lines) {
        ArrayList<Character> characters = new ArrayList<>();
        for (String s : lines) {
            char[] buff = s.toCharArray();
            for (char c : buff) {
                characters.add(c);
            }
        }
        char[] result = new char[characters.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = characters.get(i);
        }
        return result;
    }
}

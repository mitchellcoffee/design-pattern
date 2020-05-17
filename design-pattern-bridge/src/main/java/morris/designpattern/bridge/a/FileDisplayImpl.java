package morris.designpattern.bridge.a;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileDisplayImpl extends DisplayImpl {

    private String filename;

    private BufferedReader reader;

    private final int MAX_READAHEAD_LIMIT = 4096;

    public FileDisplayImpl(String filename) {
        this.filename = filename;
    }

    public void rawOpen() {
        try {
            reader = new BufferedReader(new FileReader(filename));
            reader.mark(MAX_READAHEAD_LIMIT);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }

    }

    public void rawPrint() {
        try {
            String line;
            reader.reset();
            while ((line = reader.readLine()) != null) {
                System.out.println("> " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void rawClose() {
        System.out.println("=-= close" + filename + " =-=");
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

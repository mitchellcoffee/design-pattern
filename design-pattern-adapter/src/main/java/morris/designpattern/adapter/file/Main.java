package morris.designpattern.adapter.file;

import java.io.IOException;

public class Main {

    public static final void main(String[] args) {
        FileIO f = new FileProperties();
        try {
            f.readFromFile("design-pattern-adapter/src/main/java/morris/designpattern/adapter/file/file.txt");
            f.setValue("year", "2004");
            f.setValue("month", "4");;
            f.setValue("day", "21");
            f.writeToFile("design-pattern-adapter/src/main/java/morris/designpattern/adapter/file/newfile.txt");
        } catch (IOException ex) {
            ex.printStackTrace();
        }


    }

}

package morris.designpattern.template;

public class StringDisplay extends AbstractDisplay {

    private String string;

    private int witdh;

    public StringDisplay(String string) {
        this.string = string;
        this.witdh = string.getBytes().length;
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < witdh; ++i) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    protected void open() {
        printLine();
    }

    protected void print() {
        System.out.println("|" + string + "|");
    }

    protected void close() {
        printLine();
    }
}

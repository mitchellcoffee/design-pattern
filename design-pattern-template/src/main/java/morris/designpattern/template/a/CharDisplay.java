package morris.designpattern.template.a;

public class CharDisplay extends AbstractDisplay {

    private char ch;

    public CharDisplay(char ch) {
        this.ch = ch;
    }

    protected void open() {
        System.out.print("<<");
    }

    protected void print() {
        System.out.print(ch);
    }

    protected void close() {
        System.out.println(">>");
    }
}

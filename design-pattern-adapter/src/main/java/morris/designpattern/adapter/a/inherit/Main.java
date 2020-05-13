package morris.designpattern.adapter.a.inherit;

public class Main {

    public static final void main(String[] args) {
        Print p = new PrintBanner("abc");
        p.printStrong();
        p.printWeak();
    }

}

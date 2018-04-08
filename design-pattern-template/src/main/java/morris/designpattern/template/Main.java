package morris.designpattern.template;

public class Main {

    public static void main(String[] args) {
        AbstractDisplay p1 = new CharDisplay('H');
        AbstractDisplay p2 = new StringDisplay("Hello, World.");
        p1.display();
        p2.display();
    }

}

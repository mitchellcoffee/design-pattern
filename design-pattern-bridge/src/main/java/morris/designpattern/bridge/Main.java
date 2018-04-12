package morris.designpattern.bridge;

public class Main {

    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("Hello, World"));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello, World"));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, World"));
        RandomCountDisplay d4 = new RandomCountDisplay(new StringDisplayImpl("Hello, World"));
        //CountDisplay d5 = new CountDisplay(new FileDisplayImpl("test.txt"));
        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(3);
        d4.randomDisplay(10);
        //d5.multiDisplay(5);

        IncreaseDisplay d6 = new IncreaseDisplay(new CharDisplayImpl('<', '*', '>') ,1);
        d6.increaseDisplay(6);
    }
}

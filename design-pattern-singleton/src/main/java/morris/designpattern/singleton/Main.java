package morris.designpattern.singleton;

public class Main {

    public static void main(String[] args) {
        System.out.println("start.");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        if (obj1 == obj2) {
            System.out.println("相同实例");
        } else {
            System.out.println("不同实例");
        }
        System.out.println("end.");
    }
}

package morris.designpattern.singleton.hungry;

/**
 * 饿汉
 * 线程安全
 */
public class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        return instance;
    }

}

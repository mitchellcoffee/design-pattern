package morris.designpattern.singleton.lazysafe;

/**
 * 懒汉
 * 线程安全
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {

    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}

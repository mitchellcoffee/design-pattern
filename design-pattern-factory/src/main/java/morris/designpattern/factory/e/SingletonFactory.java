package morris.designpattern.factory.e;

import java.lang.reflect.Constructor;

// 用工厂方法模式替换单例模式
public class SingletonFactory {

	private static Singleton singleton;

	static {
		try {
			Class c1 = Class.forName(Singleton.class.getName());
			Constructor constructor = c1.getConstructor();
			constructor.setAccessible(true);
			singleton = (Singleton)constructor.newInstance();
		} catch (Exception e) {

		}
	}

	public static Singleton getSingleton() {
		return singleton;
	}
}

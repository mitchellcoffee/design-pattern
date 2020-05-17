package morris.designpattern.flyweight;

import java.util.HashMap;

public class FlyweightFactory {

	private static HashMap<String, Flyweight> pool = new HashMap<String, Flyweight>();

	//享元工厂
	public static Flyweight getFlyweight(String Extrinsic) {
		//需要返回的对象
		Flyweight flyweight = null;
		//在池中有该对象
		if (pool.containsKey(Extrinsic)) {
			flyweight = pool.get(Extrinsic);
		} else {
			//根据外部状态创建享元对象
			flyweight = new ConcreteFlyweight1(Extrinsic);
			//放置到池中
			pool.put(Extrinsic, flyweight);
		}
		return flyweight;
	}
}

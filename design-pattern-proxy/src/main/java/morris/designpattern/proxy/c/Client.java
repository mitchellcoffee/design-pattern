package morris.designpattern.proxy.c;

import java.lang.reflect.InvocationHandler;

public class Client {

	public static void main(String[] args) {
		Subject subject = new RealSubject();
		InvocationHandler handler = new MyInvocationHandler(subject);
		// 查找到该类的所有接口，然后实现接口的所有方法
		Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), handler);
		proxy.doSomething("Finish1");

		proxy = SubjectDynamicProxy.newProxyInstance(subject);
		//代理的行为
		proxy.doSomething("Finish2");
	}
}

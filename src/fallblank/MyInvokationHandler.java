package fallblank;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyInvokationHandler implements InvocationHandler{
	
	//targets是实现了接口的类对象
	private Object target;
	/**
	 * 通过Proxy生产代理对象时，对象调用接口方法时会调用这个方法
	 * @param proxy 代理对象
	 * @param method 调用的方法
	 * @param args 调用方法传入的参数
	 */
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		PersonUtil pu = new PersonUtil();
		pu.method_1();
		Object result = method.invoke(target, args);
		pu.method_2();
		return result;
	}
	public void setTarget(Object target) {
		this.target = target;
	}
	
}



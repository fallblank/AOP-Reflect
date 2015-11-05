package fallblank;

import java.lang.reflect.Proxy;

public class MyProxyFactory {
	/**
	 * 
	 * @param target 实现了接口的类创建的对象
	 * @return 代理接口对象
	 */
	public static Object getProxy(Object target){
		MyInvokationHandler handler = new MyInvokationHandler();
		handler.setTarget(target);
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), handler);
	}
}

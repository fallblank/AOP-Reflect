package fallblank;

import java.lang.reflect.Proxy;

public class MyProxyFactory {
	/**
	 * 
	 * @param target ʵ���˽ӿڵ��ഴ���Ķ���
	 * @return ����ӿڶ���
	 */
	public static Object getProxy(Object target){
		MyInvokationHandler handler = new MyInvokationHandler();
		handler.setTarget(target);
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), handler);
	}
}

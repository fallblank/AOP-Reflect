package fallblank;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyInvokationHandler implements InvocationHandler{
	
	//targets��ʵ���˽ӿڵ������
	private Object target;
	/**
	 * ͨ��Proxy�����������ʱ��������ýӿڷ���ʱ������������
	 * @param proxy �������
	 * @param method ���õķ���
	 * @param args ���÷�������Ĳ���
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



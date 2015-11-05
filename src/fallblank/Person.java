package fallblank;
/**
 * AOP(面向切向编程)代理中需要多次调用的接口定义，通过AOP代理可以使得在调用
 * 接口方法前插入别的代码
 * @author fallb
 * 
 *
 */
public interface Person {
	void eat();

	void sleep();
}

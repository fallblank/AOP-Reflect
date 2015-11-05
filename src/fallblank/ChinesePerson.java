package fallblank;
/**
 * 接口实现类，里面包括了需要多次调用的内容。
 * @author fallb
 *
 */

public class ChinesePerson implements Person {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Chinses food");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("huhuhu~");	
	}

}

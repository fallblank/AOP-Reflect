package fallblank;

public class Main {

	public static void main(String[] args) {
		Person target = new ChinesePerson();
		Person person = (Person) MyProxyFactory.getProxy(target);
		
		person.eat();
		person.sleep();
		
	}

}

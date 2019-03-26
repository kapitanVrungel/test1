/**
 * Created by ybaytler on 7/12/16.
 */
public class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int compute() {
		return age+1;
	}

	public int compute2() {
		return age+2;
	}

	public int compute3() {
		return age+2;
	}
}

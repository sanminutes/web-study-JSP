
public class Animal {
	String name;
	int age;

	Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void Show() {
		System.out.println(name + "는(은) " + age + " 살입니다.");
	}
}

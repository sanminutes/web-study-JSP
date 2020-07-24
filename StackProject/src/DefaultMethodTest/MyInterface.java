package DefaultMethodTest;

public interface MyInterface {
	default void method1() {
		System.out.println("method1() in MyInterface");
	}

	default void method2() {
		System.out.println("staticMethod() in MyInterface");
	}

	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface");
	}
}

package javaTest.test;

import javax.annotation.processing.SupportedSourceVersion;

class A {

	int a = 10;

	static void method1() {

		System.out.println("a class method with static");

	}
	void method2() {
		System.out.println("a class method without static ");
	}

}

public class Test6 extends A {

	int a = 20;

	static void method1() {
		System.out.println("test6 class method with static");
	}
	void method2() {
		System.out.println("test6 class method without static");
	}

	public static void main(String[] args) {
		A a1 = new Test6();
		A a2 = new A();
		Test6 b1 = new Test6();
		
		a2.method1();
		a1.method1();
		a1.method2();
		b1.method1();
		b1.method2();
		System.out.println("last value method " + a1.a);
		System.out.println("last value method " + b1.a);
	}
}
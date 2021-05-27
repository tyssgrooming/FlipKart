package javabasics;
class A {
	public void test1() {
		System.out.println("super class implementation");
	}
}
class B extends A {
	@Override
	public void test1() {
		System.out.println("sub class implementation");
	}
}
public class Tester3 {
	
	public static void main(String[] args) {
		B b1 = new B();
		b1.test1();
	}
}

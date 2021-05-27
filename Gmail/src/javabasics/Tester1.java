package javabasics;
class Addition {
	public static void add(String s, int... arr) {
		int sum=0;
		for(int a:arr) {
			sum=sum+a;
		}
		System.out.println("The Addition Result is "+sum);
	}
	
	public static void test(Object... arr) {
		System.out.println("test");
	}
}
public class Tester1 {

	public static void main(String[] args) {
		Addition.add("Hi");
		Addition.add("Gello", 10);
		Addition.add("Hey",10,20);
		Addition.add("Welcome",10,20,30);
		
		
		Addition.test(10);
		Addition.test(10.5);
		Addition.test("Hi");
		Addition.test('A');
		Addition.test(10,new Addition());
	}

}

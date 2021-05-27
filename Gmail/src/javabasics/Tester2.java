package javabasics;

public class Tester2 {

	public static void main(String[] args) {
		String rv = "qspiders";
		System.out.println(rv.substring(6));
		
		System.out.println(rv.substring(0, 1));
		
		
		
		String p1 = rv.substring(0,1);
		String p2 = rv.substring(1);
		
		String p3 = p1.toUpperCase() + p2.toLowerCase();
		
		System.out.println(p3);

	}

}

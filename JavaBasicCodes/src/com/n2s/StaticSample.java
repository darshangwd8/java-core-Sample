package com.n2s;

public class StaticSample {
    static int x=5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("1. StaticSample.main()");
        X.display2();
        display1();
        System.out.println("2. inMain x value: " + x);
	}
	public static void display1() {
		System.out.println("3. StaticSample.display() : static display");
	}
	static class X{
		public static void display2() {
			System.out.println("4. StaticSample.x.display2() : static display2()");
		}
	}
	static {
		System.out.println("5. StaticSample.enclosing_method() : static block");
	}

}

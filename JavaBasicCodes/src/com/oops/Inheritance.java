package com.oops;

public class Inheritance {
	public static void main(String[] args) {
		C c=new C();
		c.method1();
		c.method2();
		c.method3();
	}
   

}
class A{
	public void method1() {
		System.out.println("Method 1");
		
	}
}
class B extends A{
	public void method2() {
		System.out.println("Method 2");
		
	}
}
class C extends B{
	public void method3() {
		System.out.println("Method 3");
	}
}

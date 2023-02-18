package com.oops;

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s = new Sample();
		s.display1();
		//s.display2(); // not visible
		// Innersample x = new Innersample();//not visible
	}
}
class Sample{
	public int n =5;
	@SuppressWarnings("unused")
	private int m=10;
	Sample(){
		Innersample x =new Innersample();
		x.display3();
	}
	public void display1() {
//		int z =100;
		System.out.println(" default Sample: public display1 function");
		display2();
		this.display4();
		Innersample is =new Innersample();
		is.display3();	
	}
	private static void display2() {
		System.out.println("default Sample: private display2 function ");
	}
	private void display4() {
		System.out.println("default Sample: private display4 function ");
		Innersample is =new Innersample();
		is.display3();
	}
	private class Innersample{
		public void display3() {
			@SuppressWarnings("unused")
			int m=150;
			System.out.println("Inner class: public display 3 function"+n);
		}
	}	
}
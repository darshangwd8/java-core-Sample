package com.oops;

public class Abstraction extends calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstraction a =new Abstraction();
		System.out.println(a.add(10,20));
		System.out.println(a.sub(10, 20));
		System.out.println(a.mul(10, 20));

	}

	@Override
	public  int add(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}

	@Override
	public int sub(int x, int y) {
		// TODO Auto-generated method stub
		return x-y;
	}


}
abstract class calc{
	public abstract int add(int x,int y);
	
	public abstract int sub(int x,int y);
	
	public int mul(int x,int y) {
		return x*y;
	}
	
}

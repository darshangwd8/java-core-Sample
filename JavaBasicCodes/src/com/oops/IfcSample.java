package com.oops;

public class IfcSample implements Ifc1,Ifc2 {

	@Override
	public int sub(int x, int y) {
		// TODO Auto-generated method stub
		return x-y;
	}

	@Override
	public int add(int x, int y) {
			return x+y;
	}
    public static void main(String[] args) {
		IfcSample i = new IfcSample();
		System.out.println(i.add(ifc_x, ifc_y));
		System.out.println(i.sub(ifc_x, ifc_y));
		System.out.println(i.mul(ifc_x, ifc_y));
		i.test1();
		Ifc1.test2();
		i.test3();
		System.out.println(ifc_z);
	}

	@Override
	public int mul(int i, int j) {
		// TODO Auto-generated method stub
		return i*j;
	}


}

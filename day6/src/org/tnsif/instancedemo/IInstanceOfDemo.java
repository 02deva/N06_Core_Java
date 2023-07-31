package org.tnsif.instancedemo;
class RBI
{
	protected String ifscCode;
}

class SBI extends RBI
{
	public SBI() {
		super.ifscCode = "RBISONGPA15";
		String ifscCode ="SBIN0021615";
		System.out.println(ifscCode);
		
//		if parent class and child variable are same 
//		in such case, use super.variablename to access that
//		variable of parent class inside child class
		System.out.println(super.ifscCode);
	}
	
}
// program to demonstrate the instance of operator
public class IInstanceOfDemo {

	public static void main(String[] args) {
		SBI sc = new SBI();
		System.out.println(sc instanceof SBI);
		System.out.println(sc instanceof RBI);

		

	}

}

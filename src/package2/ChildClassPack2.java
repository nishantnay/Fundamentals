package package2;

import package1.ChildClass;
import package1.Class1inPackage1;

public class ChildClassPack2 extends Class1inPackage1{
	
	void getAccess(){
		//System.out.println(" a:"+a);// Default variable
		//System.out.println(" b:"+b);// Private Variable
		System.out.println(" c:"+c);
		System.out.println(" d:"+d);
	}
	public static void main(String[] args) {
		new ChildClassPack2().getAccess();

	}

}

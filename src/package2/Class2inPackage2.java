package package2;

import package1.Class1inPackage1;

public class Class2inPackage2 {

	public static void main(String[] args) {
		int s=new Class1inPackage1().d;// only public variables are accessible
		//int d=new Class1inPackage1();

	}

}

package package1;

public class ChildClass extends Class1inPackage1{
	
	void getAccess(){
		System.out.println(" a:"+a);
		//System.out.println(" b:"+b);// Private Variable
		System.out.println(" c:"+c);
		System.out.println(" d:"+d);
	}

	public static void main(String[] args) {
		new ChildClass().getAccess();
	}
}

package exceptionHandling;

public class DerivedClass extends BaseClass{

	public static void main(String[] args){
		BaseClass c= new DerivedClass();
		
		System.out.println(c.division(2,0));
	}
}

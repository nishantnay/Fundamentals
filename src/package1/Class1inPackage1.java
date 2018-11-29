package package1;

public class Class1inPackage1 {

	
	int a=10;
	private int b=2;
	protected int c=3;
	public int d=4;
	
	class InnerClass{
		
		void display(){
			System.out.println(b);
		}
		
	}
	
	public static void main(String[] args) {
		Class1inPackage1 outer= new Class1inPackage1();
		InnerClass inner= outer.new InnerClass();
		
		inner.display();
	}
}

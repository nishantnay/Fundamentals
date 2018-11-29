package inheritance;

public class MainClass {
	public static void swap(Integer i, Integer j)  
	   { 
		System.out.println("i = " + i + ", j = " + j); 
	      //Integer temp = new Integer(i);
		Integer temp = i; 
	      i = j; 
	      j = temp;
	      System.out.println("i = " + i + ", j = " + j); 
	   } 

	public static void main(String[] args) {
		BaseClass cl= new DerivedClass();
		cl.display();//Shadowing of static functions in Java
		cl.print();
		
		Integer i = new Integer(10); 
	      Integer j = new Integer(20); 
	      swap(i, j); // This will never swap two numbers. 
	      
	      // Because Java is strictly pass by value and we never get the refernce back.
	      System.out.println("i = " + i + ", j = " + j); 
	}

}

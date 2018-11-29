 package StringRelated;

public class EqualStrings {
	public static void main(String[] args) {
		String a= "Nishant";
		String c= "Nishant";
		String b= new String("Nishant");
		
		String d= new String("Nishant");
		
		System.out.println(a==b);// False
		System.out.println(a==c); // True
		System.out.println(b==d);// False, because they are two different objects.
	}
}

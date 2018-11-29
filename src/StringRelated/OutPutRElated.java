package StringRelated;

public class OutPutRElated {

	public static void main(String[] args) {
		
		
		String a= new String ("Nishant");
		
		StringBuffer bf= new StringBuffer(a);
		
		System.out.println(a==bf.toString());
		
		System.out.println(a.equals(bf));
		// equals method from StringBuffer is not overridden 
		//from Object class, so it uses reference equality(==).
		System.out.println(a.equals(bf.toString()));
		
	}

}

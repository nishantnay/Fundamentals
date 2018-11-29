package listInterface;

import java.util.LinkedList;
import java.util.List;

public class GeneralInterfaceRelated {

	public static void main(String[] args) {
		List<String> names= new LinkedList<>();
		LinkedList<String> student= new LinkedList<>();
		
		//student.re
		
		student.descendingIterator();
		names.listIterator();
		
		String s= "Nishant";
		String q= "Nishant";
		String a= new String("Nishant");
		
		System.out.println(s.equals(a));
		System.out.println(s==q);

	}

}

package setInterface;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MultipleSetImplemetion {
	
	// Print all the elements which are duplicate
	
	public void printDuplicate(Set<String>a, Set<String>b){
		
		a.retainAll(b);//  Retain all elements in a which are also part of B. So the duplicate
		System.out.println(a);
	}
	
	// Print all the unique elements from both Sets 
	
	public void printAllUniqueElements(Set<String>a, Set<String>b){
		
		a.addAll(b);//  Prints the Union of both sets.
		System.out.println(a);
		
	}
	
	
	public static void main(String[] args) {
		
		Set<String> names= new HashSet<>(Arrays.asList("Nishant", "Nayanam","Rajeev"));
		Set<String> h = new HashSet<>(Arrays.asList("a", "b","Nishant","Nayanam"));
		
		HashSet<String> hs = new HashSet<>(Arrays.asList("a", "b","Nishant","Nayanam"));

		
		
		MultipleSetImplemetion ms= new MultipleSetImplemetion();
		
		ms.printDuplicate(names, h);
		//ms.printAllUniqueElements(names, h);
	}

}

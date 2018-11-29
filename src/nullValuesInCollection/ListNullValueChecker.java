package nullValuesInCollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListNullValueChecker {

	public static void main(String[] args) {
		List<String> linkedList= new LinkedList<>();
		List<String> arrayList= new ArrayList<>();
		
		linkedList.add(null);
		arrayList.add(null);
		
		linkedList.add("Nishant");
		arrayList.add("Nayanam");
		
		linkedList.add(null);
		arrayList.add(null);
		
		linkedList.forEach(System.out::println);
		arrayList.forEach(System.out::println);
		
		

	}

}

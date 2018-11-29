package nullValuesInCollection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetNullValueChecker {

	public static void main(String[] args) {
		Set<Integer> treeSet= new TreeSet<>();
		Set<Integer> hashSet= new HashSet<>();
		Set<Integer> linkedHashSet= new LinkedHashSet<>();
		
		
		//treeSet.add(null); Not Allowed
		hashSet.add(null);
		linkedHashSet.add(null);
		
		
		treeSet.add(1);
		hashSet.add(2);
		linkedHashSet.add(3);
		
		
		treeSet.forEach(System.out::println);
		hashSet.forEach(System.out::println);
		linkedHashSet.forEach(System.out::println);

	}

}

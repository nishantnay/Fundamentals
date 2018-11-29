package mapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapOfMap {

	public static void main(String[] args) {
		
		
		Map<String, Map<String, Integer>> val= new HashMap<>();
		HashMap<String, Integer> myCl= new HashMap<>();
		myCl.put("Nay"	,1);
		val.put("Nishant", myCl);
		
		val.put("Nayanam", myCl);
		
		val.put(null, myCl);
		val.put(null, myCl);
		val.entrySet().stream()
		
			.forEach(a-> System.out.println(a.getKey()+" "+a.getValue()));
		
		
		Map<String, Integer> treeVal= new TreeMap<>();
		
		treeVal.put(null, 1);// Not allowed
		treeVal.forEach((a,z)-> System.out.println(a+" "+z));// Exception
	}

}

package nullValuesInCollection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;

public class MapNullValueChecker {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Map<String, String> hashMap= new HashMap<>();
		Map<String, String> linkedHasMap= new LinkedHashMap<>();
		Map<String, String> treeMap= new TreeMap<>();
		
		hashMap.put(null, "Nishant");
		linkedHasMap.put(null, "Nayanam");
		//treeMap.put(null, "Print");// Run time exception.
		
		hashMap.forEach((a,d)-> System.out.println(a+" "+d));
		linkedHasMap.forEach((a,d)-> System.out.println(a+" "+d));
		treeMap.forEach((a,d)-> System.out.println(a+" "+d));
		
		Properties p= new Properties();
		p.load(new FileInputStream("file.property"));
		p.setProperty(null, "Nishant");// NullPointerException
		System.out.println(p.getProperty("Raja"));

	}

}

package streamAPI;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class FileInputStream {
	static List<Integer>defaultNum= Arrays.asList(1,1,1,1,11,1,2,13,1,4,5,5,5,6,7,8,9,12,13,12);
	static  Map<Integer, Integer> values= new HashMap<>();
	
	public static int getOccurance(int num){
		int i=Collections.frequency(defaultNum, num);
		 values.put(num,i );
		 return i;
		//return Collections.frequency(defaultNum, num);
	}

	public static void main(String[] args) throws IOException {
		
		//Stream<String>lines= Files.lines(Paths.get("Test.txt"));
		
		//lines.filter(q->q.length()>4).filter(q->q.startsWith("N")).forEach(System.out::println);
		//lines.forEach(System.out::println);
		
			
		//Stream <Integer>numbers=Stream.of(1,1,1,1,11,1,2,13,1,4,5,5,5,6,7,8,9,12,13,12);
		
		//numbers.distinct().map(w->FileInputStream.getOccurance(w)).count();
		//System.out.println("Count of number: "+num);
		//values.entrySet().stream().filter(a->a.getValue()!=1).forEach(System.out::println);
		
		//java.io.FileInputStream fIN= new java.io.FileInputStream(new File(""));
		
		Files.lines(Paths.get("ABC.txt")).filter(a->!a.isEmpty()).forEach(System.out::println);
		
		
	}

}

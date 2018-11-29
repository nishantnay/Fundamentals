package StringRelated;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Stream;

public class DuplicateCharacterFinder {
	static char givenChar; 
	static boolean isFirst= true;
	static String givenString ="AaNayanamy";
	public static void main(String[] args) {
		
		
		/*String levelledName= givenString.toLowerCase();
		// Find duplicate strings which is case sensitive.
		
		Map<Character, Integer> duplicateFindre= new HashMap();
		
		for(char c: levelledName.toCharArray()){
			
			if(duplicateFindre.containsKey(c)){
				duplicateFindre.put(c, duplicateFindre.get(c)+1);
			}else{
				duplicateFindre.put(c, 1);
			}
		}
		 		 
		 for (Entry<Character, Integer> entry: duplicateFindre.entrySet()){
			 if (entry.getValue()>1)
			 System.out.println(entry.getKey()+" is duplicated "+entry.getValue()+" times");
		 }*/
		 
		 // Another Approach
//		 /
		char[] arr= givenString.toCharArray();
		
		//Arrays.stream
		
		Stream.of('A','a','N','a','y','a','n','a','m','y')
			.distinct()
			.forEach(System.out::println);
		 /*//Stream.of(0,1,2,3,4,5,6,7,8,9)
		 	.map(givenString::charAt)
		 	.filter(DuplicateCharacterFinder::isNotDuplicate)
		 	.forEach(System.out::println);*/
		
	}
	public static boolean isNotDuplicate(char c){
		if(isFirst){isFirst= false; givenChar= c;return true;}
		
		
		return c==givenChar?false:true; 
	}

}

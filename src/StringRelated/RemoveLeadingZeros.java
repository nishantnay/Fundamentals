package StringRelated;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RemoveLeadingZeros {

	public static void main(String[] args) {
	/*	Input : 00000123569
		Output : 123569

		Input : 000012356090
		Output : 12356090*/
		
		String givenText="00000123569";
		char[] text=givenText.toCharArray();
		
		//Stream<Character> stream= IntStream.range
		System.out.println("Remove Leading Print Stream Ways: ");
		IntStream
			.range(0, text.length)
			.mapToObj(i -> text[i])
			.filter(a->Character.getNumericValue(a)!=0)
			.forEach(System.out::println);
		
		// Imperative style
		System.out.println("Remove Leading Print Imperative Ways: ");
		System.out.println(removeZerosandPrint(givenText));
		
		// What if the objective is to remove trailing zeros.
		
		System.out.println("Remove Trailing Print Stream Ways: ");
		String givenTrailingText= "12356900000";
		
		char[] trail= givenTrailingText.toCharArray();
		List<Character> asd= IntStream.range(0,  trail.length)
				.mapToObj(a->trail[trail.length-1-a])
				.filter(a->Character.getNumericValue(a)!=0)
				.collect(Collectors.toList());
				
		
		LinkedList<Character> myList= new LinkedList<>();// asd;
		myList.addAll(asd);
		myList.descendingIterator()
				.forEachRemaining(System.out::println);
		
		System.out.println("Remove Trailing Print Imperative Ways: ");
		System.out.println(removeTrailingZerosandPrint(givenTrailingText));
	}

	private static String removeZerosandPrint(String givenText) {
		int i=0;
		StringBuilder build= new StringBuilder(givenText);
		while(build.charAt(i)=='0'){
			
			build.deleteCharAt(i);
			
		}
		return build.toString();
		
	}
	private static String removeTrailingZerosandPrint(String givenText) {
		int i=1;
		StringBuilder build= new StringBuilder(givenText);
		while(build.charAt(build.length()-i)=='0'){
			
			build.deleteCharAt(build.length()-i);
			
		}
		return build.toString();
		
	}

}

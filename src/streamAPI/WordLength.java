package streamAPI;

import java.util.Arrays;
import java.util.stream.Collectors;

public class WordLength {
	public static int getNameLength(String name){
		
		return name.length();
	}

	public static void main(String[] args) {

		Arrays.asList("Nishant", "Nayanam","Aniruddha").
		stream().map(WordLength::getNameLength).collect(Collectors.toList()).forEach(System.out::println);
	}

}

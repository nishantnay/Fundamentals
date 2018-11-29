package StringRelated;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NonAlphabeticalRemoval {

	public static void main(String[] args) {
		
		String givenString="Aza1d is a good 1boy, is1n’ t he ?";
		
		String d="[^,'?]";
		Pattern p= Pattern.compile(d);
		//String[] asd=givenString.split("(?<=[,.])|(?=[,.])|\\s+");//(?=[,.'])|\\s+
		
		String[] asd=givenString.split("[,']");
		
		for(String s: asd){
			
			s.chars().allMatch(Character::isLetter);
			System.out.println(s);
		}
		
		
		
	}

}

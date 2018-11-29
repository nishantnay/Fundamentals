package StringRelated;

import java.util.Arrays;

public class RemoveWordFromString {
	
	static StringBuffer bf= new StringBuffer();
	public static void append(String a){
		bf.append(a+" ");
		//return "";
	}

	public static void main(String[] args) {
		String sentence= "This is an amazing exeperience";
		String word="an";
		
		if (sentence.contains(word)){
			String temp= sentence.replaceAll(word, "");
			System.out.println(temp);
		}
		
		Arrays.stream(sentence.split(" "))
				.filter(a-> !a.equals("an"))
				.forEach(action->RemoveWordFromString.append(action));
		System.out.println(bf.toString());
				
	}

}

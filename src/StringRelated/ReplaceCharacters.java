package StringRelated;

public class ReplaceCharacters {
	
	
	/*
	 * This program will replace certain characters from a given string. 
	 */
	
	public static String replaceString(String str, char old, char newChar){
		return str.replace(old, newChar);
		
		//int length =str.length();
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(ReplaceCharacters.replaceString("This is Nishant Nayanam", 'a','b'));
	}

}

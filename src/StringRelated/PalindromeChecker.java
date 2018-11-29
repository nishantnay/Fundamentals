package StringRelated;

import java.util.stream.IntStream;

public class PalindromeChecker {
	

	boolean checkPalRecur(String s, int startIndex, int lastIndex){
		/*
		if (startIndex==lastIndex || startIndex>lastIndex)
			return true;
		boolean isPal= true;
		
		if (s.charAt(startIndex)== s.charAt(lastIndex)){
			return checkPalRecur(s, startIndex+1,lastIndex-1);
		}else{
			isPal= false;
		}
		return isPal;*/
		if (startIndex==lastIndex )
			return true;
			
		if ((s.charAt(startIndex))!=( s.charAt(lastIndex))){
			return false;
		}
		if (startIndex<lastIndex+1){
			return checkPalRecur(s, startIndex+1,lastIndex-1);
		}
		
		return true;
		
	}
	boolean checkPalAPI(String s){
		
		String reversed= new StringBuilder(s).reverse().toString();
		return s.equals(reversed);
	}
boolean checkPalIndex(String s){
	
	int stringLength= s.length();
	boolean isPal= true;
	for(int i=0; i<stringLength/2; i++){
		if ((s.charAt(i))!=(s.charAt(stringLength-(1+i)))){
			isPal= false;
			break;
		}
	}
	return isPal;		
	
}

boolean checkPalStream(String s){
	
	return IntStream.range(0, s.length()/2).noneMatch(x-> s.charAt(x)!= s.charAt(s.length()-x-1));
	
}

	public static void main(String[] args) {
		
		
		
		PalindromeChecker pl= new PalindromeChecker();
		//System.out.println((pl.checkPalStream("DAAD")==true)? "checkPalStream: DALADA is pallindrome.":"checkPalStream:=DALAD is not pallindrome.");
		
		System.out.println((pl.checkPalRecur("DAFD", 0, 3)==true)? "checkPalRecur: DALADA is pallindrome.":"DALAD is not pallindrome.");
		//System.out.println((pl.checkPalAPI("DALAD")==true)? "checkPalAPI: DALAD is pallindrome.":"DALAD is not pallindrome.");
		//System.out.println((pl.checkPalIndex("DALAD")==true)? "checkPalIndex: DALAD is pallindrome.":"DALAD is not pallindrome.");
	}

}

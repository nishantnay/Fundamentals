package StringRelated;

public class Random {

	public boolean checkPallRec(String s){
		int length= s.length();
		
		if (length<1)
			return true;
		boolean val= true;

		if (s.charAt(0)== s.charAt(length-1))
			checkPallRec(s.substring(1,length-2));
		else{
			val= false;
		}
		return val;
	}
	void checkPollStBuffer(String s){
		String reversed= new StringBuffer(s).reverse().toString();

		if (s.equals(reversed)){
			System.out.println("Pallindrome");
		}else
			System.out.println("Not a pallindrome.");
	}

	void chekPallForEach(String s){
		boolean isPal= true;
		int length= s.length()/2;
		System.out.println(length);
		for(int i=0; i<length; i++){
			System.out.println(s.charAt(i));
			System.out.println(s.charAt(s.length()-(i+1)));
			if (!(s.charAt(i)== s.charAt(s.length()-(i+1)))){

				isPal=false;
			}	

		}
		if (isPal){
			System.out.println("Pallindrom");
		}
	}

	public static void main(String[] args) {
		String pal= "DALLADz";
		Random r= new Random();		

		if (r.checkPallRec(pal))			
			System.out.println("Pallindrome!");
		else
			System.out.println("Not Pallindrome!");



	}

}

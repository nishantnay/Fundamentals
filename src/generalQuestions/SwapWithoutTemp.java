package generalQuestions;

public class SwapWithoutTemp {

	public static void main(String[] args) {
		
		int a=5;
		int b =4;
		
		// Get a=5 and b=4;
		System.out.println("A: "+a+" B: "+b);
		a=a+b;
		b= a-b;
		a=a-b;
		System.out.println("A: "+a+" B: "+b);
		

	}

}

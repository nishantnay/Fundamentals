package Recursive;

public class Fibonacci {
	
	public static int  getSeriesSum(int end){
		
			int firstNumber=1;
			int secondNumber= 1;
			int sum=0;
			
			System.out.println(firstNumber);
			do{
				System.out.println(secondNumber);
				sum=firstNumber+secondNumber;
				firstNumber=secondNumber;
				secondNumber=sum;
			}
			while(sum< end);
		
		return sum;
	}
	
	public static int fibonacci(int n)  {
	    if(n == 0)
	        return 0;
	    else if(n == 1)
	      return 1;
	   else
	      return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static void main(String[] args) {
		
		getSeriesSum(100);
		
		//System.out.println( fibonacci(10));
	}

}

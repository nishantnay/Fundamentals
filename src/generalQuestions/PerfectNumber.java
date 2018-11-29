package generalQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class PerfectNumber {

	public static void main(String[] args) {


		// WAP to print all perfect numbers till 10000;

		/*
		 * In number theory, a perfect number is a positive integer that is equal to the 
		 * 
		 * sum of its proper positive divisors, that is, the sum of its positive divisors
		 *  excluding the number itself (also known as its aliquot sum). 
		 *  Equivalently, a perfect number is a number 
		 * that is half the sum of all of its positive divisors (including itself) 
		 * 
		 */

		for(int i=4; i<=6; i++){
			getDivisors(i);
		}
		int number =6;
		System.out.println(number+" is a perfect number? :"+isPerfectNumber(6));


	}
	private static boolean isPerfectNumber(int i) {
		int sum =0;
		for (int j=1; j<=i/2; j++){
			if (i%j==0){
				sum+=j;
			}
		}
		return (sum==i);
		
		
	}
	private static void getDivisors(int number){
		List<Integer> returnData= new ArrayList<>();
		if (number<=1) return ;
		for(int i=2; i*2<=number; i++){
			if (number%i==0) returnData.add(i);
		}
		if( returnData.stream().mapToInt(Integer::intValue).sum()+1==number){
			System.out.print(number +"[");// is a Perfect number.");
			returnData.stream().limit(returnData.size()-1).forEach(s->System.out.print(s+","));
			returnData.stream().skip(returnData.size()-1).forEach(s->System.out.print(s));
			System.out.print("]"+" is a Perfect number.");
			System.out.println();
			System.out.println("********************");
		}
	}

}

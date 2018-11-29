package array;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.print.attribute.IntegerSyntax;

public class GoogleTEst {
	
	static List<Integer> getOddNumbers(int a, int b){
		
		Stream<Integer> numbers= IntStream.rangeClosed(a,b).boxed();
		return	numbers.filter(s->s%2!=0).collect(Collectors.toList());
		
	}

	public static void main(String[] args) {
		
		//getOddNumbers( 3,  9).forEach(System.out::println);;
		Scanner scan = new Scanner(System.in);
        //int i = scan.nextInt();
        double d= scan.nextDouble();
        //String s= scan.next();
        scan.close();
            
        // Write your code here.

        //System.out.println("String: "+s);
        System.out.printf("Double: %f\n" + d);
        //System.out.println("Int: " + i);
	}

}

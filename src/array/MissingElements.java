package array;
/*

1. Problem Statement:
You have given an integer array of size N. Array contains numbers from 1 to N-1 but a 
couple of numbers are missing in an array which also contains duplicates. 
Write a Java program to print the missing number from the sequence.

For example, if given array is {1, 1, 2, 3, 5, 5, 7, 9, 9, 9} then it has length 10 and contains a number from 1 to 9. 
In this case, missing numbers are 4, 6, and 8.

Read more: https://javarevisited.blogspot.com/2018/04/how-to-find-k-missing-numbers-in-array-java.html#ixzz5KMVqhEYW
 */

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MissingElements {
	static int y=1;
	static boolean isFirstElement=false;
	static int value;
	static int frequency;

/*public static int getIncrementedCount(){
	return y++;
}
*/

	
	public static void main(String[] args) {
		
		
		int []numbers= { 5, 5, 7, 9, 9, 9,15,15,18};// Given array of integers.
		
		
		List<Integer> arr= Arrays.asList(1,2,3,4,5);
		
		String val= arr.contains(1)==true?"YES":"NO";
		
		System.out.println(val);
		
		
		
		
	/*	Arrays.stream(numbers).distinct().sorted().boxed().forEach(x->{
			y=x;
			if (!isFirstElement){
				isFirstElement=true;
				
			}else{
				while((x-y)>1){
					System.out.println(++y);
				}
			}
			
		});
		
		Arrays.stream(numbers).sorted().boxed().forEach(x->{
			
			if (!isFirstElement){
				isFirstElement=true;
				value=x;
				frequency= 1;
				
			}else{
				if (value==x){
					frequency++;
				}else{
					System.out.println(frequency>1?value +" is duplicated "+frequency+" times.":"");
					value=x;
					frequency= 1;
				}
			}
			
		});
		
		
		List<Integer>num=Arrays.stream(numbers).distinct().sorted().boxed().collect(Collectors.toList());
		
		for(int i=0; i< num.size(); i++){
			if ((i+1)<num.size()){
				int var= num.get(i+1)- num.get(i);
				int j=1;
				while(var>1){
					System.out.println(num.get(i)+j);
					var--;
					j++;
				}
			
			}
		}*/

		// First approach using duplicate arrays.
		/*
		int []duplicateArray= new int[10];
		
		int length= numbers.length;
		
		for (int a = 0; a< length; a++){
			
			if (duplicateArray[numbers[a]]!=numbers[a]){
				duplicateArray[numbers[a]]=numbers[a];
			}
		}

		for (int a = 0; a< duplicateArray.length; a++){
			System.out.println(duplicateArray[a]);
		}
		for (int a = 1; a< duplicateArray.length; a++){
			if(duplicateArray[a]==0)
			System.out.println("Duplicate number :"+a);
		}
		
		*/
		
		//Second approach using set theory.
		
		// Create a set of numbers with all the required elements.
	/*	int q= 1;
		Set<Integer> allNumbers= new HashSet<>();
		Set<Integer> dupNumbers= new HashSet<>();
		for (; q<10; q++ ){
			allNumbers.add(q);
			dupNumbers.add(numbers[q-1]);
		}
		dupNumbers.add(numbers[q-1]);
		allNumbers.removeAll(dupNumbers);
		System.out.println(allNumbers);*/
		
		
		
		
	}

}

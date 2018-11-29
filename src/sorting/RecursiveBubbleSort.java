package sorting;

import java.util.Arrays;

public class RecursiveBubbleSort {
	
	public void doRecusrsiveSorting(int[] arr, int length){
		if (length<1)
			return;
		for(int i= 0; i< length-1; i++){
			
				if (arr[i]>arr[i+1]){
					int temp = arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
		
		}
		doRecusrsiveSorting(arr, --length);
		
	}

	public static void main(String[] args) {
		
		int []arr ={0,2,1,5,7,8,1,0,5,7,9,1,23};

		RecursiveBubbleSort reSort= new RecursiveBubbleSort();
		reSort.doRecusrsiveSorting(arr, arr.length);
				Arrays.stream(arr).forEach(System.out::print);
	}

}

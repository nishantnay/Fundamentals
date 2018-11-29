package sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {


		int[] arr= {5,3 ,5,2,0,4,8,2,7,6};

		int length= arr.length;
		Arrays.stream(arr).forEach(System.out::print);	
		System.out.println("-----------");
		for (int i=0; i<length; i++){
			int minIndex=i;
			for(int j=i+1; j<length; j++){

				if (arr[minIndex]>arr[j]){
					minIndex=j;
					int temp= arr[i];
					arr[i]=arr[minIndex];
					arr[minIndex]=temp;
				}
				Arrays.stream(arr).forEach(System.out::print);	
				System.out.println();
			}
	
			
		}

	}

}

package searching;

import javax.sound.sampled.SourceDataLine;

public class BinarySearch {
	
/*	Binary search would require the array to be 
	sorted in either ascending or descending order.*/
	
	public static int[] sortDescArray(int [] arr){
		
		
		for (int i= 0; i<arr.length; i++){
			int minINdex=i;
			for (int j=i+1; j< arr.length; j++){
				if (arr[minINdex]< arr[j]){
					minINdex= j;
				}
			}
			int temp = arr[i];
			arr[i]= arr[minINdex];
			arr[minINdex]=temp;
		}
		return arr;
	}
	
	public static int getIndex(int [] arr,int startingIndex, int lastIndex, int number){
		
		
		int mid= lastIndex/2;
		if (number== arr[mid])
			return mid;
		if (number> arr[mid]){
			
			getIndex(arr, startingIndex, mid, number);
		}else{
			getIndex(arr, mid, lastIndex, number);
		}
		return -1;
		
	}

	public static void main(String[] args) {
		
		int [] arr={1,3,7,1,4,98,12,10};
		
		
		System.out.println(getIndex(sortDescArray(arr),0,arr.length, 3));
		
		
		
		

	}

}

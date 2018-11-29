package sorting;

import java.util.Arrays;


/**
 * 
 * This class implements the sorting using Selection Sorting Technique.
 * @author nishantnay
 *
 */
public class ArraySort {
/*	028194587
	018294587
	012894587
	012498587
	012458987
	012457988
	012457898
	012457889
	012457889*/

	
	public static void main(String[] args) {
		
		int [] arr= {7,2,8,1,9,4,5,8,0};
		int arrayLenght= arr.length;
		
		for(int i=0;i<arrayLenght; i++){
			int minIndex=i;
			
			for (int j=i+1; j<arrayLenght; j++){
				
				if (arr[minIndex]>= arr[j]){
					minIndex=j;
					
				}
			}
			int temp= arr[i];
			arr[i]=arr[minIndex];
			arr[minIndex]=temp;
			
			
		
			
		/*	arr[i]+= arr[minIndex];
		arr[minIndex]=arr[i]-arr[minIndex];
			arr[i]=arr[minIndex]-arr[i];*/
			
			/*for(int i=0;i<arrayLenght-1; i++){
				int minIndex=i;
				//int minNumber=arr[minIndex];
				for (int j=i+1; j<arrayLenght; j++){
					
					if (arr[minIndex]>arr[j]){
						minIndex=j;
						//minNumber=arr[minIndex];
					}
				}
				int temp= arr[minIndex];
				arr[minIndex]=arr[i];
				arr[i]=temp;
				*/
			//Arrays.stream(arr).forEach(System.out::print);
			//System.out.println();
		}
		Arrays.stream(arr).forEach(System.out::println);
	}

}

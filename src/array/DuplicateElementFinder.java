package array;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateElementFinder {
	
	private Integer []allNumber= {1,1,1,2,2,3,8,9,10,10,15,15,15,2,1,1,1,8,9,6,10};
	
	public Map<Integer, Integer> getDuplicateNumbers(){
		Map<Integer, Integer> returnData= new HashMap<>();
		/*//Set<Integer> uniqueValues= new HashSet<>();
		
		for(int i=0; i< allNumber.length; i++){
			if (!returnData.containsKey(allNumber[i])){
				returnData.put(allNumber[i],1);
				
			}else{
				returnData.put(allNumber[i],returnData.get(allNumber[i])+1);
				
			}
			
		}*/
		//Arrays.stream(allNumber).
		//better approach to tackle same problem
		List<Integer> numbers= Arrays.asList(1,1,1,2,2,3,8,9,10,10,15,15,15,2,1,1,1,8,9,6,10);
		List<Integer> uniqueNumbers=numbers.stream().distinct().collect(Collectors.toList());//.forEach(System.out::println);
		
		uniqueNumbers.stream().forEach(n->{System.out.println(n+" occured "+Collections.frequency(numbers,n)+" times.");});
		
		uniqueNumbers.stream().forEach(n->{System.out.println(Collections.frequency(numbers,n)>1?n+" occured "+Collections.frequency(numbers,n)+" times.":"");});
		
		
		
		return returnData;
	}

	public static void main(String[] args) {
		
		DuplicateElementFinder dFinder =new DuplicateElementFinder();
		dFinder.getDuplicateNumbers();
		/*for(Map.Entry<Integer,Integer> KVPair : dFinder.getDuplicateNumbers().entrySet()){
			if(KVPair.getValue()!=1)
			System.out.println("Key :"+KVPair.getKey()+" Duplicated: "+KVPair.getValue()+" times.");
		}*/
	}

}

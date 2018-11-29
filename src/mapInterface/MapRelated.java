package mapInterface;

import java.util.HashMap;
import java.util.Map;

public class MapRelated {
	
	private int rollNum;
	private String name;
	
	public MapRelated(int rollNum, String name){
		
		this.name= name;
		this.rollNum= rollNum;
	}
	
	@Override
	public String toString(){
		return "Name: "+name+", Roll: "+rollNum;
	}

	public static void main(String[] args) {
		
		Map<Integer, String> student= new HashMap<>();
		HashMap<Integer, MapRelated> teacher= new HashMap<>();
		
		student.put(1,"Nishant");
		student.put(2, "Nayanam");
		
		MapRelated t1=new MapRelated(1,"Ramesh");
		MapRelated t2=new MapRelated(2,"Suresh");
		
		teacher.put(1,t1);
		teacher.put(2,t2);
		t2=new MapRelated(3,"Dinesh");// Java is strictly pass by value.
		teacher.clone();
		
		//student.entrySet().stream().forEach(x->System.out.println(x.getKey()+" : "+x.getValue()));
		
		teacher.values().stream().forEach(x->System.out.println(x.name+": "+x.rollNum));
		System.out.println(t2.toString());
	}

}

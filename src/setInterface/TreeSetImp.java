package setInterface;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetImp {

	public static void main(String[] args) {
		
		
		Set<String> cups= new TreeSet<>();
		
		cups.add("Nishant");
		cups.add("Nayanam");
		cups.add("Nishant");
		cups.add("Mahesh");
		cups.add("Rajesh");
		cups.add("Nishant");
		
		
		cups.stream().filter(a->a.startsWith("M")).forEach(System.out::println);
		
		/*System.out.println(((TreeSet<String>) cups).pollFirst());
		Iterator<String >it= cups.iterator();
		while (it.hasNext()){
			String asd=it.next();
			System.out.println(asd); 
			cups.remove(asd);// Will result in ConcurrentModificationException.
			
			Mahesh
			Nayanam
			Nishant
			Rajesh

			 // Output is sorted in natural way.
		}
	
		Iterator<String >descit= ((TreeSet<String>) cups).descendingIterator();
		// only in TreeSet and not in Set so have to typecast
		while (descit.hasNext()){
			System.out.println(descit.next());*/ 
			/*
		Rajesh
		Nishant
		Nayanam
		Mahesh

			*/ // Output is sorted in natural way.
		}
		
		
		
	

}

package comparatorInterfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		
		
		Employee e1= new Employee("X", "QA", 555d);
		
		Employee e2= new Employee("Y", "Dev", 555d);
		Employee e3= new Employee("Z", "Eng", 999);
		
		List<Employee> empList= new ArrayList<>();
		List<String> stringVal= new ArrayList<>();// Run time Polymorphism .
		
		LinkedList<String> linkedList= new LinkedList<>(); // No polymorphism
		
		
		//linkedList.
		String a="Raj";
		String f="Makhni";
		String s="ASDF";
		String v="jkdfangk";
		
		stringVal.add(f);
		stringVal.add(a);
		stringVal.add(s);
		stringVal.add(v);
		
		//f="Nishant";
		
		stringVal.stream().forEach(System.out::println);
		System.out.println(f.hashCode());
		/*
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		
		
		e3= new Employee("W", "Eng", 999);
		for (Employee employee : empList) {
			//System.out.println(employee.getEmpName());
			
			System.out.println(employee.toString());
		}
		
		
		
		//Collections.sort(empList);
		Collections.sort(empList,(Employee one, Employee two)->{			
				
			return (( one).getEmpName()).compareTo(( two).getEmpName());
		});
		
		for (Employee employee : empList) {
			System.out.println(employee.getEmpName());
		}*/	
	}

}

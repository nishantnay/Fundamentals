package generalQuestions;

import java.util.ArrayList;
import java.util.List;

public class CollectionInitilization {

	public static void main(String[] args) {
		String country;

		List<String> cities = new ArrayList<String>(){/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

		{
			
			add("Nishant");
		}};
		cities.add("Delhi");
		cities.add("New York");
		cities.add("Beijing");
		cities.add("1kjh1231");

		country = cities.stream()
		                    .filter( c -> c.equals("Nishant"))
		                    .findAny()
		                    .map(v -> "Nayanam")
		                    .orElse(null);
		System.out.println(country);

	}

}

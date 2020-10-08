package may4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class haas {

	public static void main(String[] args) {
		

	
			LinkedHashMap<String, String> capitalCities = (LinkedHashMap<String, String>) new HashMap<String, String>();
			capitalCities.put("chennai", "TN");
			capitalCities.put("delhi", "UP");
			capitalCities.put("Panaji", "Goa");
			System.out.println(capitalCities);
			System.out.println(capitalCities.get("chennai"));
			System.out.println(capitalCities.size());
	
	}

}

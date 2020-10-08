package collect;

import java.util.HashMap;
import java.util.Map;

public class MMap {

	public static void main(String[] args) {
		Map<String,Integer> grade= new HashMap<String,Integer> ();
		grade.put("Sanjay", 1981);
		grade.put("Jyoti", 1977);
		grade.put("sunita", 1980);
		System.out.println(grade.replace("sunita", 1980, 1204));
		
System.out.println(grade);

	}

}

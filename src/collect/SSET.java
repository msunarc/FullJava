package collect;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SSET {

	public static void main(String[] args) {
		TreeSet<String> movie= new TreeSet<String>();
		//Set<String> movie= new LinkedHashSet<String>();
		movie.add("devdas");
		movie.add("bazigar");
		movie.add("dil se");
		movie.add("dil se");
	System.out.println(movie);
	System.out.println(movie.size());
	System.out.println(movie.equals("dil se"));
	Object[] movieArray=movie.toArray();
	System.out.println(movie);

	}

}

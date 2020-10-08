package collect;

import java.util.ArrayList;
import java.util.Collections;

public class lisst {

	public static void main(String[] args) {
		ArrayList<String>flowers = new ArrayList<String>();
		flowers.add("Jasmine");
		flowers.add("sunflower");
		flowers.add("Rose");
		flowers.add("Tulip");
		System.out.println(flowers);
		System.out.println(flowers.contains("tulip"));
		Collections.sort(flowers);
		System.out.println(flowers.indexOf("tulip"));
		

	}

}

package MKfiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.imageio.stream.FileImageInputStream;

public class MakProp {
	
	public static String readprop(String a) throws IOException{
		
		String path="Date\\date.prop";
		
try {	
	
	Properties f =new Properties();
	
	FileInputStream bd=new FileInputStream(path);
	
     f.load(bd);

return f.getProperty(a);

}
catch(FileNotFoundException e) {
	System.out.println("u missed the date");
return null;
	
	
}

	
	
	
	
	
	
	
	
}

	
}
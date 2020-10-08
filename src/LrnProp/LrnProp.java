package LrnProp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LrnProp {
 public static String pado(String name)  {
	 String path="pakdo\\sweet.prop";
	 try {
	 Properties pr=new Properties();
	     FileInputStream fis =new FileInputStream (path);
	     pr.load(fis);
	   return(pr.getProperty(name));
	 }
	 catch(IOException e ) {
		System.out.println();
	     return null;
	 }
 }
}

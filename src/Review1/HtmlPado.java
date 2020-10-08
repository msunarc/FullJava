package Review1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


  public class HtmlPado {
  
		/*
		 * public static void html() { String path="ReviewFile\\new 1.html"; try { File
		 * f= new File(path); FileReader fr= new FileReader(f); BufferedReader br =new
		 * BufferedReader(fr); String Line=null; while((Line=br.readLine())!=null) {
		 * System.out.println(Line); }} catch(IOException e) { e.printStackTrace();} }
		 */
	  
	  
	  public static void htmllekho() {
		  String path="ReviewFile\\\\new 1.html";
		  try {
			  File f= new File(path);
			  FileWriter fw=new FileWriter(f);
			  BufferedWriter bw=new BufferedWriter(fw);
			  bw.newLine();
			  bw.write("colorful");
			  bw.newLine();
			  bw.write("time flies in fun n laughter");
			  bw.close();
		  }
		  catch(IOException e) {
			  e.printStackTrace();
		  }
	  }
  }
  
 

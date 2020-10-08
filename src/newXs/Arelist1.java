package newXs;

import java.util.ArrayList;
import java.util.Collections;

public class Arelist1 {

	public static void main(String[] args) {
		
		
		  ArrayList<String>chocolates=new ArrayList<String>();
		  
		  chocolates.add("cadbury's"); chocolates.add("fivestar");
		  chocolates.add("ferrorocher"); chocolates.add("truffles"); // collection with
		  //capital is used to get answer in an order // need to import also
		  Collections.sort(chocolates);
		  
		  System.out.println(chocolates); System.out.println(chocolates.get(2));
		  System.out.println(chocolates.remove(1));
		  
		  System.out.println(chocolates);
		  System.out.println(chocolates.add("milky bar"));
		 
		
	
	ArrayList<Integer>digits=new ArrayList<Integer>();
	digits.add(345);
	digits.add(543);
	digits.add(444);
	digits.add(123);
	digits.add(321);
	for(int i=0;i<digits.size();i++) {
System.out.println(digits.get(i));//note get syntex is used
		
		/*ArrayList<Character>Alphabets=new ArrayList<Character>();
		Alphabets.add('A');
		Alphabets.add('b');
		Alphabets.add('C');
		Alphabets.add('D');
		Alphabets.add('E');
		Alphabets.add('F');
		for(Character a :Alphabets) {
			System.out.println(Alphabets);// no get syntex
*/			
			
			
	
		}
		
		
		
	}
	
}

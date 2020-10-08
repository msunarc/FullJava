package naveen_example;

import java.util.Scanner;

public class vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner value = new Scanner (System.in);
		String letter = value.nextLine();
		switch (letter) {
		case "a":
		case "e":
		case "i":
		case "o":
			System.out.println("Given value is vowel");
			break;
			default :System.out.println("value is not vowel");
		
		}
		

	}

}

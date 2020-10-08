package naveen_example;

import java.util.Scanner;

public class Largest_of_three {

	public static void main(String[] args) {
		Scanner value= new Scanner (System.in);
		System.out.println("First number = ");
		int first_number = value.nextInt();
		System.out.println("Second number = ");
		int second_number = value.nextInt();
		System.out.println("Third number = ");
		int third_number = value.nextInt();
		if (first_number>second_number)  (first_number>third_number){
			System.out.println("First number is biggest");
		}
		else if  (second_number>third_number){
			System.out.println("Second number is biggest");
		}
		else {
			System.out.println("Third number is biggest");
			
		}
	}

}

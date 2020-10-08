package naveen_example;

import java.util.Scanner;

public class evenORodd {

	public static void main(String[] args) {
	Scanner number = new Scanner(System.in);
	int value = number.nextInt();
	if (value%2==0) {
		System.out.println("Given number is Even");
	}
		else System.out.println("Given number is odd");
	}

	}



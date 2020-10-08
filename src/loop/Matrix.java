package loop;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner abc= new Scanner(System.in);
		int x=abc.nextInt();
		for (int i=1;i<=x;i++) {
			for (int j=1;j<=x;j++) {
				System.out.print(j*i + "\t");
			}
			System.out.println();*/
		
		
for (int i=1;i<=4;i++) {
	for (int j=1;j<=i;j++) {
		System.out.print(" ");
	}
	for  (int k=4;k<=i;k++) {
		System.out.print(" *");
	}
	System.out.println();
	}
for(int m=1;m<=3;m++) {
	System.out.println(m);}
	
	{System.out.println("------------");}//STRING array//
			
	String[] colors= {"red","yellow","orange"};
	for(int i=0;i<3;i++) {
	System.out.println(colors[i]);}
	
	System.out.println("-------------");
	
	String[][] colors1= {{"red","yellow","orange"},//2d array//
			{"pink","blue","white"}};
	for(int j=1;j<2;j++) {
		for(int k=0;k<3;k++) {
		
	System.out.println(colors1[j][k]);	}

}
}
}
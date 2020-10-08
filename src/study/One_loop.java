package study;

import java.util.Scanner;

public class One_loop {

	public static void main(String[] args) {
	/*	//string -int
		String a="23";
	int s =Integer.parseInt(a);
		System.out.println("String= "+(a+4));
		System.out.println("Integer= "+(s+4));
		
		int num=256;
		
		
		
		
		
		
		
		
		
		
		
//int=string
		int x=34;
		String b=Integer.toString(x);
		System.out.println("Integer = "+(x+3));
		System.out.println("String  = "+(b+3));*/
	/*	
	//	Sum of int from scanner
		
		Scanner ab= new Scanner(System.in);
		int number=ab.nextInt();
		int sum=0;
		int rem=0;
		int i=0;
		while(number>0) {
			rem=number%10;//45
			sum=rem+sum;//
			number=number/10;
			i++;
		}
			System.out.println("sum="+sum);
		}
	*/
	
	

			
int num=234;
int sum=0;
int rem=0;
while(num>0) {
	rem=num%10;//234=4//2.3=3//2
	sum=sum+rem;//0+4=4//3+4=7//7+2
	num=num/10;//23=2.3//2
}
System.out.println(sum);//9
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	}	
		
		
		
		
	



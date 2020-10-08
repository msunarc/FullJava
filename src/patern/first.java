package patern;

import java.util.Scanner;

public class first {

	public static void main(String[] args) {
		
//		Scanner n=new Scanner(System.in);
//		int num =n.nextInt();
//		int temp=num;
//		int sum=0;
//		int remin;
//	
//		while(num>0) {
//			remin= num%10;
//			sum=(sum*10)+remin;
//			num=num/10;
//				}
//if(temp==sum) {
//	System.out.println("number is  palindrome");
//}else {
//	System.out.println("number is not palindrome");
//}
//
//	



String alpha="mom";
String reverse="";
char [] ab=alpha.toCharArray();
for(int k=alpha.length()-1;k>=0;k--) {
	reverse= reverse+ab[k];
}
if (reverse.equalsIgnoreCase(alpha)) {
	System.out.println("word is palindrome");
}else {
	System.out.println("not palindrome");
}
	}
}






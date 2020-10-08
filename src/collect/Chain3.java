package collect;

import collect.Chain3.Chain2;

public class Chain3  {
	public static void chocolate1() {
		System.out.println("dairy milk");
	}
	
      public void toffee() {
   System.out.println("candy");
   }
public static class Chain2 extends Chain3 {
	public static void chocolate2() {
		System.out.println("dairy milk");
	}
	
 public void toffee() {
System.out.println("candy");
}
}

}

	
	public class Chain1 extends Chain2 {
	public static void main(String[] args) {
		
		chocolate();
		Chain1 c=new Chain1();
		c.toffee();
		
		
		
	}
		public static void chocolate() {
			System.out.println("dairy milk");
		}
		
     public void toffee() {
	System.out.println("candy");
}
	}



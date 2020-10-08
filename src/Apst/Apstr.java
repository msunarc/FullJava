package Apst;


interface shirt{
	void kurta();
}

abstract class Gents{
	public void pant() {
		System.out.println("bell bottom");
	}
	 abstract void dhothi();
	
}
 class clothes extends Gents implements shirt{
	 public void diaper() {
		 System.out.println("diaper");
	 }

	@Override
	void dhothi() {
		System.out.println("dhoti");
		
		
	}

	@Override
	public void kurta() {
		System.out.println("kurta");
		
	}
	
 }


public class Apstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		clothes c = new clothes();
        c.pant();
        c.dhothi();
        c.diaper();
        c.kurta();
	}

	
	
	
	
	
	
	
	
	
	

	
	
}


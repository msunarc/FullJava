interface airline{
	void singapore();
	void emirates();
}
abstract class flights {
	public void A380() {
		System.out.println("A380 is best");
	}
	abstract void boeing777();
}
  class  chadi extends flights implements airline {
	public  void bluebird() {
		System.out.println("bluebird");
	}
	void boeing777() {
		// TODO Auto-generated method stub
		System.out.println("boeing 777");
	}
	@Override
	public void singapore() {
		System.out.println("Singapore");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void emirates() {
		System.out.println("emirates");
		// TODO Auto-generated method stub
		
	}
	
}

public class Abstra {

	public static void main(String[] args) {
		System.out.println("MH 737");
		airforce();
		chadi fl=new chadi();
	
	fl.boeing777();
	fl.bluebird();
		fl.A380();
		fl.singapore();
		fl.emirates();
		

	}
        public static void airforce() {
        	System.out.println("Air force");
        }
}

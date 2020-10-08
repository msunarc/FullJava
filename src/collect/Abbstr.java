package collect;

interface vehicle{
	void twowheeler();
	void threewheeler();
}
abstract class bikes {
	public static void bullet() {
		System.out.println("enfield");
	}
	abstract void scooty();
	abstract void tvs();
	
}
 class Flights extends bikes implements vehicle{

	@Override
	public void twowheeler() {
		System.out.println("lady bird");


	}

	@Override
	public void threewheeler() {
		System.out.println("tricycle");
		
	}

	@Override
	void scooty() {
		System.out.println("tvs scooty");
		
	}

	@Override
	void tvs() {
		System.out.println("bajaj scooter");
	}

	
	
}

public class Abbstr {

	public static void main(String[] args) {
		
Flights f= new Flights();
f.twowheeler();
f.threewheeler();
f.tvs();
f.scooty();
bikes.bullet();
	}

}

package Studyconstruct;

public class Study extends Study3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Study s =new Study();
		s.area();
		s.area("area",3.3);
		Study3 s3=new Study3();
		s.area(3,4);
		s.area(3.3,"area");
		Studyb sb= new Studyb();
		sb.area();
		sb.area("area", 3);
		
		
		
	}
	public void area() {
		int x=3;
		int y=3;
		super.area();
		System.out.println("area of a square= "+3*3);
		}
	public void area(String b,double a) {
		String x="area";
		int y=12;
		System.out.println(x+y);
		
	}
	
	
	
	
}

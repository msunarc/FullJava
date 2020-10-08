package collect;
public class Getnset {
	 String a;
	 int x;
	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}


	public static void main(String[] args) {
		Getnset p=new Getnset();
		p.a=("sanjay");
		p.x=34;
		System.out.println(p.getA());
		System.out.println(p.getX());

	}

}

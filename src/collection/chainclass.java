package collection;
class chain{
	private int number;
	chain (int num){
		number=num;
		
	}
	public chain add(int toadd) {
		number += toadd;
		return this;
			
	}
	public void print() {
		System.out.println(number);
	}
}
public class chainclass {

	public static void main(String[] args) {
		chain cn = new chain(10);
		cn.add(5);
		cn.add(15);
		cn.print();

	}

}

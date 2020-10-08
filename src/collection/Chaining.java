package collection;

public class Chaining {
	int num;
	String name;
	float no;
	
	Chaining ( int num, String  name){
		this.name=name;
		this.num=num;
		
	}
	 Chaining(int num,String name,float no){
		 this(num,name);
		 this.no=no;
	 }
void prin() {
	System.out.println(num + "  "+name+"  "+ no);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chaining chn=new Chaining(24,"sunita");
		Chaining chn1=new Chaining(30,"sivakumar",1);
chn.prin();
		chn1.prin();
	
		
	}

}

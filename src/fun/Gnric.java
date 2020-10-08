package fun;

public class Gnric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//generic method for bumch of methods one single method//
		 String [] n= {"jyo","pree","sidd","uttu"};
		Integer[] n1={3, 34,27,5,};
		Boolean[] n2={true,false,true};
		
		printArray(n);
		printArray(n1);
		printArray(n2);

	}
		
		public static <e> void printArray(e [] A){
		
		for( e item : A){
		System.out.println(item);
		}
	}

	}
	



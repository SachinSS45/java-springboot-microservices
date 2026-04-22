public class Program05{

	public static void main(String[] args){
		
		Random r1 = new Random(3.14);
		System.out.println(r1.PI);
		//r1.PI = 234.34;//Error : cannot assign a value to final variable PI
	}
}

class Random{

	final double PI;

	Random(double PI){
		this.PI = PI;
	}
}

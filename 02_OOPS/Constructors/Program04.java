public class Program04{

	public static void main(String[] args){
		
		Random r1 = new Random();
		System.out.println(r1.PI);
		//r1.PI = 234.34;//Error : cannot assign a value to final variable PI
	}
}

class Random{

	final double PI = 3.14;
}

package Constructors;

public class Program05{

	public static void main(String[] args){
		
		Random1 r1 = new Random1(3.14);
		System.out.println(r1.PI);
		//r1.PI = 234.34;//Error : cannot assign a value to final variable PI
	}
}

class Random1{

	final double PI;

	Random1(double PI){
		this.PI = PI;
	}
}

package Operators;

public class BitwiseOperator{
    public static void main(String[] args) {
        //Bitwise Operations

        int a = 2; // 00000010
        int b = 3; // 00000011
        int c = a & b; // 00000010
        int d = a | b; // 00000011
        int e = a ^ b; // 00000001
        int f = ~a; // 11111111 111111111 111111111  11111101 => 1's comp => 00000000 00000000 00000000 00000010 => 2s comp => 00000011

        System.out.println(c + " , " + d + " , " + e + " , " + f ); // 2 , 3 , 1 , -3

        //shift operators
        int g = 1; //1
       // g = g << 1; //2
        g = g << 31;
        System.out.println(g);//-2147483648 (Min value of integer)

        //Right Shift
        byte h = 1;
        h = (byte)( h << 1);
        System.out.println(h);//0
    }
}

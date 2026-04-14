/*

 */
public class DataTypes{
    public static void main(String[] args){
        //Integers : byte,short,int,long
        byte b = 100;
        short s = 10;
        int i = 1000;
        long l = 10000l;

        //Real Numbers
        float f = 10.4f;//f is compulsory otherwise it will treat as double
        double d = 23.0987;
        System.out.println(f);

        //Characters
        char ch = 'a'; // a --> binary -> store
        System.out.println("Character values " + ch);//a

        //boolean
        boolean isPresent = false;
        System.out.println(isPresent);//false

        //Way to print different number system values
        //Binary
        byte b1 = 0b111;
        System.out.println(b1);//7
        //Octal
        byte b2 = 07;
        System.out.println(b2);//7
        //Hexadecimal
        byte b3 = 0xA;
        System.out.println(b3);//10

        //Scientific way to store double values
        double d1 = 6.022E23;//6.022 * 10^23
        System.out.println(d1);

        //we can use underscore to make more readable
        long phoneNo = 74_99_66_53_24l;
        System.out.println(phoneNo);

    }
}
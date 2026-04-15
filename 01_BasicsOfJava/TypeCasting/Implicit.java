public class Implicit {
    public static void main(String[] args) {
        //Implicit Conversion (widening)
        //(byte to int)
        byte b = 10;
        int i;
        i = b;
        System.out.println(i);//10

        //char to int
        char ch = 'a';
        int i2;
        i2 = ch;
        System.out.println(i2);
    }
}
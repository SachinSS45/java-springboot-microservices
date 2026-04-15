public class Explicit {
    public static void main(String[] args){

        //Explicit Conversion (Narrowing)
        int i = 10;
        byte b = (byte) i;
        System.out.println(b);//10

        //Truncating Conversion
        float f = 10.2343f;
        //int i2 = f;//error : possible lossy conversion from float to int

        int i2 = (int)f;
        System.out.println(i2);//10
    }
}
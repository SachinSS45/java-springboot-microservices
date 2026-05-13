package WrapperClasses;
// Always remember ' = = ' checks reference for objects not value
public class Program02 {
    public static void main(String[] args) {

        Integer x = 100;
        Integer y = 100;
        System.out.println(x == y );// true because of caching // from -128 to 127 already one cache created
        // so if we try to use that values it will directly refer that

        Byte a = 100;
        Byte b = 100;
        System.out.println(a == b);//same caching

        Character ch = 'A';
        Character ch1 = 'A';
        System.out.println(ch == ch1);//true


    }
}

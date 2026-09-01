package Java8Features.Functional_Interfaces;

public class Program01 {

    public static void main(String[] args) {

        Calculator c =
    }
}


@FunctionalInterface
interface Calculator{
    int calculate(int a,int b);
}


//traditional way
class Addition implements Calculator{
    @Override
    public int calculate(int a,int b){
        return a+b;
    }
}
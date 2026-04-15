package Conditionals;

public class Program01 {
    public static void main(String[] args) {

        int i = 5;

        //selection statements
        //Normal if
        if( i == 5){
            System.out.println( i + " is 5");
        }else{
            System.out.println(i + " is not 5");
        }

        // check number is even or odd
        if(i%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

        //nested if

        if(i > 5){
            if (i < 10){

            }else{

            }
        }else{

        }
        //if-else-ladder

        if(i == 5){
            System.out.println("5");
        }else if(i==6){
            System.out.println("6");
        }else if(i==7){
            System.out.println("7");
        }else{
            System.out.println("None of the above");
        }
    }
}

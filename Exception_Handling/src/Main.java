//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        int a = 5;
//        int b = 0;
//        System.out.println(a/b);
        /*
        Exception in thread "main" java.lang.ArithmeticException: / by zero
	            at Main.main(Main.java:8)
        */
        //It is handled by DefaultExceptionHandler of JVM
        //Nothing will execute after Exception Occurs because we didn't handled the Exception

        //We can handle using try-catch


//        try{
//            int a = 5;
//            int b = 0;
//            System.out.println(a/b);
//        }catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//        }catch (Exception e){
//            //System.out.println(e.getMessage());
//            System.out.println(e.getCause());
//        }finally {
//            System.out.println("Cleanup Code + Resource Close");
//        }

        //Nested try-catch

        try{
            int a = 10;
            int b = 20;

            try{
                int[] arr = new int[3];
                System.out.println(arr[3]);
            }catch (ArithmeticException e){

            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
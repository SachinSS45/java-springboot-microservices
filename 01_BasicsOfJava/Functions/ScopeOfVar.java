package Functions;

public class ScopeOfVar {
    public static void main(String[] args) {
        
        //Scope of Var
        
        int x = 4;
        int y = 5;
        System.out.println(x+ " , " + y);
        
        fun();
        //main(new String[]{"Sachin","Shetkar"});//StackOverFlowError
    }

    private static void fun() {
    }
}

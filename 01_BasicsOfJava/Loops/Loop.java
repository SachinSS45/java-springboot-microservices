package Loops;

public class Loop {
    public static void main(String[] args) {
        //Loops

        //Print 1 to 10

        int i = 1;
        while(i<=10){
            System.out.println(i);
            i++;
        }

        //do-while executes at least once
        int j = 1;
        do{
            System.out.println(j);
            j++;
        }while (j<=10);

        //for loop

        for(int k=1;k<=10;k++){
            System.out.println(k);
            if(k%5==0){
                break;
            }
        }
    }
}

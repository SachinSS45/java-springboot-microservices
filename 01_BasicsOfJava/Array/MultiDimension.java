package Array;

public class MultiDimension {
    public static void main(String[] args) {

        int[][] marks = new int[3][3]; //rows ,cols (optional)


        marks[0][0] = 23;
        marks[0][1] = 25;
        marks[0][2] = 45;

        marks[1][0] = 23;
        marks[1][1] = 25;
        marks[1][2] = 45;

        marks[2][0] = 23;
        marks[2][1] = 25;
        marks[2][2] = 45;

        for(int row = 0;row < marks.length;row++){
            for(int col = 0;col< marks[row].length;col++){
                System.out.print(marks[row][col] + " ");
            }
            System.out.println();
        }
        /*
            23 25 45
            23 25 45
            23 25 45
         */
        // Jagged Array : Every row with different number of cols
        int[][] marks1 = new int[3][];

        marks1[0] = new int[1];
        marks1[1] = new int[2];
        marks1[2] = new int[3];

        marks1[0][0] = 23;
        marks1[1][0] = 24;
        marks1[1][1] = 90;
        marks1[2][0] = 23;
        marks1[2][1] = 78;
        marks1[2][2] = 45;

        for(int row = 0;row < marks1.length;row++){
            for(int col = 0;col< marks1[row].length;col++){
                System.out.print(marks1[row][col] + " ");
            }
            System.out.println();
        }
        /*
        23
        24 90
        23 78 45
         */
    }
}

package Enums;

enum Direction{
    NORTH(0),
    SOUTH(180),
    EAST(90),
    WEST(270);//internally :  public static final Direction WEST = new Direction(270);

    private int degree;

    public int getDegree(){
        return this.degree;
    }

    Direction(int degree){
        this.degree = degree;
    }
}
public class Program02 {
    public static void main(String[] args) {
            Direction d = Direction.NORTH;
            System.out.println(d.getDegree());//0

        Direction d2 = Direction.SOUTH;
        System.out.println(d.getDegree());//180

        Direction d3 = Direction.EAST;
        System.out.println(d.getDegree());//90

        Direction d4 = Direction.WEST;
        System.out.println(d.getDegree());//270


    }
}

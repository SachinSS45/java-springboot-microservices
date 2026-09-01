package Enums;

enum Directions{
    NORTH{
        @Override
        public void move(){
            System.out.println("Moving UP");
        }
    },
    SOUTH{
        @Override
        public void move(){
            System.out.println("Moving Down");
        }
    },
    EAST{
        @Override
        public void move(){
            System.out.println("Moving Right");
        }
    },
    WEST{
        @Override
        public void move(){
            System.out.println("Moving Left");
        }
    };
    public abstract void move();
}
public class Program03 {
    public static void main(String[] args) {
        Directions d = Directions.NORTH;
        d.move(); //Moving UP
    }
}

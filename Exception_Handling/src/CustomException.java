public class CustomException {

    public static void main(String[] args) {
        try {
            checkEligibility(-3);
        }catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }

    public static void checkEligibility(int age)throws InvalidAgeException{

        if(age < 0){
            throw new InvalidAgeException("Age can't be negative");
        }
        if(age>=18)
            System.out.println("You are eligible to vote");
    }
}

class InvalidAgeException extends RuntimeException{

    public InvalidAgeException(String msg){
        super(msg);
    }
}

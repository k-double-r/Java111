package Unit1;

public class UserException {
    public void validate(int age) throws InvalidAge{
        if(age<18){
            throw new InvalidAge("Cannot vote");
        }
        else{
            System.out.println("Can vote");
        }
    }
}

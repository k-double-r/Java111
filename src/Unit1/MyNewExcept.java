package Unit1;

public class MyNewExcept {
    public static void main(String[] args) {
        UserException ud = new UserException();
        try{
            ud.validate(18);
        }
        catch(InvalidAge e){
            System.out.println(e.getMessage());
        }
    }
}

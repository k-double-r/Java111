package Unit1;

public class College extends Abstr{
    public College(String name, int roll_no) {
        super(name, roll_no);
    }

    public void attend_class(){
        System.out.println(name+" Attend class");
    }
    public void give_exam(){
        System.out.println(roll_no+" Give exam");
    }
}

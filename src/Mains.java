public class Mains {
    public static void main(String[] args) {
        Student sl = new Student(111, "Krrish");
        Student su = new Student();
        Student si = new Student(sl);
//        sl.name="Krrish";
//        sl.roll_no=111;
        sl.display();
        su.display();
        si.display();
    }
}
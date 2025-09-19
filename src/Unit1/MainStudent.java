package Unit1;

public class MainStudent {
    public static void main(String[] args) {
        StudentInfo st = new StudentInfo("Unit1.A", 12, "Ok");
        System.out.println(st.name);
        System.out.println(st.getGrade());
    }
}

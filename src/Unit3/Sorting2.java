package Unit3;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting2 {
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<>();
        al.add(new Student(17,"ok",100));
        al.add(new Student(23,"buddy",101));
        al.add(new Student(20,"ok",102));
        al.add(new Student(30,"chic",103));
        al.add(new Student(21,"fresh",104));
        al.add(new Student(20,"ko",105));
        Collections.sort(al);
        for(Student st: al){
            System.out.println("Name: "+st.name+" Age: "+st.age+" Roll no: "+st.roll_no);
        }
    }
}

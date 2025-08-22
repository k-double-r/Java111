public class StudentInfo {
    private String grade;
    public int roll;
    public String name;

    public StudentInfo(String grade,int roll,String name) {
        this.roll = roll;
        this.name = name;
        this.grade = grade;
    }

    public String getGrade(){
        return grade;
    }
    public void setGrade(String grade){
        this.grade = grade;
    }
}

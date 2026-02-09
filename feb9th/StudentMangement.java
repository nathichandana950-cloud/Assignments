class Student{
    private int id;
    private String name;
    private double marks;
    public Student(int id, String name,double marks) {
        this.id=id;
        this.name=name;
        this.marks=marks;
    }
    public int getid() {
        return id;
    }
    public void setId(int id) {
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
    public double getMarks() {
        return marks;
    }
    public void setMarks(double marks) {
        this.marks=marks;
    }

    public String Grade() {
        if (marks>=90) {
            return "A";
        }
        else if (marks>=75) {
            return "B";
        }
        else {
            return "C";
        }
    }
}
public class StudentMangement {
    public static void main(String[] args) {
        Student student = new Student(2,"siri",89);
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Name: " + student.getMarks());
        System.out.println("Student Name: " + student.Grade());
    }
}

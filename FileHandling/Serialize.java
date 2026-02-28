import java.io.*;

class Student implements Serializable {
    int id;
    String name;
}

public class Serialize {
    public static void main(String[] args) throws Exception {

        Student s = new Student();
        s.id = 1;
        s.name = "Siri";

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.dat"));
        out.writeObject(s);
        out.close();


        ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.dat"));
        Student s2 = (Student) in.readObject();
        in.close();

        System.out.println(s2.id + " " + s2.name);
    }
}
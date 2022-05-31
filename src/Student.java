import java.util.HashSet;
import java.util.Set;

public class Student {
    String name;
    int rollno;

    Student(String name , int rollno){
        this.name = name;
        this.rollno = rollno;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollno=" + rollno +
                '}';
    }


}
class Main{
    public static void main(String[] args) {
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(new Student("Ammar",2));
        studentSet.add(new Student("Pradip",9));
        studentSet.add(new Student("Akash",22));
        studentSet.add(new Student("Ammar", 2)); // hasset will not understand and they are 2 different
        //object

        System.out.println(studentSet);


    }
}

package comparable_and_comparator_usecase;
import java.util.*;
public class Student implements Comparable<Student> {
    private String name;
    private int marks;
    Student(String name, int marks){
        setName(name);
        setMarks(marks);
    } 
    public String getName() {
        return name;
    }
    public int getMarks() {
        return marks;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }   

    public int compareTo(Student s){
        return this.name.compareTo(s.name)
    }

    public String toString(){
        return "Name: " + name + ", Marks: " + marks;
    }

}

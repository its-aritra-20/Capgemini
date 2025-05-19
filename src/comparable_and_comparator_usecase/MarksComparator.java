package comparable_and_comparator_usecase;
import java.util.Comparator;
public class MarksComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getMarks(), s2.getMarks());
    }

}

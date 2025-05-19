package comparable_and_comparator;

import java.util.Comparator;

public class CompareEmployeeId implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Integer.compare(e1.id, e2.id); 
    }
}

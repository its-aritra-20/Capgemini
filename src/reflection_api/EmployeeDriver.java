package reflection_api;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class EmployeeDriver {
    public static void main(String[] args) throws Exception {
        Class<Employee> employeeClass = Employee.class;

        // Fetching all the field names of a class
        Field[] fields = employeeClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }

        System.out.println();

        // Changing the value of a field of a particular object
        Employee employee = new Employee(1, "Rohit", 12800, 26);
        Field f = employeeClass.getDeclaredField("name");
        f.setAccessible(true);
        f.set(employee, "Ram");
        System.out.println(f.get(employee));
        f.setAccessible(false);

        System.out.println(employee.getName());
        System.out.println("-----------------------");

        Method[] methods = employeeClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
        System.out.println("-----------------------");

        for (Method method : methods) {
            if (method.isAnnotationPresent(Deprecated.class)) {
                System.out.println(method.getName());
            }
        }
    }
}

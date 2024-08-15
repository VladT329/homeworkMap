import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    private String name;
    private String surname;
    private int id;

    public Employee(String name, String surname, int id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    private Map <Integer, Employee> employeeMap = new HashMap<>();

    Employee() {
    }

    public void addEmployee (String name, String surname, int id){
        Employee employee = new Employee(name, surname, id);
        employeeMap.put(id,employee);
    }

    public Employee findEmployee(int id) {
        return employeeMap.get(id);
    }

    public Employee removeEmployee(int id) {
        return employeeMap.remove(id);
    }

    public void showAllEmployees() {
        for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
            Integer id = entry.getKey();
            Employee employee = entry.getValue();
            System.out.println("ID: " + id + ", Name: " + employee.name + ", Surname: " + employee.surname);
        }
    }
}

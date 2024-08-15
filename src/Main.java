public class Main {
    public static void main(String[] args) {
        Employee employeeManager = new Employee();
        employeeManager.addEmployee("Илья", "Муромец", 10);
        employeeManager.addEmployee("Алёша", "Попович", 11);

        employeeManager.showAllEmployees();
    }
}

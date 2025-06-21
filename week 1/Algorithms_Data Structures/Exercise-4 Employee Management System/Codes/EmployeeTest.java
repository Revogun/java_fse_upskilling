public class EmployeeTest {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        manager.addEmployee(new Employee(1, "Alice", "Manager", 80000));
        manager.addEmployee(new Employee(2, "Bob", "Developer", 60000));
        manager.addEmployee(new Employee(3, "Charlie", "Designer", 55000));

        System.out.println("All Employees:");
        manager.traverseEmployees();

        System.out.println("\nSearching for Employee with ID 2:");
        System.out.println(manager.searchEmployee(2));

        System.out.println("\nDeleting Employee with ID 1:");
        manager.deleteEmployee(1);

        System.out.println("\nAll Employees After Deletion:");
        manager.traverseEmployees();
    }
}

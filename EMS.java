/*
 * Student Name: Aly Kaamoush
 * Student Number: 041129849
 * Lab Professor: Reg Dyer
 * Section: CST8288 011
 * Description: Lab_1 
 * Date: 11-10-2024
 */
/**
 * Employee Management System (EMS) main class.
 * This class demonstrates the usage of various design patterns
 * in creating and managing employees.
 * @author aly kaamoush
 */
public class EMS {
	/**
     * The main method that runs the Employee Management System demonstration.
     * It creates employees using different patterns and displays their information.
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        EmployeeManager manager = EmployeeManager.getInstance();

        // Using Factory Pattern
        Employee fullTimeEmployee1 = EmployeeFactory.createEmployee("fulltime", 1, "Aly Kaamoush", "IT", "Developer", 40, 75000);
        Employee partTimeEmployee2 = EmployeeFactory.createEmployee("parttime", 2, "Tom Smith", "HR", "Assistant", 20, 30000);

        // Using Builder Pattern with Director
        EmployeeDirector director = new EmployeeDirector(new FullTimeEmployeeBuilder());
        Employee fullTimeEmployeeBuilder3 = director.buildEmployee(3, "Bob Johnson", "Finance", "Accountant", 40, 65000);
        
        EmployeeDirector director2 = new EmployeeDirector(new PartTimeEmployeeBuilder());
        Employee partTimeEmployeeBuilder4 = director2.buildEmployee(4, "Bob Johnson", "Marketing", "Coordinator", 20, 70000);


        // Add employee to EmployeeManager List
        manager.addEmployee(fullTimeEmployee1);
        manager.addEmployee(partTimeEmployee2);
        manager.addEmployee(fullTimeEmployeeBuilder3);
        manager.addEmployee(partTimeEmployeeBuilder4);

        /**
         * Demonstrates the functionality of the Employee Management System by iterating
         * through all employees and displaying their information and actions.
         * @param manager The EmployeeManager instance containing all employees
         */
        System.out.println("All Employees:"); // Print a header for the employee list
        for (Employee emp : manager.getAllEmployees()) { // Iterate through all employees in the EmployeeManager
            System.out.println(emp);  // Print the employee's details (use toString() method of the Employee class)
            emp.clockIn();
            emp.trackWorkHours();
            emp.clockOut();
            System.out.println();
        }
    }
}
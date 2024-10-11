/*
 * Student Name: Aly Kaamoush
 * Student Number: 041129849
 * Lab Professor: Reg Dyer
 * Section: CST8288 011
 * Description: Lab_1 
 * Date: 11-10-2024
 */
import java.util.ArrayList;
import java.util.List;

/**
 * Singleton class for managing Employee objects.
 * @author aly kaamoush
 */
public class EmployeeManager {
	
	private static EmployeeManager instance;
	private List<Employee> employees;
	
	/**
     * Private constructor to prevent instantiation.
     */
	private EmployeeManager() {
		employees = new ArrayList<>();
	}
	
	/**
     * Returns the single instance of EmployeeManager.
     * @return the EmployeeManager instance
     */
	public static EmployeeManager getInstance() {
		
		if (instance == null) { 
			instance = new EmployeeManager();
		}
		
		return instance;
	}
	
	/**
     * Adds an employee to the list of employees.
     * @param employee the Employee to add
     */
	public void addEmployee (Employee employee) {
		employees.add(employee);
	}
	
	/**
     * Removes an employee from the list of employees.
     * @param employee the Employee to remove
     */
	public void removeEmployee(Employee employee) {
		employees.remove(employee);
	}
	
	/**
     * Returns a copy of the list of all employees.
     * @return a List containing all employees
     */
	public List<Employee> getAllEmployees(){
		return new ArrayList<>(employees);
	}
}

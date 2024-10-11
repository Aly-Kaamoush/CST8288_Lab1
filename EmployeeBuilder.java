/*
 * Student Name: Aly Kaamoush
 * Student Number: 041129849
 * Lab Professor: Reg Dyer
 * Section: CST8288 011
 * Description: Lab_1 
 * Date: 11-10-2024
 */
/**
 * Interface for building Employee objects.
 * This interface defines the methods for setting various attributes of an employee
 * and building the final Employee object.
 * @author aly kaamoush
 */
public interface EmployeeBuilder {
	/**
     * Sets the employee's ID.
     * @param id the ID to set
     * @return the EmployeeBuilder instance for method chaining
     */
	EmployeeBuilder setId(int id);
	
	/**
     * Sets the employee's name.
     * @param name the name to set
     * @return the EmployeeBuilder instance for method chaining
     */
	EmployeeBuilder setName(String name);
	
	/**
     * Sets the employee's department.
     * @param department the department to set
     * @return the EmployeeBuilder instance for method chaining
     */
	EmployeeBuilder setDepartment(String department);
	
	/**
     * Sets the employee's role.
     * @param role the role to set
     * @return the EmployeeBuilder instance for method chaining
     */
	EmployeeBuilder setRole(String role);
	
	/**
     * Sets the employee's working hours per week.
     * @param hours the working hours per week to set
     * @return the EmployeeBuilder instance for method chaining
     */
	EmployeeBuilder setWorkingHoursPerWeek(int hours);
	
	/**
     * Sets the employee's salary.
     * @param salary the salary to set
     * @return the EmployeeBuilder instance for method chaining
     */
	EmployeeBuilder setSalary(double salary);
	
	/**
     * Builds and returns the Employee object.
     * @return the constructed Employee object
     */
	Employee build();

}

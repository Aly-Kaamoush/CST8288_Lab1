/*
 * Student Name: Aly Kaamoush
 * Student Number: 041129849
 * Lab Professor: Reg Dyer
 * Section: CST8288 011
 * Description: Lab_1 
 * Date: 11-10-2024
 */

/**
 * This abstract class represents an Employee in the Employee Management System.
 * It defines common attributes and behaviors for all types of employees.
 */
public abstract class Employee {
	private int id;
	private String name;
	private String department;
	private String role;
	private int workingHoursPerWeek;
	private double salary;

	/**
     * Gets the employee's ID.
     * @return the employee's ID
     */
	public int getId() {
		return id;
	}

	/**
     * Sets the employee's ID.
     * @param id the ID to set
     */
	public void setId(int id) {
		this.id = id;
	}

	/**
     * Gets the employee's name.
     * @return the employee's name
     */
	public String getName() {
		return name;
	}

	/**
     * Sets the employee's name.
     * @param name the name to set
     */
	public void setName(String name) {
		this.name = name;
	}

	/**
     * Gets the employee's department.
     * @return the employee's department
     */
	public String getDepartment() {
		return department;
	}

	/**
     * Sets the employee's department.
     * @param department the department to set
     */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
     * Gets the employee's role.
     * @return the employee's role
     */
	public String getRole() {
		return role;
	}

	/**
     * Sets the employee's role.
     * @param role the role to set
     */
	public void setRole(String role) {
		this.role = role;
	}

	/**
     * Gets the employee's working hours per week.
     * @return the working hours per week
     */
	public int getWorkingHoursPerWeek() {
		return workingHoursPerWeek;
	}

	/**
    * Sets the employee's working hours per week.
    * @param workingHoursPerWeek the working hours per week to set
    */
	public void setWorkingHoursPerWeek(int workingHoursPerWeek) {
		this.workingHoursPerWeek = workingHoursPerWeek;
	}

	/**
	 * Gets the employee's salary.
     * @return the employee's salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
     * Sets the employee's salary.
     * @param salary the salary to set
     */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	/**
    * Abstract method to record when an employee clocks in.
    */
	public abstract void clockIn();
	
	/**
	 * Abstract method to record when an employee clocks out.
	 */
	public abstract void clockOut();
	
	/**
	 * Abstract method to track an employee's work hours.
	 */
	public abstract void trackWorkHours();
	
	/**
     * Returns a string representation of the Employee object.
     * @return a string containing the employee's details
     */
	 @Override
	    public String toString() {
	        return getClass().getSimpleName() + "{" +
	                "id=" + id +
	                ", name='" + name + '\'' +
	                ", department='" + department + '\'' +
	                ", role='" + role + '\'' +
	                ", workingHoursPerWeek=" + workingHoursPerWeek +
	                ", salary=" + salary +
	                '}';
	    }
}

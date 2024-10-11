/*
 * Student Name: Aly Kaamoush
 * Student Number: 041129849
 * Lab Professor: Reg Dyer
 * Section: CST8288 011
 * Description: Lab_1 
 * Date: 11-10-2024
 */
/**
 * Factory class for creating Employee objects.
 * @author aly kaamoush
 */
public class EmployeeFactory {
	
	/**
     * Creates and returns an Employee object based on the specified type and attributes.
     * @param type the type of employee ("fulltime" or "parttime")
     * @param id the employee's ID
     * @param name the employee's name
     * @param department the employee's department
     * @param role the employee's role
     * @param hours the employee's working hours per week
     * @param salary the employee's salary
     * @return the created Employee object
     * @throws IllegalArgumentException if an invalid employee type is provided
     */
    public static Employee createEmployee(String type,int id ,String name, String department, String role, int hours, double salary) {
        Employee employee;
        switch (type.toLowerCase()) {
            case "fulltime":
                employee = new FullTimeEmployee();
                break;
            case "parttime":
                employee = new PartTimeEmployee();
                break;
            default:
                throw new IllegalArgumentException("Invalid employee type: " + type);
        }
        employee.setId(id);
        employee.setName(name);
        employee.setDepartment(department);
        employee.setRole(role);
        employee.setWorkingHoursPerWeek(hours);
        employee.setSalary(salary);
        return employee;
    }
}
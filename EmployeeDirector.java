/*
 * Student Name: Aly Kaamoush
 * Student Number: 041129849
 * Lab Professor: Reg Dyer
 * Section: CST8288 011
 * Description: Lab_1 
 * Date: 11-10-2024
 */
/**
 * Director class for constructing Employee objects using the Builder pattern.
 * @author aly kaamoush
 */
public class EmployeeDirector {
    private EmployeeBuilder builder;

    /**
     * Constructs an EmployeeDirector with the specified builder.
     * @param builder the EmployeeBuilder to use
     */
    public EmployeeDirector(EmployeeBuilder builder) {
        this.builder = builder;
    }

    /**
     * Builds an Employee object using the provided information.
     * @param id the employee's ID
     * @param name the employee's name
     * @param department the employee's department
     * @param role the employee's role
     * @param hours the employee's working hours per week
     * @param salary the employee's salary
     * @return the constructed Employee object
     */
    public Employee buildEmployee(int id, String name, String department, String role, int hours, double salary) {
       
    	return builder.setId(id)
        			  .setName(name)
                      .setDepartment(department)
                      .setRole(role)
                      .setWorkingHoursPerWeek(hours)
                      .setSalary(salary)
                      .build();
    }
}

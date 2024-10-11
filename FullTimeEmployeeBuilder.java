/*
 * Student Name: Aly Kaamoush
 * Student Number: 041129849
 * Lab Professor: Reg Dyer
 * Section: CST8288 011
 * Description: Lab_1 
 * Date: 11-10-2024
 */
/**
 * This class implements the EmployeeBuilder interface to construct
 * FullTimeEmployee objects step by step.
 * @author aly kaamoush
 */
public class FullTimeEmployeeBuilder implements EmployeeBuilder {
	
	private FullTimeEmployee employee;
	
	/**
     * Constructs a new FullTimeEmployeeBuilder and initializes a new FullTimeEmployee.
     */
	public FullTimeEmployeeBuilder() {
		this.employee = new FullTimeEmployee();
	}

	@Override
	public EmployeeBuilder setId(int id) {
		employee.setId(id);
		return this;
	}
	
	@Override
	public EmployeeBuilder setName(String name) {
		employee.setName(name);
		return this;
	}

	@Override
	public EmployeeBuilder setDepartment(String department) {
		employee.setDepartment(department);
		return this;
	}

	@Override
	public EmployeeBuilder setRole(String role) {
		employee.setRole(role);
		return this;
	}

	@Override
	public EmployeeBuilder setWorkingHoursPerWeek(int hours) {
		employee.setWorkingHoursPerWeek(hours);
		return this;
	}

	@Override
	public EmployeeBuilder setSalary(double salary) {
		employee.setSalary(salary);
		return this;
	}

	@Override
	public Employee build() {
		
		return employee;
	}

}

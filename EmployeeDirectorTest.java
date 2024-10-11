/*
 * Student Name: Aly Kaamoush
 * Student Number: 041129849
 * Lab Professor: Reg Dyer
 * Section: CST8288 011
 * Description: Lab_1 
 * Date: 11-10-2024
 */
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test class for EmployeeDirector.
 * This class contains unit tests to verify that EmployeeDirector
 * correctly constructs different types of employees using the Builder pattern.
 */
public class EmployeeDirectorTest {

    /**
     * Test to verify that EmployeeDirector correctly constructs a FullTimeEmployee.
     * It checks if all properties of the constructed employee are set correctly.
     */
    @Test
    public void testConstructFullTimeEmployee() {
        EmployeeBuilder builder = new FullTimeEmployeeBuilder();
        EmployeeDirector director = new EmployeeDirector(builder);
        
        Employee employee = director.buildEmployee(1, "John Doe", "IT", "Developer", 40, 75000);
        
        assertNotNull(employee);
        assertTrue(employee instanceof FullTimeEmployee);
        assertEquals(1, employee.getId());
        assertEquals("John Doe", employee.getName());
        assertEquals("IT", employee.getDepartment());
        assertEquals("Developer", employee.getRole());
        assertEquals(40, employee.getWorkingHoursPerWeek());
        assertEquals(75000, employee.getSalary());
    }

    /**
     * Test to verify that EmployeeDirector correctly constructs a PartTimeEmployee.
     * It checks if all properties of the constructed employee are set correctly.
     */
    @Test
    public void testConstructPartTimeEmployee() {
        EmployeeBuilder builder = new PartTimeEmployeeBuilder();
        EmployeeDirector director = new EmployeeDirector(builder);
        
        Employee employee = director.buildEmployee(2, "Jane Smith", "HR", "Assistant", 20, 30000);
        
        assertNotNull(employee);
        assertTrue(employee instanceof PartTimeEmployee);
        assertEquals(2, employee.getId());
        assertEquals("Jane Smith", employee.getName());
        assertEquals("HR", employee.getDepartment());
        assertEquals("Assistant", employee.getRole());
        assertEquals(20, employee.getWorkingHoursPerWeek());
        assertEquals(30000, employee.getSalary());
    }
}

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
 * Test class for EmployeeFactory.
 * This class contains unit tests to verify that EmployeeFactory
 * correctly creates different types of employees.
 */
public class EmployeeFactoryTest {

    /**
     * Test to verify that EmployeeFactory correctly creates a FullTimeEmployee.
     * It checks if the created employee is of the correct type and if all properties are set correctly.
     */
    @Test
    public void testCreateFullTimeEmployee() {
        Employee employee = EmployeeFactory.createEmployee("fulltime", 1, "John Doe", "IT", "Developer", 40, 75000);
        
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
     * Test to verify that EmployeeFactory correctly creates a PartTimeEmployee.
     * It checks if the created employee is of the correct type and if all properties are set correctly.
     */
    @Test
    public void testCreatePartTimeEmployee() {
        Employee employee = EmployeeFactory.createEmployee("parttime", 2, "Jane Smith", "HR", "Assistant", 20, 30000);
        
        assertNotNull(employee);
        assertTrue(employee instanceof PartTimeEmployee);
        assertEquals(2, employee.getId());
        assertEquals("Jane Smith", employee.getName());
        assertEquals("HR", employee.getDepartment());
        assertEquals("Assistant", employee.getRole());
        assertEquals(20, employee.getWorkingHoursPerWeek());
        assertEquals(30000, employee.getSalary());
    }

    /**
     * Test to verify that EmployeeFactory throws an IllegalArgumentException for an invalid employee type.
     * It checks if the correct exception is thrown when an invalid type is provided.
     */
    @Test
    public void testInvalidEmployeeType() {
        try {
            EmployeeFactory.createEmployee("invalid", 3, "Test", "Test", "Test", 0, 0);
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            // Test passes if this exception is caught
        }
    }
}

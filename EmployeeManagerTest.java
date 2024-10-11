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
 * Test class for EmployeeManager.
 * This class contains unit tests to verify the singleton behavior
 * and employee management functionality of the EmployeeManager class.
 */
public class EmployeeManagerTest {

    /**
     * Test to ensure that EmployeeManager maintains singleton behavior.
     * It verifies that multiple calls to getInstance() return the same instance.
     */
    @Test
    public void testSingletonBehavior() {
        EmployeeManager instance1 = EmployeeManager.getInstance();
        EmployeeManager instance2 = EmployeeManager.getInstance();
        assertSame(instance1, instance2, "EmployeeManager should return the same instance");
    }

    /**
     * Test to verify the employee management functionality.
     * It checks if employees can be added to and removed from 
     * the EmployeeManager correctly.
     */
    @Test
    public void testEmployeeManagement() {
        EmployeeManager manager = EmployeeManager.getInstance();
        Employee employee = new FullTimeEmployee(); 
        employee.setName("Test Employee");

        manager.addEmployee(employee);
        assertTrue(manager.getAllEmployees().contains(employee), "Employee should be added to the manager");

        manager.removeEmployee(employee);
        assertFalse(manager.getAllEmployees().contains(employee), "Employee should be removed from the manager");
    }
}
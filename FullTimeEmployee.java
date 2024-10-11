/*
 * Student Name: Aly Kaamoush
 * Student Number: 041129849
 * Lab Professor: Reg Dyer
 * Section: CST8288 011
 * Description: Lab_1 
 * Date: 11-10-2024
 */
/**
 * This class extends the abstract Employee class and implements
 * specific behavior for full-time employees.
 * @author aly kaamoush
 */
public class FullTimeEmployee extends Employee {

	/**
     * Records when a full-time employee clocks in.
     */
	@Override
	public void clockIn() {
		System.out.println("Full-time employee " + getName() + " clocked in.");
		
	}

	/**
     * Records when a full-time employee clocks out.
     */
	@Override
	public void clockOut() {
		System.out.println("Full-time employee " + getName() + " clocked out.");
		
	}

	/**
     * Tracks the work hours for a full-time employee.
     */
	@Override
	public void trackWorkHours() {
		System.out.println("Full-time employee " + getName() + " worked " + getWorkingHoursPerWeek() + " hours this week.");
		
	}

}

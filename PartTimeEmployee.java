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
 * specific behavior for part-time employees.
 * @author aly kaamoush
 */
public class PartTimeEmployee extends Employee {

	/**
     * Records when a part-time employee clocks in.
     */
	@Override
	public void clockIn() {
		System.out.println("Part-time employee " + getName() + " clocked in.");
		
	}

	/**
     * Records when a part-time employee clocks out.
     */
	@Override
	public void clockOut() {
		System.out.println("Part-time employee " + getName() + " clocked out.");
		
	}

	/**
     * Tracks the work hours for a part-time employee.
     */
	@Override
	public void trackWorkHours() {
		System.out.println("Part-time employee " + getName() + " worked " + getWorkingHoursPerWeek() + " hours this week.");
		
	}

}

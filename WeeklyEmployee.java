package za.ac.tut.weeklyemployee;
import za.ac.tut.employee.Employee;
public class WeeklyEmployee extends Employee
{
	private double hoursWorked;
	private double hoursRate;
	
	public WeeklyEmployee()
	{}
	public WeeklyEmployee(String name, String surname, int empNO, double hoursWorked, double hoursRate)
	{
		super(name, surname, empNO);
		this.hoursWorked = hoursWorked;
		this.hoursRate = hoursRate;
	}
	
	public void setHoursWorked(double hoursWorked)
	{
		this.hoursWorked = hoursWorked;
	}
	public void setHoursRate(double hoursRate)
	{
		this.hoursRate = hoursRate;
	}
	
	public double getHoursWorked()
	{
		return  hoursWorked;
	}
	public double getHoursRate()
	{
		return hoursRate ;
	}
	@Override
	public double calculatePay()
	{
		return hoursWorked * hoursRate;
	}
}
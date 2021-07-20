package za.ac.tut.salariedemployee;
import za.ac.tut.employee.Employee;

public class SalariedEmployee extends Employee
{
	private String rank;
	
	public SalariedEmployee()
	{}
	public SalariedEmployee(String name, String surname, int empNO,String rank)
	{
		super(name, surname, empNO);
		this.rank = rank;
	}
	
	public void setRank(String rank)
	{
		this.rank = rank;
	}
	public String getRank()
	{
		return rank;
	}
	//Overide the method and give a specific behaviour to calulate pay
	@Override
	public double calculatePay()
	{
		double salary = 0.00;
		
		if (rank.equals("c1"))
		{
			salary = 15000.00;
		}
		else if (rank.equals("c2"))
		{
			salary = 20000.00;
		}
		else if (rank.equals("c3"))
		{
			salary = 25000.00;
		}
		return salary;
	}	

}
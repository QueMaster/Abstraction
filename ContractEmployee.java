package za.ac.tut.contractemployee;
import za.ac.tut.employee.Employee;

public class ContractEmployee extends Employee
{
	private double basicSalary;
	private int noOfitemsSold;
	
	public ContractEmployee()
	{}
	public ContractEmployee(String name, String surname, int empNO, double basicSalary, int noOfitemsSold)
	{
		super(name, surname, empNO);
		this.basicSalary = basicSalary;
		this.noOfitemsSold = noOfitemsSold;
	}
	
	public void setBasicSalary(double basicSalary)
	{
		this.basicSalary = basicSalary;
	}
	public void setNoOfitemsSold(int noOfitemsSold)
	{
	   this.noOfitemsSold = noOfitemsSold;
	}
	public double getBasicSalary()
	{
		return basicSalary;
	}
	public int getNoOfitemsSold()
	{
		return noOfitemsSold;
	}
	@Override
	public double calculatePay()
	{
		double newPay;
		
		if (noOfitemsSold > 1000)
		{
			newPay = noOfitemsSold * 0.15;
		}
		else
		{
			newPay = noOfitemsSold * 0.05;
		}
		
		return basicSalary + newPay;		
	}

}
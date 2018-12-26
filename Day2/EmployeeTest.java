import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class EmployeeTest 
{
	private EmployeeSalary employee;
	
	@Before
	public void setup()
	{
		employee = new EmployeeSalary(012,"Kunni",50000);
		//employee.setMonthlyBasic(50000);
	}
	
	@Test
	public void AnnualBasic() 
	{
		double answer = employee.getAnnualBasic(); 
		assertEquals(600000,answer,2);   
		// return (12 * monthlyBasic);
		
	}
		
	@Test
	public void MonthlyGrossSalary() 
	{
		double answer = employee.getMonthlyGrossSalary();
		assertEquals(77050,answer,2);
		//return (monthlyBasic + hra + medical + conveyance);
	}
	
	@Test
	public void AnnualGrossSalary() 
	{	
		double answer = employee.getAnnualGrossSalary();
		assertEquals(924600, answer, 2);
	}
	
	@Test
	public void MonthlyDeductions() 
	{
		double answer = employee.getMonthlyDeductions();
		assertEquals(6600,answer,2);
	}
	
	@Test
	public void MonthlyTakeHome() 
	{	
		double answer = employee.getMonthlyTakeHome();
		assertEquals(70450,answer,2);
		//return (MonthlyGrossSalary- MonthlyDeductions);
	}
		
	@Test
	public void AnnualTakeHome() 
	{	
		double answer = employee.getAnnualTakeHome();
		assertEquals(845400,answer,2);
		//return (12 * MonthlyTakeHome);
	}
	
}


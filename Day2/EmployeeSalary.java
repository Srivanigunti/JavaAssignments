
public class EmployeeSalary 
{
	private int Id;
	private String Name;
	private double MonthlyBasic;
	
	/*
	public static int pfRate;
	
	
	public static int getPfRate() {
		return pfRate;
	}

	public static void setPfRate(int pfRate) {
		EmployeeSalary.pfRate = pfRate;
	}

	 */
	public EmployeeSalary(int id, String name, double monthlyBasic) {
		super();
		this.Id = id;
		this.Name = name;
		this.MonthlyBasic = monthlyBasic;
	}
	
	public double getHra()
	{
		double hra = MonthlyBasic / 2;
		return hra;
	}
	
	public double getMedical()
	{
		double medical = 1250;
		return medical;
	}
	
	public double getConveyance()
	{
		double conveyance = 800;
		return conveyance;
	}
	/*
	public double getPf()
	{
		double pf = MonthlyBasic/10;
		return pf;
	}
	*/
	public double getEsic()
	{
		double Esic = 0;
		if(MonthlyBasic < 5000)
			Esic = getMonthlyBasic() / (4.75/100);
		return Esic;
	}
	
	public double getProfessionalTax()
	{
		double professionalTax=0;
		if(MonthlyBasic  <= 10000)
			professionalTax=50;
		else
			professionalTax=100;
		return professionalTax;
	}
	
	public double getPfRate()
	{
		double PfRate = 0;
		PfRate= getMonthlyBasic() * 0.1;
		if(PfRate>=6500)
		return PfRate;
		else
			return 6500;
	}
	public int getId() 
	{
		return Id;
	}

	public void setId(int id) 
	{
		Id = id;
	}
	
	public String getName() 
	{
		return Name;
	}

	public void setName(String name) 
	{
		this.Name = name;
	}

	public double getMonthlyBasic() 
	{
		return MonthlyBasic;
	}

	public void setMonthlyBasic(double monthlyBasic) 
	{
		MonthlyBasic = monthlyBasic;
	}
	
	
	public double getAnnualBasic() 
	{
		double AnnualBasic = 0;
		AnnualBasic = 12 * getMonthlyBasic();
		return AnnualBasic;
	}

	public double getMonthlyGrossSalary() 
	{
		double MonthlyGrossSalary = 0;
		MonthlyGrossSalary = getMonthlyBasic() + getHra() + getMedical() + getConveyance() ;
		return MonthlyGrossSalary;
	}
	
	public double getAnnualGrossSalary() 
	{
		double AnnualGrossSalary = 0;
		AnnualGrossSalary = 12 * getMonthlyGrossSalary() ;
		return AnnualGrossSalary;
	}

	public double getMonthlyDeductions() 
	{
		double MonthlyDeductions= 0;
		MonthlyDeductions = getPfRate() + getEsic() + getProfessionalTax();
		return MonthlyDeductions;
	}
	
	public double getMonthlyTakeHome() 
	{
		double MonthlyTakeHome= 0;
		MonthlyTakeHome = getMonthlyGrossSalary() - getMonthlyDeductions();
		return MonthlyTakeHome;
	}
	
	public double getAnnualTakeHome() 
	{
		double AnnualTakeHome= 0;
		AnnualTakeHome = 12 * getMonthlyTakeHome();
		return AnnualTakeHome;
	}
	
}







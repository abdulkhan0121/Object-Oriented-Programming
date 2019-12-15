
public class HourlyEmployee extends Employee{
	
	private double hourlyRate;
	private int hoursWorked;
	private String role;
	private String name;
	private int id;
	
	
	public void HourlyEmployee() {
		
		role = "Hourly Employee";
		hourlyRate = 0;
		hoursWorked = 0;
		super.Employee();
	}
	
	public void HourlyEmployee(double hourlyRate, int hoursWorked) {
		
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked; 
		
	}
	
	public void setWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	
	public void setRate(int rate) {
		this.hourlyRate = rate;
	}
	
	public double getRate() {
		return hourlyRate;
	}
	
	public int getWorked() {
		return hoursWorked;
	}
	
	
	public double getPay() {
		
		if(hoursWorked <= 40) {
			
			return hourlyRate * hoursWorked;
			
		}
		else {
			return (40 * hourlyRate) + (hoursWorked - 40)*((3/2)*hourlyRate);
		}
	}
	
	
	
	@Override
	public String toString() {
		
		return "Hourly "+getName()+" "+getID()+" "+getRate()+" "+getWorked();
		
	}
	
	
}

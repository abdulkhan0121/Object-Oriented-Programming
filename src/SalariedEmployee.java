
public class SalariedEmployee extends Employee {

	private double salary;
	private String role;
	private String name;
	private String id;
	
	public void SalariedEmployee() {
		role = "Salaried Employee";
		salary = 0;
		super.Employee();
	}
	
	public void SalariedEmployee(double salary) {	
		this.salary = salary;
	}
	
	public String getRole() {
		return role;
	}
	
	public double getPay() {
		double factor = (double)1 / (double)52;
		return salary*factor;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double sal) {
		this.salary = sal;
	}
	
	public String toString() {
		
		return "Salaried "+getName()+" "+getID()+" "+getSalary();	
	}

	
}

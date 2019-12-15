import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class Payroll {

	ArrayList<Employee> HourlyEmployee = new ArrayList<Employee>();
	ArrayList<Employee> SalariedEmployee = new ArrayList<Employee>();
	
	public void Payroll(){
				
	}
	
public Employee findEmployee(int id) {
	
	for(Employee emp: HourlyEmployee) {
		if(id == ((HourlyEmployee)emp).getID()) {
			return emp;
		}	
	}
	for(Employee emp: SalariedEmployee) {
		if(id == ((SalariedEmployee)emp).getID()) {
			return emp;
		}	
	}
	return null;
}

public void deleteHourly(Employee remove) {
	Employee delete = new HourlyEmployee();
	for(Employee emp : HourlyEmployee) {
		if(emp == remove) {
			 delete = emp;
		}
	}
	HourlyEmployee.remove(delete);
	System.out.println(delete.getName()+" has been fired.\n");
}

public void addHourly(Employee add) {
	HourlyEmployee.add(add);
}

public void deleteSalaried(Employee remove) {
	
	Employee delete = new SalariedEmployee();
	for(Employee emp : SalariedEmployee) {
		if(emp == remove) {
			 delete = emp;
		}
	}
	
	SalariedEmployee.remove(delete);
	System.out.println(delete.getName()+" has been fired.\n");
}

public void addSalaried(Employee add) {
	SalariedEmployee.add(add);
}

public void changePaySalaried(Employee emp, double pay) {
	((SalariedEmployee)emp).setSalary(pay);
}

public void changePayHourly(Employee emp, int pay) {
	((HourlyEmployee)emp).setRate(pay);
}

public void updateRecord() {
	
	boolean bool = false;
	for(Employee emp : HourlyEmployee) {
			bool = true;
			System.out.println("Enter the number of hours worked for: "+emp.getName());
			Scanner input = new Scanner(System.in);
			int worked = input.nextInt();
			((HourlyEmployee)emp).setWorked(worked);
		
	}
	
	if(bool == false) {
		System.out.println("There are no Hourly Employee on record");
	}

	
}

public void viewRecords() {
	
	System.out.printf("%10s","**HOURLY EMPLOYEES**\n\n");
	System.out.printf("%10s","|Name| "+"|ID| "+"|Hourly Rate| "+"|Hours Worked|");
	for(Employee em : HourlyEmployee) {
		System.out.println();
		System.out.printf("%10s",((HourlyEmployee)em).toString());
	}
	System.out.printf("%10s","\n\n**Salaried EMPLOYEES**\n\n");
	System.out.printf("%10s","|Name| "+"|ID| "+"|Salary|");	
	for(Employee em : SalariedEmployee) {
		System.out.println();
		System.out.printf("%10s",((SalariedEmployee)em).toString());
	}
	System.out.println("\n");
	
}

public double getPay() {
	
	int hourlyTotal = 0;
	for(Employee hourly : HourlyEmployee) {
		
		hourlyTotal += ((HourlyEmployee)hourly).getPay();
		
	}
	
	int salariedTotal = 0;
	for(Employee salary : SalariedEmployee) {
		
		salariedTotal += ((SalariedEmployee)salary).getPay();
		
	}
	
	return salariedTotal + hourlyTotal;

}

}
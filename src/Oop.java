import java.util.Scanner;
public class Oop  {

	public static void main(String[] args) {
		boolean loop = true;
		Payroll payrollOBJ = new Payroll();

	do {
		System.out.println("Menu: Select a function \n 0) Quit \n 1) Add an Employee \n 2) Delete an Employee \n 3) Lookup Employee \n 4) Update Records \n 5) View Records \n 6) Total Payroll \n 7) Update Pay");
		Scanner input = new Scanner(System.in);
		Scanner identity = new Scanner(System.in);
		int menu = input.nextInt();
		if(menu == 0) {
			loop = false;
		}
		else if(menu == 1) {
			System.out.println("Hourly(1) or Salaried(2)? ");
			menu = input.nextInt();
			if(menu == 1) {
				System.out.println("Enter a name:");
				Employee emp = new HourlyEmployee();
				String name = input.next();
				emp.setName(name);
				System.out.println("Enter a id:");
				int id = identity.nextInt();
				emp.setID(id);
				System.out.println("Enter an hourly rate for "+name+":");
				int rate = identity.nextInt();
				((HourlyEmployee)emp).setRate(rate);
				payrollOBJ.addHourly(emp);
			}
			if(menu == 2) {
				System.out.println("Enter a name:");
				Employee emp = new SalariedEmployee();
				String name = input.next();
				emp.setName(name);
				System.out.println("Enter a id:");
				int id = identity.nextInt();
				emp.setID(id);
				System.out.println("Enter a salary for "+name+":");
				double salary = identity.nextDouble();
				((SalariedEmployee)emp).setSalary(salary);
				payrollOBJ.addSalaried(emp);
			}
			
			
		}
		else if(menu == 2) {
			
			System.out.println("Hourly(1) or Salaried(2)? ");
			menu = input.nextInt();
			System.out.println("Enter the ID of an employee:  ");
			int deleteID = input.nextInt();
			Employee delete = payrollOBJ.findEmployee(deleteID);
		
			if(menu == 1 ) {
				payrollOBJ.deleteHourly(delete);
			}
			if(menu == 2) {
				payrollOBJ.deleteSalaried(delete);
			}
			
		}
		if(menu == 3) {
			System.out.println("Enter the ID of the Employee: ");
			int id = identity.nextInt();
			Employee found = payrollOBJ.findEmployee(id);
			if(found == null) {
				System.out.println("That employee was not found.");
			}
			else {
			System.out.println(found.toString());
			}
			System.out.println();
		}
		if(menu == 4) {
			payrollOBJ.updateRecord();
		}
		if(menu == 5) {
			payrollOBJ.viewRecords();
		}
		if(menu == 6) {
			System.out.println("The total payroll for the company this week is "+payrollOBJ.getPay());
		}
		if(menu == 7) {
			
			System.out.println("Hourly(1) or Salaried(2)?");
			int choice = input.nextInt();
			System.out.println("Enter the ID of an employee:  ");
			int id = identity.nextInt();
			Employee found = payrollOBJ.findEmployee(id);
			System.out.println("Enter the new pay: ");
			int pay = identity.nextInt();
			if(choice == 1) {
				payrollOBJ.changePayHourly(found, pay);
			}
			if(choice == 2) {
				payrollOBJ.changePaySalaried(found, pay);
			}
			System.out.println("Pay updated. ");	
		}
	}while (loop == true);
	System.out.println("System terminated.");
	}

}

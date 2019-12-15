
public abstract class Employee {

	public String name;
	public int id;
	public String role;

	public void Employee() {
		
		name = "";
		id = 0;
		
	}

	public void Employee(String name, int id, String role) {
		
		this.name = name;
		this.id = id;
		this.role = role;
		
	}

	public abstract double getPay();
	
	public void changeName(String name) {
		this.name = name;
	}
				
	@Override
	public String toString() {
	
	return getName() +" "+ getID();
	
}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setID(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	public int getID() {
		return id;
	}
	
	public String getRole() {
		return role;
	}


}
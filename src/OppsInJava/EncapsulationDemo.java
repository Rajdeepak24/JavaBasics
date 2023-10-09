package OppsInJava;

class Employee
{
	private int id ;
	private String name;
	
	
	public int getId() {
		return id;
	}
	
	 
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
		
	}
	public void setName(String name) {
		
		this.name= name;
	}
	 
}


public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.setId(1);
		System.out.println(emp.getId());
		
		emp.setName("Raj");
		System.out.println(emp.getName());

		

	}

}

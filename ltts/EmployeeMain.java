package ltts;

public class EmployeeMain {
	
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setEmployeeName("shashi kumar");
		e1.setEmployeeAddress("patna");
		e1.setMobileNo("7033053707");
	
	
	System.out.println(e1.getEmployeeName()+" "+e1.getEmployeeAddress()+" "+e1.getMobileNo());
	//e1.displayInfo();
	}
}

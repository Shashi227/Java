package ltts;

public class SampleEmployee {
	public static void main(String[] args) {
		EmployeeClass employee=new EmployeeClass(1, "shashi", "bangalore","20lpa");
		/*EmployeeClass employee1=new EmployeeClass();
		employee.setEmployeeID(1);
		employee.setEmployeeName("shashi kumar");
		employee.setEmployeeLocatin("Bangalore");
		employee.setEmployeePackages("20 Lakhs");
		
		
		
		
		//System.out.println(employee.getEmployeeID()+" "+employee.getEmployeeName()+" "+employee.getEmployeeLocatin()+" "+employee.getEmployeePackages());
		//System.out.println(employee);
		System.out.println(employee.hashCode());
		System.out.println(employee1.hashCode());
		
		System.out.println(employee.equals(employee1));*/
		employee.displayInfo();
	}


}

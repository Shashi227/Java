package ltts;
//model/pojo/bean class
public class EmployeeClass {
	private int EmployeeID;
	private String EmployeeName;
	private String EmployeeLocatin;
	private String EmployeePackages;
	 
	
	public EmployeeClass(int employeeID, String employeeName, String employeeLocatin, String employeePackages) {
		super();
		EmployeeID = employeeID;
		EmployeeName = employeeName;
		EmployeeLocatin = employeeLocatin;
		EmployeePackages = employeePackages;
	}

	/*public int getEmployeeID() {
		return EmployeeID;
	}
	public void setEmployeeID(int employeeID) {
		EmployeeID = employeeID;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public String getEmployeeLocatin() {
		return EmployeeLocatin;
	}
	public void setEmployeeLocatin(String employeeLocatin) {
		EmployeeLocatin = employeeLocatin;
	}
	public String getEmployeePackages() {
		return EmployeePackages;
	}
	public void setEmployeePackages(String employeePackages) {
		EmployeePackages = employeePackages;
	}*/
	@Override
	public String toString() {
		return "EmployeeClass [EmployeeID=" + EmployeeID + ", EmployeeName=" + EmployeeName + ", EmployeeLocatin="
				+ EmployeeLocatin + ", EmployeePackages=" + EmployeePackages + "]";
	}
	
	void displayInfo()
	{
		System.out.println(EmployeeID+" "+EmployeeName+" "+EmployeeLocatin+" "+EmployeePackages);
	}

}

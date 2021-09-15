package ltts;

public class Employee {
	private String EmployeeName;
	private String EmployeeAddress;
	private String  MobileNo;
	
	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public String getEmployeeAddress() {
		return EmployeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		EmployeeAddress = employeeAddress;
	}

	public String getMobileNo() {
		return MobileNo;
	}

	public void setMobileNo(String mobileNo) {
		MobileNo = mobileNo;
	}

	void displayInfo() {
		System.out.println(EmployeeName+" "+EmployeeAddress+" "+MobileNo);
	}
	
	

}

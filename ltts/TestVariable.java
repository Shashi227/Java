package ltts;

public class TestVariable {
	String name= "shashi";
	void displayInfo()
	{
		String name= "kumar";
		System.out.println(name);
	}
	
	void displayInfo1()
	{
		String name="Ajay pooriti";
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		TestVariable t= new TestVariable();
		t.displayInfo();
		t.displayInfo1();
	}
	

}

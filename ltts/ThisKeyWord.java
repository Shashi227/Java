package ltts;

public class ThisKeyWord {
	String Fname;
	String Lname;
	
	ThisKeyWord(){
		System.out.println("hey this is shashi here");
	}
	
	ThisKeyWord(String Fname, String Lname)
	{
		this();
		this.Fname=Fname;
		this.Lname=Lname;
		
	}
	void iisc() {
		System.out.println("now my next target is to goto iisc for M.tech");
	}
	
	void showInfo()
	{
		this.iisc();
		System.out.println(Fname+" "+Lname);
	}
	
	public static void main(String[] args) {
		ThisKeyWord this1=new ThisKeyWord("shashi","kumar");
		this1.showInfo();
	}

}

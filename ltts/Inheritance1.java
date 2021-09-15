package ltts;

public class Inheritance1
{
	void iisc()
	{
		System.out.println("iisc is best for m.tech");
	}

}

 class SingleLevelInheritance extends Inheritance1
 {
	 void iisc()
		{
		 
			System.out.println("iisc is best for m.tech & Research");
		}
	
 
 public static void main(String[] args) 
 {
	 SingleLevelInheritance s1=new SingleLevelInheritance();
	 s1.iisc();
 }
 }

 


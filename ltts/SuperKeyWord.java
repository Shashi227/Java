package ltts;

public class SuperKeyWord {
	int a=10001010;
	void iisc()
	{
		System.out.println("iisc is best for m.tech");
	}

}

 class SingleLevelInheritance11 extends SuperKeyWord
 {
	 void iisc()
		{
		    super.iisc();
		    //System.out.println(super.a);
			System.out.println("iisc is best for m.tech & Research");
		}
	 
 
 
 
	
public static class Demo {
	 public static void main(String[] args)  {
		 SingleLevelInheritance11 s1=new SingleLevelInheritance11();
		 s1.iisc();
 }
 }
 }
 



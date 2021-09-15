package ltts;

public class ParameterRisedConstructor {
	ParameterRisedConstructor(int a, int b)
	{
		System.out.println(a+" "+b);
	}
	ParameterRisedConstructor(String a, int b)
	{
		System.out.println(a+" "+b);
	}
	
	public static void main(String[] args) {
		ParameterRisedConstructor c1 = new ParameterRisedConstructor(10,20);
		ParameterRisedConstructor c2 = new ParameterRisedConstructor("ltts is best for engineer",20);
		
	}

}

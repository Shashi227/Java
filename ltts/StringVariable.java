package ltts;

public class StringVariable {
	static int index=0;
	
	void string1() {
	    //int index=5;
		System.out.println(++index);
	}
	
	void string2() {
		++index;
		System.out.println(index);
	}
	
	public static void main(String[] args) {
		StringVariable str1 = new StringVariable();
		str1.string1();
		str1.string2();
		str1.string1();
		str1.string2();
		
		StringVariable str2 = new StringVariable();//with another object
		str2.string1();
		str2.string2();
		str2.string1();
		str2.string2();
	}

}

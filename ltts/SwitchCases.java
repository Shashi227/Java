package ltts;

import java.util.Scanner;

public class SwitchCases {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Day as your choice:-\n");
		int Day =  input.nextInt();
		
		
		
		switch(Day)
		{
			case 1: System.out.println("Day is sunday");
			break;
			case 2: System.out.println("Day is monday");
			break;
			case 3: System.out.println("Day is tuesday");
			break;
			case 4: System.out.println("Day is wednesday");
			break;
			
		}
	}

}

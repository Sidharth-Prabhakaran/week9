package week9;

import java.util.Scanner;

public class EnumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day today;
		today = Day.tue;
		System.out.println(today);
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the day");
		String a = in.nextLine();
		Day userIn = Day.valueOf(a);
		for (Day d : Day.values()) { 
		    if (userIn == d)
		    	System.out.println("Entered day is : " + d);
		}

	}

}

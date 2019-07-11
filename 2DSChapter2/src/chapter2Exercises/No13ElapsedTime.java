package chapter2Exercises;

import java.util.*;

public class No13ElapsedTime {

	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
		int hours;
		int minutes;
		int seconds;
		
		int elapsed;
		
		System.out.println("Enter hours: ");
		hours = console.nextInt();
		
		System.out.println("Enter minutes: ");
		minutes = console.nextInt();
		
		System.out.println("Enter seconds: ");
		seconds = console.nextInt();
		
		elapsed = hours*3600 + minutes*60 + seconds;
		
		System.out.println("Elapsed time in seconds:" +" " + elapsed);
		
	}
	
}

package com.tolltax;

import java.util.Scanner;

public class tolltaxmain {

	public static void main(String[] args) {
		twowheeler v1= new twowheeler(0,0,0,null,null);	
		threewheeler v2= new threewheeler(0,0,0,null,null);	
		fourwheeler v3=new fourwheeler(0,0,0,null,null);
		heavyvehicle v4=new heavyvehicle(0,0,0,null,null);
        int ch=0;
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("*** TOLL TAX MANAGEMENT SYSTEM ***");
		System.out.println("1. TWO WHEELER");
		System.out.println("2. THREE WHEELER");
		System.out.println("3. FOUR WHEELER");
		System.out.println("4. HEAVY VEHICLE");
		System.out.println("5. Exit");
		System.out.println("----------------------------------");
		ch = sc.nextInt();
		

		switch (ch) {
		case 1:
			v1.displaytwowheeler();
			break;
		case 2:
			v2.displaythreewheeler();
			break;
		case 3:
			v3.displayfourwheeler();
			break;
		case 4:
			v4.displayheavyvehicle();
			break;
		case 5:
			break;
		default:
			System.out.println("Invalid choice, try again !");
			sc.close();
		}

		

}
 
}
	

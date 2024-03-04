package com.tolltax;

import java.util.Scanner;

public class threewheeler extends vehicle {

	public threewheeler(int nofperson, int extratoll, int basictoll, String vehicleno,String vehitype) {
		super(nofperson, extratoll, basictoll, vehicleno,vehitype);
	
	}

	void displaythreewheeler() {
	

		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter vehicle number: ");
		 vehicleno = sc.next();
         System.out.println("Enter extra person: ");
		 nofperson = sc.nextInt();
		 System.out.println("-------------------------------------");
		 System.out.println("    TOLL TAX RECIPT(THREE-WHEELER)   ");
		 System.out.println("*************************************");
		 System.out.println("NOTE: BASICTOLL IS 30RS  \nEXTRA CHARGE IS 20RS/PERSON");
		 System.out.println("----------------------------------");
		 System.out.println("Vehicle number: "+vehicleno);
		 System.out.println("Number of Extra person: "+nofperson);
		 System.out.println("----------------------------------");
		 
		 if (nofperson>3)
		  {
	      
		totaltoll=(nofperson*20+30);
		System.out.print("Totaltoll is: "+totaltoll+"RS");
		
		  }
		  
		  
		  else if(nofperson<=3)
		  {
			  totaltoll=30;
			  System.out.print("Totaltoll is: "+totaltoll+"RS");
		  }
		  
		  else {
			  System.out.print("Invalid input");
			  sc.close();
			  
		  }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

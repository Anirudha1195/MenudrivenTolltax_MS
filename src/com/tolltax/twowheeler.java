package com.tolltax;

import java.util.Scanner;

public class twowheeler extends vehicle {
	
		
	
	public twowheeler(int nofperson, int extratoll, int basictoll, String vehicleno,String vehitype) {
		super(nofperson, extratoll, basictoll, vehicleno,vehitype);
	}

	void displaytwowheeler() {
		
		

		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter vehicle number: ");
		 vehicleno = sc.next();
		 System.out.println("Enter extra person: ");
		 nofperson = sc.nextInt();
		 System.out.println("-----------------------------------");
		 
		 System.out.println("    TOLL TAX RECIPT(TWO-WHEELER)   ");
		 System.out.println("***********************************");
		 System.out.println("NOTE: BASICTOLL IS 20RS  \nEXTRA CHARGE IS 10RS/PERSON");
		 System.out.println("----------------------------------");
		 System.out.println("Vehicle number: "+vehicleno);
		 System.out.println("Number of Extra person: "+nofperson);
		 System.out.println("----------------------------------");
		 
		 if (nofperson>2)
		  {
	      
		totaltoll=(nofperson*10+20);
		System.out.print("Totaltoll is: "+totaltoll+"RS");
		
		  }
		  
		  
		  else if(nofperson<=2)
		  {
			  totaltoll=20;
			  System.out.print("Totaltoll is: "+totaltoll+"RS");
		  }
		  
		  else {
			  System.out.print("Invalid input");  
			  
		  }
		  
		  
	sc.close();	  
		  
	}
	
		
}	
	


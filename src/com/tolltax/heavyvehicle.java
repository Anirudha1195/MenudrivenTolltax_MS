package com.tolltax;

import java.util.Scanner;

public class heavyvehicle extends vehicle {

	public heavyvehicle(int nofperson, int extratoll, int basictoll,String vehicleno,String vehitype) {
		super(nofperson, extratoll, basictoll, vehicleno,vehitype);
		
	}

	void displayheavyvehicle() {
		
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter vehicle number: ");
		 vehicleno = sc.next();
		 System.out.println("Enter extra person: ");
		 nofperson = sc.nextInt();
		 System.out.println("-------------------------------------");
		 System.out.println("   TOLL TAX RECIPT(HEAVY-VEHICLE)    ");
		 System.out.println("*************************************");
		 System.out.println("NOTE: BASICTOLL IS 60RS  \nEXTRA CHARGE IS 100RS/PERSON");
		 System.out.println("----------------------------------");
		 System.out.println("Vehicle number: "+vehicleno);
		 System.out.println("Number of Extra person: "+nofperson);
		 System.out.println("----------------------------------");
		 
		 
		 if (nofperson>6)
		  {
	      
		totaltoll=(nofperson*100+60);
		System.out.print("Totaltoll is: "+totaltoll+"RS");
		
		  }
		  
		  
		  else if(nofperson<=6)
		  {
			  totaltoll=60;
			  System.out.print("Totaltoll is: "+totaltoll+"RS");
		  }
		  
		  else {
			  System.out.print("Invalid input");
			  sc.close();
			  
		  }	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}



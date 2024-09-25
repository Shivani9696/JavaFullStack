package com.sept24.MainClasses;

import com.sept24.Interfaces.Registrable;

public class MainCourses {

	public static void main(String[] args) {
		Registrable javaCourse = (fees)-> {if(fees>5000) 
									{System.out.println("The Student is registered for **Java** course");}
		else {System.out.println("Hurry up!! Seats are limited for Java Course");}
		
		};  
		javaCourse.payFees(6000);
		
		Registrable BlockChain = (fees)-> {if(fees>3000) 
		{System.out.println("The Student is registered for **Blockchain** course");}
		else {System.out.println("Hurry up!! Seats are limited for BlockChain Course");}
		
		};  
		BlockChain.payFees(3000);
		
		Registrable Python = (fees)-> {if(fees>5000) 
		{System.out.println("The Student is registered for **Python** course");}
		else {System.out.println("Hurry up!! Seats are limited for Python Course");}
		
		};  
		Python.payFees(12000);
	}

}

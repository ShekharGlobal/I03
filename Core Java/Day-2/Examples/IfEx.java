package com.example.basic;

public class IfEx {

	public static void main(String[] args) {
		
		int empId = 127;
		int retirementAge = 58;
		int empAge = 34;
		
		
		if ((empAge < retirementAge) && (empId == 126)) {
			System.out.println("Calculate Salary ");
		}

		else {
			System.out.println("Calculate Pension");
		}

	}

}

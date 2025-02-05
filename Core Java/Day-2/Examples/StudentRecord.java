package com.example.oops;

public class StudentRecord {

	private String name;
	private int studentId;
	private String grade;

	public StudentRecord() {
		System.out.println("default constructor");
	}

	public StudentRecord(String name) {
		this.name = name;
	}
	
	public StudentRecord(String name, int studentId) {
		this.name= name;
		this.studentId=studentId;
	}

	
	public StudentRecord(String name, int studentId, String grade) {
		this.name= name;
		this.studentId=studentId;
		this.grade= grade;
	}
	
	public static void main(String[] args) {

		// default
		StudentRecord s1 = new StudentRecord();

		// 1 parameter

		StudentRecord s2 = new StudentRecord("Vijay");
		System.out.println(s2.name);
		
		
		StudentRecord s3= new StudentRecord("LakshmiPriya",121);
		System.out.println(s3.name+ " "+ s3.studentId);
		
		
		StudentRecord s4= new StudentRecord("Bharagav", 122,"A+");
		System.out.println(s4.name+ " "+ s4.studentId + " "+ s4.grade);

	}

}

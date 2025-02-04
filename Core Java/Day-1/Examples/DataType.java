package com.example.basic;

public class DataType {
	
	 byte b1;
	 short s1;
	 int i1;
	 long l1;
	 float f1;
	 double d1;
	 char c1;
	 boolean b2;
	 String s3;
	 

	public static void main(String[] args) {
		
		DataType d1= new DataType();
		
		System.out.println("Byte Default Value: "+ d1.b1);
		System.out.println("Short Default Value: "+ d1.s1);
		System.out.println("Integer Default Value: "+ d1.i1);
		System.out.println("Float Default Value: "+ d1.f1);
		System.out.println("Double Default Value: "+ d1.d1);
		System.out.println("Char Default Value: "+ d1.c1); // 65536  u0000
		System.out.println("Boolean Default Value: "+ d1.b2);
		System.out.println("String Default Value: "+ d1.s3);

	}

}

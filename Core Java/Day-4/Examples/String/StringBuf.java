package com.example.string;

public class StringBuf {

	public static void main(String[] args) {
		
		StringBuilder strbuf= new StringBuilder("hello");
	
		System.out.println(strbuf.length());
		
		strbuf.append("world");
		
		System.out.println(strbuf);
		
		strbuf.insert(5, "_Java ");
		System.out.println(strbuf);
		
		strbuf.setCharAt(5, ' ');
		System.out.println(strbuf);
		
		System.out.println("Character at sixth position: ");
		System.out.println(strbuf.charAt(6));
		
		strbuf.deleteCharAt(3);
		System.out.println(strbuf);
		
		System.out.println("Capacity of StringBuffer Object :");
		System.out.println(strbuf.capacity());
		
		strbuf.reverse();
		
		System.out.println("Reverse String: ");
		System.out.println(strbuf);
		
		
	}

}

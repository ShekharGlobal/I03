package com.example.string;

import java.util.StringTokenizer;

public class StringToken {

	public static void main(String[] args) {
		
		String str="This is String, Split by StringTokenizer, using comma as delimintor";
		StringTokenizer st2= new StringTokenizer(str,",");
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}

	}

}

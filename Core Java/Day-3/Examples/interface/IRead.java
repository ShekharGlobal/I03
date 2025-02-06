package com.example.interfaces;

public interface IRead {

	static final double pi = 3.14;

	public abstract void getName();

	default void hello() {
		System.out.println("Good Evening All");
	}

}



interface Iread2{
	
	public abstract void getName2();
	
}


interface Iread3  extends IRead, Iread2{
	
}
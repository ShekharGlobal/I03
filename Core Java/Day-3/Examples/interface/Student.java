package com.example.interfaces;

public class Student extends College implements IRead, Iread2 {

	@Override
	public void getName() {
		System.out.println("Tejas");

	}

	@Override
	public void getName2() {
		System.out.println("Gagana");

	}

}

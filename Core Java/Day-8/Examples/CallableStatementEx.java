package com.mphasis.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CallableStatementEx {
		/**
		* CREATE  PROCEDURE `cdac`()
		BEGIN
		SELECT * FROM EMP;
		END */
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
        
	//	Scanner s1= new Scanner(System.in);
		String callProc = "{call cdac()}";

		CallableStatement cs = con.prepareCall(callProc);
        System.out.println(cs);
		ResultSet rs = cs.executeQuery();

		while (rs.next()) {
			System.out.println("Employee's ID: " + rs.getInt(1));
			System.out.println("Employee's First Name: " + rs.getString(2));
			System.out.println("Employee's Last Name: " + rs.getString(3));
			System.out.println("-----------------------------------------");
		}

	}

}

package com.mphasis.jdbc;

//step 1
import java.sql.*;

public class MysqlCon {

	public static void main(String[] args) {
		// step-2 Register the Driver

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			// step-3 Establish connection

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");

			System.out.println(con);
			// step -4

			stmt = con.createStatement();

			// step-5

			rs = stmt.executeQuery("Select * from emp");
			while (rs.next()) {
				System.out.println("Id: " + rs.getInt("id"));
				System.out.println("First Name: " + rs.getString(2));
				System.out.println("Last Name: " + rs.getString(3));
				System.out.println("============================");
			}
		} catch (Exception e) {
			System.out.println("exception");

		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			}
			catch(Exception e) {
				System.out.println("Exception");
			}
			
		}

	}

}

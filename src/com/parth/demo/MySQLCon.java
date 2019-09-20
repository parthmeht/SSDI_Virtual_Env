package com.parth.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class MySQLCon {
	public static ArrayList<Student> getStudentsData() {
		ArrayList<Student> list = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb?serverTimezone=UTC", "root", "12345678");
			// here sonoo is database name, root is username and password
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from Student");
			list = new ArrayList<>();
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "  " + rs.getString(2));
				Student student = new Student(rs.getInt(1),rs.getString(2));
				list.add(student);
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

		return list;
	}
	
}

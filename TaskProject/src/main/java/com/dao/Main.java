package com.dao;

import com.beans.Registration;

public class Main {
	public static void main(String[] args) {
		RegisterDAO dao = new RegisterDAO();
		Registration emp = new Registration(704959, "Deepika");
//		System.out.println(dao.insertRegistration(emp));

		
		System.out.println(dao.userLogin(emp));
//		System.out.println(dao.isValidUser(704958, "Deepika"));
	}
}

package com.cognizant.singleton;

public class Main {
	public static void main(String[] args) {
		DBConn ob = DBConn.getInstance();
		DBConn ob1 = DBConn.getInstance();
		System.out.println(ob);
		System.out.println(ob1);
		ob.display();
	}
}

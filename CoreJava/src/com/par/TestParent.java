package com.par;

public class TestParent {

	int id;
	String name;

}

class Child extends TestParent {
	String city;

	public Child(String city, int id, String name) {
		this.city = city;
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {

		Child child = new Child("hi", 2, "sk");
		System.out.println(child.id);
		
	}

}

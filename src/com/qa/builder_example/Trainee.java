package com.qa.builder_example;

public class Trainee {
	private String name;
	private int age;
	private String technology;

	public Trainee(String name, int age, String technology) {
		this.name = name;
		this.age = age;
		this.technology = technology;
	}

	@Override
	public String toString() {
		return "Name: " + this.name + ", Age: " + this.age;
	}
}
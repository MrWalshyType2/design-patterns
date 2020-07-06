package com.qa.builder_example;

public class App {
	public static void main(String args[]) {
		Trainee t1 = new TraineeBuilder().name("Grognak").buildTrainee();
		System.out.println(t1);
	}
}

package com.qa.builder_example;

public class TraineeBuilder {
	private String name;
	private int age = 0;
	private String technology = "N\\A";

	public TraineeBuilder() {

	}

	public Trainee buildTrainee() {
		return new Trainee(this.name, this.age, this.technology);
	}

	public TraineeBuilder name(String _name) {
		this.name = _name;
		return this;
	}

	public TraineeBuilder age(int _age) {
		this.age = _age;
		return this;
	}

	public TraineeBuilder technology(String _technology) {
		this.technology = _technology;
		return this;
	}
}

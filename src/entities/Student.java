package entities;

import enums.ClassEnum;

import java.util.List;

public class Student {

	private int code;
	private ClassEnum highSchoolClass;
	private String name;
	private float testOne;
	private float testTwo;
	private float testThree;

	public Student() {
	}

	public Student(ClassEnum highSchoolClass, int code, String name, float testOne, float testTwo, float testThree) {
		this.highSchoolClass = highSchoolClass;
		this.code = code;
		this.name = name;
		this.testOne = testOne;
		this.testTwo = testTwo;
		this.testThree = testThree;
	}

	public ClassEnum getHighSchoolClass() {
		return highSchoolClass;
	}

	public void setHighSchoolClass(ClassEnum highSchoolClass) {
		this.highSchoolClass = highSchoolClass;
	}

	public String getName() {
		return name;
	}

	public float getTestOne() {
		return testOne;
	}

	public float getTestTwo() {
		return testTwo;
	}

	public float getTestThree() {
		return testThree;
	}

	public int getCode() {
		return code;
	}

	public float getGradeTestAverage() {
		return (getTestOne() + getTestTwo() + getTestThree()) / 3.0f;
	}

	public List<Float> getAllStudentTestInArray() {
		return List.of(
				getTestOne(),
				getTestTwo(),
				getTestThree()
		);
	}

}

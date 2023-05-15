package builders;

import entities.Student;
import entities.StudentLastExercise;
import enums.ClassEnum;

import java.util.List;

public abstract class StudentsBuilder {

	public static List<StudentLastExercise> getAllStudentsLastExercise() {
		return List.of(
				new StudentLastExercise(1, "Aluno 1", 6.0f, 7.8f, 7.4f),
				new StudentLastExercise(2, "Aluno 2", 8.0f, 5.0f, 9.9f),
				new StudentLastExercise(3, "Aluno 3", 6.6f, 6.6f, 6.4f),
				new StudentLastExercise(4, "Aluno 4", 6.7f, 7.9f, 10.0f),
				new StudentLastExercise(5, "Aluno 5", 6.1f, 4.4f, 5.7f),
				new StudentLastExercise(6, "Aluno 6", 7.3f, 7.3f, 8.8f),
				new StudentLastExercise(7, "Aluno 7", 8.2f, 8.2f, 9.9f),
				new StudentLastExercise(8, "Aluno 8", 10.0f, 9.1f, 7.7f)
		);
	}

	public static List<Student> getAllStudents() {
		return List.of(
				new Student(ClassEnum.HIGH_SCHOOL_FIRST_YEAR, 1, "Aluno 11", 6.0f, 7.8f, 7.4f),
				new Student(ClassEnum.HIGH_SCHOOL_FIRST_YEAR, 2, "Aluno 12", 8.0f, 5.0f, 9.9f),
				new Student(ClassEnum.HIGH_SCHOOL_FIRST_YEAR, 3, "Aluno 13", 6.6f, 6.6f, 6.4f),
				new Student(ClassEnum.HIGH_SCHOOL_FIRST_YEAR, 4, "Aluno 14", 6.7f, 7.9f, 10.0f),
				new Student(ClassEnum.HIGH_SCHOOL_FIRST_YEAR, 5, "Aluno 15", 6.1f, 4.4f, 5.7f),
				new Student(ClassEnum.HIGH_SCHOOL_FIRST_YEAR, 6, "Aluno 16", 7.3f, 7.3f, 8.8f),
				new Student(ClassEnum.HIGH_SCHOOL_FIRST_YEAR, 7, "Aluno 17", 8.2f, 8.2f, 9.9f),
				new Student(ClassEnum.HIGH_SCHOOL_FIRST_YEAR, 8, "Aluno 18", 10.0f, 9.1f, 7.7f),

				new Student(ClassEnum.HIGH_SCHOOL_SECOND_YEAR, 9, "Aluno 21", 2.0f, 8.8f, 4.4f),
				new Student(ClassEnum.HIGH_SCHOOL_SECOND_YEAR, 10, "Aluno 22", 5.0f, 9.0f, 6.9f),
				new Student(ClassEnum.HIGH_SCHOOL_SECOND_YEAR, 11, "Aluno 23", 7.6f, 3.6f, 8.4f),
				new Student(ClassEnum.HIGH_SCHOOL_SECOND_YEAR, 12, "Aluno 24", 7.8f, 10.0f, 8.0f),
				new Student(ClassEnum.HIGH_SCHOOL_SECOND_YEAR, 13, "Aluno 25", 9.1f, 3.4f, 9.7f),
				new Student(ClassEnum.HIGH_SCHOOL_SECOND_YEAR, 14, "Aluno 26", 6.3f, 3.3f, 4.8f),
				new Student(ClassEnum.HIGH_SCHOOL_SECOND_YEAR, 15, "Aluno 27", 10.0f, 8.2f, 9.9f),
				new Student(ClassEnum.HIGH_SCHOOL_SECOND_YEAR, 16, "Aluno 28", 10.0f, 8.1f, 7.1f),

				new Student(ClassEnum.HIGH_SCHOOL_THIRD_YEAR, 17, "Aluno 31", 6.8f, 6.8f, 7.4f),
				new Student(ClassEnum.HIGH_SCHOOL_THIRD_YEAR, 18, "Aluno 32", 9.1f, 9.0f, 9.9f),
				new Student(ClassEnum.HIGH_SCHOOL_THIRD_YEAR, 19, "Aluno 33", 5.6f, 4.6f, 4.4f),
				new Student(ClassEnum.HIGH_SCHOOL_THIRD_YEAR, 20, "Aluno 34", 4.7f, 6.9f, 10.0f),
				new Student(ClassEnum.HIGH_SCHOOL_THIRD_YEAR, 21, "Aluno 35", 9.1f, 4.4f, 6.7f),
				new Student(ClassEnum.HIGH_SCHOOL_THIRD_YEAR, 22, "Aluno 36", 8.3f, 2.3f, 9.8f),
				new Student(ClassEnum.HIGH_SCHOOL_THIRD_YEAR, 23, "Aluno 37", 9.2f, 2.2f, 7.9f),
				new Student(ClassEnum.HIGH_SCHOOL_THIRD_YEAR, 24, "Aluno 38", 1.0f, 10.0f, 10.0f)
		);
	}
}

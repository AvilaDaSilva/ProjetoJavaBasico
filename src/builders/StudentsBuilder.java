package builders;

import entities.Studant;

import java.util.List;

public abstract class StudentsBuilder {

    public static List<Studant> getAllStudents() {
        return List.of(
            new Studant(1, "Aluno 1", 6.0f, 7.8f, 7.4f),
            new Studant(2, "Aluno 2", 8.0f, 5.0f, 9.9f),
            new Studant(3, "Aluno 3", 6.6f, 6.6f, 6.4f),
            new Studant(4, "Aluno 4", 6.7f, 7.9f, 10.0f),
            new Studant(5, "Aluno 5", 6.1f, 4.4f, 5.7f),
            new Studant(6, "Aluno 6", 7.3f, 7.3f, 8.8f),
            new Studant(7, "Aluno 7", 8.2f, 8.2f, 9.9f),
            new Studant(8, "Aluno 8", 10.0f, 9.1f, 7.7f)
        );
    }
}

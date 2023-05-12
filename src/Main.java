import builders.StudentsBuilder;
import entities.Studant;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // O retorno do allStudents é uma List
        var allStudents = StudentsBuilder.getAllStudents();
        // Agora vamos as atividades
        System.out.println("Exercício 1");
        DecimalFormat formatador = new DecimalFormat("0.00");
        /*
        1. Recupere da lista os alunos que passaram de ano (nota minima 7.0).
        - Exiba os dados nesse formato: <código> - <nome> : Média = <nota>*/
        System.out.println("Alunos que passaram de ano");
        for (Studant students : allStudents) {
            float nota = (students.getTestOne() + students.getTestTwo() + students.getTestThree()) / 3;
            if (nota >= 7) {
                System.out.println(students.getCode() + " Nome :" + students.getName() + "Média = " + formatador.format(nota));
            }
        }

        System.out.println();
        System.out.println("Exercício 2");

        /*
        2. Recupere da lista os alunos que não passaram de ano.
            - Exiba os dados nesse formato: <código> - <nome> : Média = <media> (Faltou = <nota_faltante>)*/
        System.out.println();
        System.out.println(" Não aprovados");
        for (Studant students : allStudents) {
            float nota = (students.getTestOne() + students.getTestTwo() + students.getTestThree()) / 3;
            if (nota < 7) {
                System.out.println(students.getCode() + " Nome :" + students.getName() + " Média = " + formatador.format(nota) + " Faltou = " + formatador.format(7 - nota));
            }
        }
        System.out.println();
        System.out.println("Exercício 3");
        System.out.println();
        /*
        3. Traga os alunos que tiraram a nota máxima (nota 10).
            - Exiba os dados nesse formato: <código> - <nome>*/

        System.out.println();
        System.out.println("Alunos que tiraram a nota máxima");
        System.out.println();
        for (Studant students : allStudents) {
            float nota = (students.getTestOne() + students.getTestTwo() + students.getTestThree()) / 3;
            if (nota == 10) {
                System.out.println(students.getCode() + " Nome :" + students.getName());
            }
        }


        System.out.println();
        System.out.println("Exercício 4");
        System.out.println();
       /* 4. Traga o aluno que tirou a menor nota, em caso de notas iguais, traga ambos os alunos.
            - Exiba os dados nesse formato: <código> - <nome> : Nota = <nota>*/

        double menorNota = Double.MAX_VALUE;
        for (Studant students : allStudents) {
            float nota = (students.getTestOne() + students.getTestTwo() + students.getTestThree()) / 3;
            if (nota < menorNota) {
                menorNota = nota;
            }
        }
        for (Studant students : allStudents) {
            float nota = (students.getTestOne() + students.getTestTwo() + students.getTestThree()) / 3;
            if (nota == menorNota) {
                System.out.println(students.getCode() + " Nome :" + students.getName() + " Nota  " + formatador.format(nota));
            }
        }


        System.out.println();
        System.out.println("Exercício 5");
        System.out.println();
        /*
        5. Faça uma lista com top 3 notas de alunos. Em caso de notas iguais coloque todos na mesma posição.
            - Ex:
                1º - Fulano : Nota = 10.0;
                   - Beltrano : Nota = 10.0;
                2º - Joãozinho : Nota = 9.0;
                3º - Mariazinha : Nota = 8.9;
            - Exiba os dados nesse formato: <posicao> - <nome> : Nota = <nota>*/

        ArrayList<Float> listNota = new ArrayList<Float>();
        float notaone = 0;
        float notatwo = 0;
        float notaThree = 0;
        for (Studant students : allStudents) {
            float nota = (students.getTestOne() + students.getTestTwo() + students.getTestThree()) / 3;
            if (nota > notaone) {
                notaThree = notatwo;
                notatwo = notaone;
                notaone = nota;

            }
            if (nota > notatwo && nota < notaone) {
                notaThree = notatwo;
                notatwo = nota;
            }
            if (nota > notaThree && nota < notaone && nota < notatwo) {
                notaThree = nota;
            }


        }
        int i = 0;

        //
        for (Studant students : allStudents) {
            float nota = (students.getTestOne() + students.getTestTwo() + students.getTestThree()) / 3;
            if (nota == notaone) {
                if (i == 0) {
                    System.out.println(i + "º - " + students.getName() + " :" + "Nota = " + formatador.format(nota));
                    i++;
                } else {
                    System.out.println("  " + " - " + students.getName() + " :" + "Nota = " + formatador.format(nota));
                }
            }

        }
        for (Studant students : allStudents) {
            float nota = (students.getTestOne() + students.getTestTwo() + students.getTestThree()) / 3;
            if (nota == notatwo) {
                if (i == 1) {
                    System.out.println(i + "º - " + students.getName() + " :" + "Nota = " + formatador.format(nota));
                    i++;
                } else {
                    System.out.println("  " + " - " + students.getName() + " :" + "Nota = " + formatador.format(nota));
                }
            }

        }
        for (Studant students : allStudents) {
            float nota = (students.getTestOne() + students.getTestTwo() + students.getTestThree()) / 3;
            if (nota == notaThree) {
                if (i == 2) {
                    System.out.println(i + "º - " + students.getName() + " :" + "Nota = " + formatador.format(nota));
                    i++;
                } else {
                    System.out.println("  " + " - " + students.getName() + " :" + "Nota = " + formatador.format(nota));
                }
            }

        }


        System.out.println();
        System.out.println("Exercício 6");
        System.out.println();

    /*  6. Faça uma lista com as 3 menores notas de alunos. Em caso de notas iguais coloque todos na mesma posição. Exemplo igual a anterior
          - Exiba os dados nesse formato: <posicao> - <nome> : Nota = <nota>*/

        ArrayList<Float> listNotaMenores = new ArrayList<Float>();
        float notamenor1 = Float.MAX_VALUE;
        float notamenor2 = Float.MAX_VALUE;
        float notamenor3 = Float.MAX_VALUE;
        System.out.println("Menores notas");
        for (Studant students : allStudents) {
            float nota = (students.getTestOne() + students.getTestTwo() + students.getTestThree()) / 3;
            if (nota < notamenor1) {
                notamenor3 = notamenor2;
                notamenor2 = notamenor1;
                notamenor1 = nota;

            }
            if (nota < notamenor2 && nota > notamenor1) {
                notamenor3 = notamenor2;
                notamenor2 = nota;
            }
            if (nota < notamenor3 && nota > notamenor1 && nota > notamenor2) {
                notamenor3 = nota;
            }


        }

        int j = 0;

        //
        for (Studant students : allStudents) {
            float nota = (students.getTestOne() + students.getTestTwo() + students.getTestThree()) / 3;
            if (nota == notamenor1) {
                if (j == 0) {
                    System.out.println(j + "º - " + students.getName() + " :" + "Nota = " + formatador.format(nota));
                    j++;
                } else {
                    System.out.println("  " + " - " + students.getName() + " :" + "Nota = " + formatador.format(nota));
                }
            }

        }
        for (
                Studant students : allStudents) {
            float nota = (students.getTestOne() + students.getTestTwo() + students.getTestThree()) / 3;
            if (nota == notamenor2) {
                if (j == 1) {
                    System.out.println(j + "º - " + students.getName() + " :" + "Nota = " + formatador.format(nota));
                    j++;
                } else {
                    System.out.println("  " + " - " + students.getName() + " :" + "Nota = " + formatador.format(nota));
                }
            }

        }
        for (Studant students : allStudents) {
            float nota = (students.getTestOne() + students.getTestTwo() + students.getTestThree()) / 3;
            if (nota == notamenor3) {
                if (j == 2) {
                    System.out.println(j + "º - " + students.getName() + " :" + "Nota = " + formatador.format(nota));
                    j++;
                } else {
                    System.out.println("  " + " - " + students.getName() + " :" + "Nota = " + formatador.format(nota));
                }
            }

        }


     /* 7. Monte a média de todos os alunos e exiba em tela ordenando da maior para a menor nota.
            - Exiba os dados nesse formato: <posicao> - <código> - <nome> : Média = <nota>

      */
        System.out.println();
        System.out.println("Exercício 7");
        System.out.println();
        ArrayList<Float> listNotas = new ArrayList<Float>();
        for (Studant students : allStudents) {
            float nota = (students.getTestOne() + students.getTestTwo() + students.getTestThree()) / 3;

            listNotas.add(nota);

        }
        int k = 0;
        int l = 0;
        Collections.sort(listNotas, Collections.reverseOrder());


        while (l < listNotas.size()) {
            for (Studant students : allStudents) {
                float nota = (students.getTestOne() + students.getTestTwo() + students.getTestThree()) / 3;
                if (nota == listNotas.get(l)) {
                    System.out.println(l + " - " + students.getName() + " :" + "Nota = " + formatador.format(nota));
                }
            }
            l++;
        }
    }
}


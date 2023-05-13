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
        System.out.println("Alunos que tiraram  nota máxima");
        System.out.println();
        for (Studant students : allStudents) {

            if (students.getTestOne() == 10 || students.getTestTwo() == 10 || students.getTestThree() == 10) {
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

            if (menorNota > students.getTestOne() || students.getTestTwo() > menorNota || students.getTestThree() > menorNota) {

                if (students.getTestOne() < menorNota && students.getTestOne() < students.getTestTwo() && students.getTestOne() < students.getTestThree()) {
                    menorNota = students.getTestOne();
                } else {
                    if (students.getTestTwo() < menorNota && students.getTestTwo() < menorNota && students.getTestTwo() < students.getTestOne() && students.getTestTwo() < students.getTestThree()) {
                        menorNota = students.getTestTwo();
                    } else {
                        if (students.getTestThree() < menorNota && students.getTestThree() < menorNota && students.getTestThree() < students.getTestOne() && students.getTestThree() < students.getTestTwo()) {
                            menorNota = students.getTestThree();
                        }
                    }
                }

            }


        }
        for (Studant students : allStudents) {

            if (menorNota == students.getTestOne() || students.getTestTwo() == menorNota || students.getTestThree() == menorNota) {
                System.out.println(students.getCode() + " Nome :" + students.getName() + " Nota  " + formatador.format(menorNota));
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
        float notaone = Float.MIN_VALUE;
        float notatwo = Float.MIN_VALUE;
        float notaThree = Float.MIN_VALUE;
        for (Studant students : allStudents) {
            if (students.getTestOne() > notaone) {
                notaThree = notatwo;
                notatwo = notaone;
                notaone = students.getTestOne();
            }
            if (students.getTestTwo() > notaone) {
                notaThree = notatwo;
                notatwo = notaone;
                notaone = students.getTestTwo();
            }
            if (students.getTestThree() > notaone) {
                notaThree = notatwo;
                notatwo = notaone;
                notaone = students.getTestThree();
            }
            if (students.getTestOne() > notatwo && students.getTestOne() < notaone) {
                notaThree = notatwo;
                notatwo = students.getTestOne();
            }
            if (students.getTestTwo() > notatwo && students.getTestTwo() < notaone) {
                notaThree = notatwo;
                notatwo = students.getTestTwo();
            }
            if (students.getTestThree() > notatwo && students.getTestThree() < notaone) {
                notaThree = notatwo;
                notatwo = students.getTestThree();
            }
            if (students.getTestOne() > notaThree && students.getTestOne() < notaone && students.getTestOne() < notatwo) {
                notaThree = students.getTestOne();
            }
            if (students.getTestTwo() > notaThree && students.getTestTwo() < notaone && students.getTestTwo() < notatwo) {
                notaThree = students.getTestTwo();
            }
            if (students.getTestThree() > notaThree && students.getTestThree() < notaone && students.getTestThree() < notatwo) {
                notaThree = students.getTestThree();
            }


        }


        int i = 0;

        //
        for (Studant students : allStudents) {

            if (students.getTestOne() == notaone || students.getTestTwo() == notaone || students.getTestThree() == notaone) {
                if (i == 0) {
                    System.out.println(i + "º - " + students.getName() + " :" + "Nota = " + formatador.format(notaone));
                    i++;
                } else {
                    System.out.println("  " + " - " + students.getName() + " :" + "Nota = " + formatador.format(notaone));
                }
            }

        }
        for (Studant students : allStudents) {

            if (students.getTestOne() == notatwo || students.getTestTwo() == notatwo || students.getTestThree() == notatwo) {
                if (i == 1) {
                    System.out.println(i + "º - " + students.getName() + " :" + "Nota = " + formatador.format(notatwo));
                    i++;
                } else {
                    System.out.println("  " + " - " + students.getName() + " :" + "Nota = " + formatador.format(notatwo));
                }
            }

        }
        for (Studant students : allStudents) {

            if (students.getTestOne() == notaThree || students.getTestTwo() == notaThree || students.getTestThree() == notaThree) {
                if (i == 2) {
                    System.out.println(i + "º - " + students.getName() + " :" + "Nota = " + formatador.format(notaThree));
                    i++;
                } else {
                    System.out.println("  " + " - " + students.getName() + " :" + "Nota = " + formatador.format(notaThree));
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
            if (students.getTestOne() < notamenor1) {
                notamenor3 = notamenor2;
                notamenor2 = notamenor1;
                notamenor1 = students.getTestOne();
            }
            if (students.getTestTwo() < notamenor1) {
                notamenor3 = notamenor2;
                notamenor2 = notamenor1;
                notamenor1 = students.getTestTwo();
            }
            if (students.getTestThree() < notamenor1) {
                notamenor3 = notamenor2;
                notamenor2 = notamenor1;
                notamenor1 = students.getTestThree();
            }
            if (students.getTestOne() < notamenor2 && students.getTestOne() > notamenor1) {
                notamenor3 = notamenor2;
                notamenor2 = students.getTestOne();
            }
            if (students.getTestTwo() < notamenor2 && students.getTestTwo() > notamenor1) {
                notamenor3 = notamenor2;
                notamenor2 = students.getTestTwo();
            }
            if (students.getTestThree() < notamenor2 && students.getTestThree() > notamenor1) {
                notamenor3 = notatwo;
                notamenor2 = students.getTestThree();
            }
            if (students.getTestOne() <notamenor3 && students.getTestOne() > notamenor1 && students.getTestOne() > notamenor2) {
                notamenor3 = students.getTestOne();
            }
            if (students.getTestTwo() < notamenor3 && students.getTestTwo() > notamenor1 && students.getTestTwo() > notamenor2) {
                notamenor3 = students.getTestTwo();
            }
            if (students.getTestThree() <  notamenor3 && students.getTestThree() > notamenor1 && students.getTestThree() > notamenor2) {
                notamenor3 = students.getTestThree();
            }


        }

        int j = 0;

        //
        for (Studant students : allStudents) {
            if (students.getTestOne() == notamenor1 ||students.getTestTwo() == notamenor1 || students.getTestThree() == notamenor1) {
                if (j == 0) {
                    System.out.println(j + "º - " + students.getName() + " :" + "Nota = " + formatador.format(notamenor1));
                    j++;
                } else {
                    System.out.println("  " + " - " + students.getName() + " :" + "Nota = " + formatador.format(notamenor1));
                }
            }

        }
        for (Studant students : allStudents) {

            if (students.getTestOne() == notamenor2 ||students.getTestTwo() == notamenor2 || students.getTestThree() == notamenor2) {
                if (j == 1) {
                    System.out.println(j + "º - " + students.getName() + " :" + "Nota = " + formatador.format(notamenor2));
                    j++;
                } else {
                    System.out.println("  " + " - " + students.getName() + " :" + "Nota = " + formatador.format(notamenor2));
                }
            }

        }
        for (
                Studant students : allStudents) {

            if (students.getTestOne() == notamenor3 ||students.getTestTwo() == notamenor3 || students.getTestThree() == notamenor3) {
                if (j == 2) {
                    System.out.println(j + "º - " + students.getName() + " :" + "Nota = " + formatador.format(notamenor3));
                    j++;
                } else {
                    System.out.println("  " + " - " + students.getName() + " :" + "Nota = " + formatador.format(notamenor3));
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
        for (
                Studant students : allStudents) {
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


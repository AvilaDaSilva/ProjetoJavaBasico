import builders.StudentsBuilder;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		var allStudentsLastExercise = new ArrayList<>(StudentsBuilder.getAllStudentsLastExercise());

        /*

        1. Recupere da lista os alunos que passaram de ano (nota minima 7.0).
            - Exiba os dados nesse formato: <código> - <nome> : Média = <nota>
        2. Recupere da lista os alunos que não passaram de ano.
            - Exiba os dados nesse formato: <código> - <nome> : Média = <media> (Faltou = <nota_faltante>)
        3. Traga os alunos que tiraram a nota máxima (nota 10).
            - Exiba os dados nesse formato: <código> - <nome>
        4. Traga o aluno que tirou a menor nota, em caso de notas iguais, traga ambos os alunos.
            - Exiba os dados nesse formato: <código> - <nome> : Nota = <nota>
        5. Faça uma lista com top 3 notas de alunos. Em caso de notas iguais coloque todos na mesma posição.
            - Ex:
                1º - Fulano : Nota = 10.0;
                   - Beltrano : Nota = 10.0;
                2º - Joãozinho : Nota = 9.0;
                3º - Mariazinha : Nota = 8.9;
            - Exiba os dados nesse formato: <posicao> - <nome> : Nota = <nota>
        6. Faça uma lista com as 3 menores notas de alunos. Em caso de notas iguais coloque todos na mesma posição. Exemplo igual a anterior
            - Exiba os dados nesse formato: <posicao> - <nome> : Nota = <nota>
        7. Monte a média de todos os alunos e exiba em tela ordenando da maior para a menor nota.
            - Exiba os dados nesse formato: <posicao> - <código> - <nome> : Média = <nota>

         */

		var allStudents = new ArrayList<>(StudentsBuilder.getAllStudents());

        /*

        1. Recupere da lista os alunos que passaram de ano (nota minima 7.0), indicando antes da listagem, para qual série que eles foram.
            - Título da listagem: Passou do <classe em caixa alta com algum outro destaque> para <classe em caixa alta com algum outro destaque>
            - Exiba os dados nesse formato: <código> - <nome> : Média = <nota>
            PS. Os alunos que se formaram só coloque como título: SE FORMOU!
        2. Recupere da lista os alunos que não passaram de ano, indicando antes da listagem, qual série ainda estão.
            - Título da listagem: Mantém-se no <classe em caixa alta com algum outro destaque>
            - Exiba os dados nesse formato: <código> - <nome> : Média = <media> (Faltou = <nota_faltante>)
        3. Efetivamente faça as mudanças nas listagens, criando uma nova com os alunos que se formaram.
        4. Faça uma lista com top 3 médias de alunos de cada turma, pois vamos presenter os mesmos, dê o devido destaque a essa exibição.
            - Exiba os dados nesse formato: <posicao> - Parabéns <nome> : Nota = <nota>
        5. Faça uma lista com as 3 menores médias de alunos, pois vamos chamar os pais dessa galera. Aqui será preciso adicionar um novo atributo na classe, chamado telefone dos pais (tudo em inglês) que vai ser ter o seu respectivo getter e setter.
            - Exiba os dados nesse formato: <posicao> - <nome> : Nota = <nota> - Telefone dos pais: <telefone_dos_pais>
        6. Monte a média de todos os alunos e exiba em tela ordenando da maior para a menor nota.
            - Exiba os dados nesse formato: <posicao> - <código> - <nome> : Média = <nota>

         */
	}
}

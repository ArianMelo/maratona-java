package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome ="Renata";
        estudante01.idade =16;
        estudante01.sexo ='F';

        estudante02.nome ="Alberto";
        estudante02.idade =17;
        estudante02.sexo ='M';

        estudante01.imprime();
        estudante02.imprime();
    }
}

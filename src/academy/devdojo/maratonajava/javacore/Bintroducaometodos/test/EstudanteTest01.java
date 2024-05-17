package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Renata";
        estudante01.idade = 16;
        estudante01.sexo = 'F';

        estudante02.nome = "Alberto";
        estudante02.idade = 17;
        estudante02.sexo = 'M';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);

        System.out.println("###################");

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
    }
}

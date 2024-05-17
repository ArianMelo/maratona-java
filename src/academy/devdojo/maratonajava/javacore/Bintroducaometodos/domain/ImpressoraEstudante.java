package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante){

        System.out.println("------------------");
        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);

        estudante.nome = "Estudante";
        estudante.idade = 0;
        estudante.sexo = 'X';
    }
}

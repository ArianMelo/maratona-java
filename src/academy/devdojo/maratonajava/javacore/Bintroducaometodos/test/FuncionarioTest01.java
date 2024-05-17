package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario ();
        funcionario.setNome("Roberto");
        funcionario.setIdade(25);
        funcionario.setSalarios(new double[]{1200, 987.35,2000});
        funcionario.imprime();
        System.out.println("Media "+ funcionario.getMedia());
    }
}

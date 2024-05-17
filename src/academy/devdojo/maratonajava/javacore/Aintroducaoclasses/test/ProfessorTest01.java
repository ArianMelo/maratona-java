package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Luis";
        professor.idade = 32;
        professor.sexo = 'M';
        System.out.print("Nome: " + professor.nome + "; Idade: " + professor.idade + "; Sexo: " + professor.sexo + ".");
    }
}

package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;

    //Crie uma classe Funcionário com os seguintes atributos
    // nome, idade e salário(três salários devem ser guardados)
    // Crie dois métodos:
    // 1. Para imprimir os dados;
    // 2. Para tirar a média dos salários e imprimir o resultado.

public class Funcionario {

    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void  imprime() {
        System.out.println("---------------");
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios != null) {
            for (double salario : salarios) {
                System.out.print(salario + "|");
            }
        }
        imprimeMediaSalario();
    }
    public void imprimeMediaSalario(){
            if (salarios == null) {
                return;
            }
            for (double salario : salarios) {
                media += salario;
            }
            media /= salarios.length;
            System.out.println("\nMédia salarial: "+ media);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public double getMedia() {
        return media;
    }
}

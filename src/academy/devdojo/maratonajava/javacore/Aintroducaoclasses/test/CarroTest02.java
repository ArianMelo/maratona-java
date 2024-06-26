package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Carro;

public class CarroTest02 {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();

        carro01.modelo = "Esportivo";
        carro01.nome = "Skyline";
        carro01.ano = 2005;

        carro02.modelo = "Esportivo";
        carro02.nome = "RX7";
        carro02.ano = 2005;

        System.out.println(carro01.modelo);
        System.out.println(carro01.nome);
        System.out.println(carro01.ano);

        System.out.println(carro02.modelo);
        System.out.println(carro02.nome);
        System.out.println(carro02.ano);
    }
}

package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {

    Carro carro1 = new Carro();
    Carro carro2 = new Carro();

    carro1.nome = "Ford";
    carro1.modelo = "SUV";
    carro1.ano = 2005;

    carro2.nome = "Fiat Uno";
    carro2.modelo = "Popular";
    carro2.ano = 1996;

    carro1 = carro2;

    System.out.println("Carro: " + carro1.nome + "\nModelo: " + carro1.modelo + "\nAno: " + carro1.ano);
    System.out.println("\nCarro: " + carro2.nome + "\nModelo: " + carro2.modelo + "\nAno: " + carro2.ano);
    }
}

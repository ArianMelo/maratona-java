package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // +,-,*,/
        int numero01 = 10;
        int numero02 = 20;
        double soma = numero01 / (double) numero02;
        System.out.println(soma);

        // %
        int resto = 21 % 2;
        System.out.println(resto);

        // <, >, <=, >=, ==, !=
        boolean dezMaiorVinte = 10 > 20;
        boolean dezMenorVinte = 10 < 20;
        boolean dezMenorIgualVinte = 10 <= 20;
        boolean dezMaiorIgualVinte = 10 >= 20;
        boolean dezDiferenteVinte = 10 != 20;
        boolean dezIgualVinte = 10 == 20;

        System.out.println(dezMaiorVinte);
        System.out.println(dezMenorVinte);
        System.out.println(dezMenorIgualVinte);
        System.out.println(dezMaiorIgualVinte);
        System.out.println(dezDiferenteVinte);
        System.out.println(dezIgualVinte);

        // &&(and) ||(or) !(not)

        int idade = 29;
        float salario = 3500f;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta: "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta: "+isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;

        boolean isPsCincoComprável = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("Playstation 5 é comprável? "+isPsCincoComprável);

        // = (recebe)... +=, -=, *=, /=
        double bonus = 1000;
        bonus += 1200;
        bonus -= 1200;
        bonus *= 2;
        bonus /= 2;
        System.out.println(bonus);

        //
        int contador = 2;
        contador++;
        contador--;
        ++contador;
        --contador;
        System.out.println(contador);
    }
}

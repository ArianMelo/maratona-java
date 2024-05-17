package academy.devdojo.maratonajava.introducao;

public class Aula5EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter!";
        // Operador ternário:
        // (condicao) ? verdadeiro : falso;
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);
    }
}

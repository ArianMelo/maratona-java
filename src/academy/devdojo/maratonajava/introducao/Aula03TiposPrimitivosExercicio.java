package academy.devdojo.maratonajava.introducao;

/* Pratica

Crie variáveis para os campos descritos abaixo entre < > e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salario>, na data <data>

 */

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {

        String nome = "Bruno";
        String endereco = "Rua das Couves";
        float salario = 1420.51f;
        String dataRecebimentoSalario = "11/05/2024";
        String relatorioDeRecebimento = "Eu "+nome+", morando no endereço "+endereco+", confirmo que recebi o salário de R$"+salario+", na data:"+dataRecebimentoSalario;

        System.out.println(relatorioDeRecebimento);
    }
}

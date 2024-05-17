package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado.
    // Condicao valorParcela >= 1000.
    public static void main(String[] args) {
        // while, do...while, for
        double valorCarro = 30000;
        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;
            if(valorParcela < 1000) {
                break;
            }
            System.out.println(+parcela+" parcelas de R$ "+valorParcela);
            /*
            if(valorParcela >= 1000) {
                System.out.println("Parcela "+parcela+" R$ "+valorParcela);
            } else {
                break;
            }
            */
            // Verificador: System.out.println("Fora do if:"+parcela);
        }
    }
}

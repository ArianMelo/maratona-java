package academy.devdojo.maratonajava.introducao;

public class Aula5EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Utilizando Switch e dados os valores de 1 a 7, imprima se é dia útil ou final de semana.
        // Considerando 1 como domingo.
        byte dia = 3;
        switch (dia){
            case 1:
                System.out.println("Domingo: final de semana.");
                break;
            case 2:
                System.out.println("Segunda: dia útil");
                break;
            case 3:
                System.out.println("Terça: dia útil");
                break;
            case 4:
                System.out.println("Quarta: dia útil");
                break;
            case 5:
                System.out.println("Quinta: dia útil");
                break;
            case 6:
                System.out.println("Sexta: dia útil");
                break;
            case 7:
                System.out.println("Sábado: Fim de Semana");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }
}

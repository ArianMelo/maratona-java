package academy.devdojo.maratonajava.introducao;

public class Aula5EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 16;
        boolean autorizadoComprarBebida = idade >= 18;
        // !
        if (autorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcólica.");
        } else {
            System.out.println("Não autorizado a comprar bebida alcólica.");
        }

        if (!autorizadoComprarBebida) {
            System.out.println("Não autorizado a comprar bebida alcólica.");
        } else {
            System.out.println("Autorizado a comprar bebida alcólica.");
        }

        boolean c = false;
        if (c == true) {
            System.out.println("É igual.");
        } else {
            System.out.println("Não é igual.");
        }
    }
}

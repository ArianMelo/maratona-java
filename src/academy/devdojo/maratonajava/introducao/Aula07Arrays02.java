package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // (byte, short, int, long, float e double) = 0
        // (char) = '\u0000' -> ' '
        // boolean = false
        // String = null

        float[] idades = new float[3];
        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);

        String[] nomes = new String[4];
        nomes[0] = "Roberto";
        nomes[1] = "Luís";
        nomes[2] = "Carlos";
        nomes[3] = "Renata";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
        nomes = new String[5];
    }
}

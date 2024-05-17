package academy.devdojo.maratonajava.introducao;

/**
 * Cast: forçar valor de variavel maior em variável menor
 */

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {

        int age = (int) 100000000000L;
        double paymentDouble = 2000.0D;
        float paymentFloat = 2500.0F;
        byte ageByte = 127;
        short ageShort = 32000;
        boolean trueAlt = true;
        boolean falseAlt = false;
        char caractere = '\u0041';

        String name = "Arian";

        System.out.println("Age is "+age+" years old.");
        System.out.println(trueAlt);
        System.out.println(falseAlt);
        System.out.println("char "+caractere);
        System.out.println(age);
        System.out.println("Hello, my name is: "+name);
    }
}

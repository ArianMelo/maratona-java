package academy.devdojo.maratonajava.javacore.Fmodificadoresestatico.domain;

public class Anime {
    private String nome;
    private static int[] episodios;
    // 0 - Bloco de inicialização é executado quando a JVM carregar a classe
    // 1 - Alocado espaço de memória pro objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado.
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado

    // BLOCO ESTÁTICO > BLOCO PADRÃO NA HIERARQUIA
    // BLOCO ESTÁTICO SÃO EXECUTADO PRIMEIRO. EXECUTADO DE ACORDO COM AS CHAMADAS.
    // BLOCO PADRÃO SÃO EXECUTADOS QUANTAS VEZES O CONSTRUTOR FOR CHAMADO.
    static {
        // Isso é um bloco de inicialização.
        System.out.println("BLOCO ESTÁTICO 1-E\n");
        episodios = new int[10];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    {
        System.out.println("BLOCO NÃO ESTÁTICO 1-NE");
    }

    static {
        System.out.println("BLOCO ESTÁTICO 2-E\n");
    }

    {
        System.out.println("BLOCO NÃO ESTÁTICO 2-NE");
    }

    public Anime(String nome){
        this.nome = nome;
    }

    public Anime() {
        /*
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
        */
        /*Aqui vai imprimir o código do array
        System.out.println(episodios);
         */

        for(int episodio: Anime.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}

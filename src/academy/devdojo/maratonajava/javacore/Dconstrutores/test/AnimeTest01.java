package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu", "Tv" ,12, "Ação", "Production IG");
//        anime.init("Akudama Drive","Tv", 12, "Ação");
//        Anime anime2 = new Anime("One Punch", "TV",12, "Ação");
        anime.imprime();
//        anime2.imprime();
    }
}

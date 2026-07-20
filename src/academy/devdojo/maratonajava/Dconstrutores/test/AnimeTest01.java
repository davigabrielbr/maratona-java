package academy.devdojo.maratonajava.Dconstrutores.test;

import academy.devdojo.maratonajava.Dconstrutores.model.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu", "TV", 12, "Ação", "Production IG");
        anime.imprime();
    }
}
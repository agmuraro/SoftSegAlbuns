
public class Main {
    public static void main(String[] args) {

        Musica[] musicasDoAlbum = {
                new Musica("legal","arthur"),
                new Musica("super massa","arthur"),
                new Musica("legal demais","arthur"),
                new Musica("caramba, que legal","arthur"),
                new Musica("que legal","arthur"),
        };


        Albuns meuAlbum = new Albuns("Album Maneiro", 2024, musicasDoAlbum);

        meuAlbum.InfoAlbum();
    }
}

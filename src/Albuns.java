import java.util.ArrayList;

public class Albuns {
    private String nome;
    private int anoLancamento;
    private Musica[] musicas;

    // Construtor
    public Albuns(String nome, int anoLancamento, Musica[] musicas) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.musicas = musicas;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public Musica[] getMusicas() {
        return musicas;
    }

    public void setMusicas(Musica[] musicas) {
        this.musicas = musicas;
    }
}

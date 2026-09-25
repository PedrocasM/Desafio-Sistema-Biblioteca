import java.util.ArrayList;

public class Usuario {
    private String nome;
    private ArrayList<Livro> livrosAlugados;

    public Usuario(String nome, ArrayList<Livro> livros) {
        this.nome = nome;
        this.livrosAlugados = livros;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public ArrayList<Livro> getLivrosAlugados(){
        return livrosAlugados;
    }
    public void setLivrosAlugados(String nome){
        this.livrosAlugados = livrosAlugados;
    }
    public void AlugarLivros(Livro livros) {
        if (livros.getDisponibilidade() == true);

    }
    }


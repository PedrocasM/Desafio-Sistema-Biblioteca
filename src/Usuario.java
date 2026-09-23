import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
    private String nome;
    private Integer idade;
    private Integer id;
    private ArrayList<Livro> livros;
    Scanner entradaTexto = new Scanner(System.in);
    Scanner entradaNumero = new Scanner(System.in);

    public Usuario(String nome, Integer idade, Integer id, ArrayList<Livro> livros) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
        this.livros = livros;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public Integer getIdade(){
        return idade;
    }
    public void setIdade(Integer idade){
        this.idade = idade;
    }
     public void setId(Integer id){
        this.idade = id;
    }
      public Integer getId(){
        return id;
    }
    public ArrayList<Livro> livros(){
        return livros;
    }
    public void setLivros(String nome){
        this.livros = livros;
    }
    public void AlugarLivros(Livro livros) {
        if (livros.getDisponibilidade() == true);


    }
}

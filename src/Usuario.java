import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
    private String nome;
    private Integer idade;
    private ArrayList<Livro> livros;
    Scanner entradaTexto = new Scanner(System.in);
    Scanner entradaNumero = new Scanner(System.in);

    public Usuario(String nome, Integer idade, ArrayList<Livro> livros) {
        this.nome = nome;
        this.idade = idade;
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
    public ArrayList<Livro> livros(){
        return livros;
    }
    public void setLivros(String nome){
        this.livros = livros;
    }
    public void AlugarLivros(Livro livros) {
        if (livros.getDisponibilidade() == true);


    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", livros=" + livros +
                '}';
    }
}


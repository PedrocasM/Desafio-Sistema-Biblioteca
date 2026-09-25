import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private ArrayList<Livro> livros = new ArrayList<>();
    Scanner entrada = new Scanner(System.in);

    public void listarUsuario(){
        System.out.println("Usuarios:");
        for (Usuario usuario : usuarios) {
            System.out.println(usuario.getNome());
        }
    }
    public void listarLivros(){
        System.out.println("Livros:");
        for (Livro livro : livros){
            System.out.println(livro.getTitulo());
        }
    }

    public void cadastrarUsuario(){
        System.out.println("Digite seu nome:");
        String nome = entrada.nextLine();
        for (Usuario usuario : usuarios){
            if (usuario.getNome().equalsIgnoreCase(nome)){
                System.out.println("Esse usuario já foi cadastrado!");
                return;
            }
        }
        Usuario usuario = new Usuario(nome,null);
        usuarios.add(usuario);
        System.out.println("Usuario cadastrado com sucesso.");
    }
    public void cadastrarLivro(){
        System.out.println("Digite o titulo do livro:");
        String titulo  = entrada.nextLine();
        for (Livro livro : livros){
            if (livro.getTitulo().equalsIgnoreCase(titulo)){
                System.out.println("Esse livro já foi cadastrado!");
                return;
            }
        }
        Livro livro = new Livro(titulo,true);
        livros.add(livro);
        System.out.println("Livro cadastrado com sucesso.");
    }
    public void realizarAluguel(){
        System.out.println("Para qual usuario você deseja alugar um livro?");
        String nome = entrada.nextLine();
        for (Usuario usuario : usuarios){
            if (usuario.getNome().equalsIgnoreCase(nome));{
                System.out.println("Qual livro você deseja alugar?");
                String titulo = entrada.nextLine();
                for (Livro livro : livros){
                    if (livro.getTitulo().equalsIgnoreCase(titulo)){
                        System.out.println("Livro alugado com sucesso!");
                        livro.disponibilidade = false;
                        usuario.getLivrosAlugados().add(livro);
                    }else {
                        System.out.println("esse livro não existe ou já foi alugado!");
                        return;
                    }
                }
            }

        }
    }
    public void verLivrosDisponiveis(){
        System.out.println("Livros disponiveis");
        for (Livro livro : livros){
            if (livro.disponibilidade = true){
                System.out.println(livro.getTitulo());
            }else {
                System.out.println("Nenhum livro disponivel!");
                return;
            }

        }

    }
}

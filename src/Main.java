import java.util.ArrayList;
import java.util.Scanner;

public class Main {
public static void main(String[]args) {
        ArrayList<Livro> livros = new ArrayList<>();
        ArrayList<Usuario> usuarios = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        Integer resposta;
        

    do {
        System.out.println("Bem vindo a Biblioteca Games\n");
        System.out.println("[1] Para cadastrar cliente");
        System.out.println("[2] Para cadastrar livro");
        System.out.println("[3] Listar usuarios");
        System.out.println("[4] Listar livros");
        System.out.println("[0] Para sair");
        resposta = entrada.nextInt();
        Integer id = 0;

        switch (resposta) {
            case 1:
                entrada.nextLine();
                System.out.println("Digite seu nome:");
                String nome = entrada.nextLine();
                System.out.println("Digite sua idade:");
                Integer idade = entrada.nextInt();
                id ++;

                Usuario idUsuario = new Usuario(nome, idade, id, null);
                usuarios.add(idUsuario);
                break;

                case 2:
                    entrada.nextLine();
                    System.out.println("Digite o titulo do livro:");
                    String titulo = entrada.nextLine();
                    Boolean disponibilidade = true;

                    Livro livro1 = new Livro(titulo, disponibilidade);
                    livros.add(livro1);
                    break;

                    case 3:
                        for(Livro livro: livros){
                            System.out.println(livro.getTitulo());
                            break;
                        }
                    

        }


    } while (resposta != 0);

}

}

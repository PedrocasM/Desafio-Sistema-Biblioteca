import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Livro> livros = new ArrayList<>();
        ArrayList<Usuario> usuarios = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        Integer resposta;


        do {
            System.out.println("Bem vindo a Biblioteca Games\n");
            System.out.println("[1] Para cadastrar cliente");
            System.out.println("[2] Para cadastrar livro");
            System.out.println("[3] Listar livros");
            System.out.println("[4] Listar usuarios");
            System.out.println("[0] Para sair");
            resposta = entrada.nextInt();

            switch (resposta) {
                case 1:
                    entrada.nextLine();
                    System.out.println("Digite seu nome:");
                    String nome = entrada.nextLine();
                    System.out.println("Digite sua idade:");
                    Integer idade = entrada.nextInt();
                    if (livros.size() >= 1){
                        System.out.println("Digite o nome do livro que quer alugar:");
                        String titulo = entrada.nextLine();
                        entrada.nextLine();
                    }


                    Usuario usuario1 = new Usuario(nome, idade, null);
                    usuarios.add(usuario1);

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
                    for (int j = 0; j < livros.size(); j++) {
                        System.out.println("Livros:");
                        System.out.println(livros.get(j));
                        break;
                    }
                        case 4:
                            for (int i = 0; i < usuarios.size(); i++) {
                                System.out.println("Usuarios:");
                                System.out.println(usuarios.get(i));
                                break;
                            }



            }
        } while (resposta != 0) ;
    }
}
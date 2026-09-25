
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        Integer resposta;

        /*
        * O sistema deverá permitir:
Realizar devolução;
Exibir quais livros estão alugados por determinado usuário.
*/


        do {
            System.out.println("Bem vindo a Biblioteca Games\n");
            System.out.println("[1] Para cadastrar usuario");
            System.out.println("[2] Para cadastrar livros");
            System.out.println("[3] Listar livros");
            System.out.println("[4] Listar usuarios");
            System.out.println("[5] Realizar aluguel");
            System.out.println("[6] Realizar devolução");
            System.out.println("[7] Disponibilidade dos livros");
            System.out.println("[8] Livros por determinado usuario");
            System.out.println("[0] Para sair");
            resposta = entrada.nextInt();

            switch (resposta) {
                case 1:
                    biblioteca.cadastrarUsuario();
                    break;

                case 2:
                    biblioteca.cadastrarLivro();
                    break;

                case 3:
                    biblioteca.listarLivros();
                    break;

                case 4:
                biblioteca.listarUsuario();
                    break;
                case 5:
                    biblioteca.realizarAluguel();
                    break;
                case 6:
                    break;
                case 7:
                    biblioteca.verLivrosDisponiveis();
                    break;
                case 8:
                    break;

            }
        } while (resposta != 0) ;
    }
}
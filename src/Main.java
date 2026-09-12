import javax.swing.*;
 void main() {
    /*Quais são os objetos envolvidos?
Como os objetos Usuário e Livro se relacionam?
Como o sistema saberá se um livro está disponível?
    */
        Scanner entradatexto = new Scanner(System.in);
        Integer resposta;

    do {
        System.out.println("Bem vindo a Biblioteca Games\n");
        System.out.println("[1] Para cadastrar cliente");
        System.out.println("[2] Para cadastrar livro");
        System.out.println("[3] Listar usuarios");
        System.out.println("[4] Listar livros");
        System.out.println("[0] Para sair");
        resposta = entradatexto.nextInt();
        switch (resposta) {
            case 1:
                System.out.println("Digite seu nome:");
                String nome = entradatexto.nextLine();
                System.out.println();

                Usuario usuario = new Usuario(null, null, null);
        }


    } while (resposta != 0);

}





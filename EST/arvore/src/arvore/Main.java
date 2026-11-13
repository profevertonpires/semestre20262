package arvore;

import java.util.Scanner;

/** Interface de console para testar as operações da árvore. */
public class Main {
    public static void main(String[] args) {
        ArvoreBinariaBusca arvore = new ArvoreBinariaBusca();
        try (Scanner scanner = new Scanner(System.in)) {
            int opcao;
            do {
                System.out.println("\n===== ÁRVORE BINÁRIA DE BUSCA =====");
                System.out.println("1 - Adicionar");
                System.out.println("2 - Buscar (retornar nó)");
                System.out.println("3 - Pesquisar (existe?)");
                System.out.println("4 - Remover");
                System.out.println("5 - Percorrer em ordem (in-order)");
                System.out.println("6 - Percorrer em pós-ordem (post-order)");
                System.out.println("0 - Sair");
                opcao = lerInteiro(scanner, "Escolha uma opção: ");
                switch (opcao) {
                    case 1: {
                        int valor = lerInteiro(scanner, "Valor para adicionar: ");
                        System.out.println(arvore.adicionar(valor) ? "Adicionado com sucesso." : "Valor já existe.");
                        break;
                    }
                    case 2: {
                        int valor = lerInteiro(scanner, "Valor para buscar: ");
                        No no = arvore.buscar(valor);
                        System.out.println(no == null ? "Nó não encontrado." : "Nó encontrado: " + no.getValor());
                        break;
                    }
                    case 3: {
                        int valor = lerInteiro(scanner, "Valor para pesquisar: ");
                        System.out.println(arvore.pesquisar(valor) ? "Valor existe na árvore." : "Valor não existe.");
                        break;
                    }
                    case 4: {
                        int valor = lerInteiro(scanner, "Valor para remover: ");
                        System.out.println(arvore.remover(valor) ? "Removido com sucesso." : "Valor não encontrado.");
                        break;
                    }
                    case 5: System.out.println("Em ordem: " + arvore.emOrdem()); break;
                    case 6: System.out.println("Pós-ordem: " + arvore.posOrdem()); break;
                    case 0: System.out.println("Encerrando..."); break;
                    default: System.out.println("Opção inválida.");
                }
            } while (opcao != 0);
        }
    }

    private static int lerInteiro(Scanner scanner, String mensagem) {
        while (true) {
            System.out.print(mensagem);
            String texto = scanner.nextLine().trim();
            try { return Integer.parseInt(texto); }
            catch (NumberFormatException e) { System.out.println("Digite um número inteiro válido."); }
        }
    }
}

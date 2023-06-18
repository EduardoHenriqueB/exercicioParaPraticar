package contador;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        int valor, opcao;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um valor inteiro: ");
        valor = leia.nextInt();
        Contador contador = new Contador(valor);

        do {
            System.out.println("Digite o que deseja fazer: ");
            System.out.println("[1] - Zerar | [2] - Incrementar | [3] - Retornar Valor | [4] - Finalizar Programa");
            opcao = leia.nextInt();

            switch(opcao) {
                case 1:
                    contador.zerar();
                    System.out.println("Seu valor foi zerado!");
                    break;
                case 2:
                    contador.incrementar();
                    System.out.println("Foi incrementado +1 no seu valor!");
                    break;
                case 3:
                    contador.retornar();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 4);

        System.out.println("Programa foi finalizado!");
    }
}

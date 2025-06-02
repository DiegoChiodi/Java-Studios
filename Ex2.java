import java.util.Random;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao = -1;
        int vetor[] = new int[10];
        while (opcao != 0) {
            System.out.println("\n MENU DE OPÇÕES");
            System.out.println("1ª opção: Gera valores randômicos para o vetor");
            System.out.println("2ª opção: Verifica quantidade de números maiores que 10 no vetor");
            System.out.println("Digite 0 para sair");
            System.out.print("\nDigite a opção desejada: ");
            opcao = teclado.nextInt();
            if (opcao == 1) {
                vetor = geraVetorRandomico(vetor, 21);
                System.out.println("VETOR RANDOMICO GERADO");
            } else if (opcao == 2) {
                int qtde = qtdeMaiores10(vetor);
                System.out.println("No vetor existem " + qtde + " números maiores que 10");
            } else {
                System.out.println("Opção escolhida é inválida");
            }
        }
        System.out.println("Fim do algoritmo");
    }

    public static int[] geraVetorRandomico(int[] vetor, int max) {
        Random ale = new Random();
        System.out.print("Valores randômicos gerados: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = ale.nextInt(max);
            if (i != vetor.length - 1) {
                System.out.print(vetor[i] + ", ");
            } else {
                System.out.print(vetor[i] + "\n");
            }
        }
        System.out.println();
        return vetor;
    }

    public static int qtdeMaiores10(int[] vetor) {
        int qtd = 0;

        for (int valor : vetor) {
            if (valor > 10) {
                qtd++;
            }
        }
        return qtd;

    }
}
import java.util.Scanner;

public class Ex3 {
    public static int somar(int vetor[]) {
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma = soma + vetor[i];
        }
        return soma;
    }

    public static int quantosPares(int vetor[]) {
        int total = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                total++;
            }
        }
        return total;
    }

    public static void exibirVetor(int vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Valor: " + vetor[i]);
        }
    }

    public static void preencherVetor(int vetor[]) {
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Informe um número: ");
            vetor[i] = teclado.nextInt();
        }
    }

    public static void main(String[] args) {
        int vetor[] = new int[10];
        // chamar o procedimento para preencher o vetor
        preencherVetor(vetor);

        exibirVetor(vetor);

        int soma = somar(vetor);
        System.out.println("A soma é: " + soma);
        // chamar a função para obter o total de pares do vetor

        int pares = quantosPares(vetor);
        System.out.println("O total de pares é: " + pares);
    }
}
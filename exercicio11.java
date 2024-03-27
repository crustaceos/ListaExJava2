import java.util.Scanner;

public class exercicio11 {
    public static void executar(){

        Scanner leitor = new Scanner(System.in);

        int[] vetorA = new int [5];
        int[] vetorB = new int [5];
        int[] vetorC = new int [5];

        for(int i = 0; i < 5; i++){
            System.out.printf("Digite o valor da posição %d do vetorA: ", i + 1);
            vetorA[i] = leitor.nextInt();
        }

        for(int i = 0; i < 5; i++){
            System.out.printf("Digite o valor da posição %d do vetorB: ", i + 1);
            vetorB[i] = leitor.nextInt();
        }

        for(int i = 0; i < 5; i++){
            vetorC[i] = vetorA[i] * vetorB[i];
        }

        int soma = 0;

        for(int i = 0; i < 5; i++){
            soma += vetorC[i];
        }

        System.out.printf("O valor total do produto escalar é de %d", soma);

    }

}

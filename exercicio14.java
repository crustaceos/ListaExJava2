import java.util.Scanner;

public class exercicio14 {
    public static void executar(){

        Scanner leitor = new Scanner(System.in);

        int[] vetor = new int [5];
        int maior = 0;

        for(int i = 0; i < 5; i++){
            System.out.printf("Digite o valor da posição %d do vetor: ", i + 1);
            vetor[i] = leitor.nextInt();

            if(vetor[i] > maior){
                maior = vetor[i];
            }
        }

        for(int i = 0; i < 5; i++){
            vetor[4] = maior;
        }

        for(int i = 0; i < 5; i ++){
            System.out.printf("%d\n", vetor[i]);
        }

        
        
    }
}

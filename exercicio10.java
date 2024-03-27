import java.util.Scanner;

public class exercicio10 {
    public static void executar(){

        Scanner leitor = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        for(int i = 0; i < 5; i++){
            System.out.printf("Digite o valor da posição %d do vetorA: ", i + 1);
            vetorA[i] = leitor.nextInt();
        }

        for(int i = 0; i < 5; i++){
            vetorB[i] = vetorA[i];
        }

        for(int i = 4; i >= 0; i--){
            System.out.printf("%d\n", vetorB[i]);
        }
        

    }

}

        


        
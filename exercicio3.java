import java.util.Scanner;

public class exercicio3 {
    public static void executar(){

        Scanner leitor = new Scanner(System.in);

        System.out.printf("Digite o numero de valores a serem digitados: ");
        int q = leitor.nextInt();

        int[] vetor1 = new int [q];
        int[] vetor2 = new int[q];

        for(int i = 0; i < q; i++){
            System.out.printf("Digite o numero da posição %d: ", i + 1);
            vetor1[i] = leitor.nextInt();
        }

        for(int i = 0; i < q; i++){
            vetor2[i] = vetor1[i] * 2;
        }

        for(int i = 0; i < q; i++){
            System.out.printf("Os dobro dos valores digitados é: %d\n", vetor2[i]);
        }

       
        

    }

}

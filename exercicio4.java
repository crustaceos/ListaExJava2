import java.util.Scanner;

public class exercicio4 {
    public static void executar(){

        Scanner leitor = new Scanner(System.in);

        int[] vetor = new int[5];

        for(int i = 0; i < 5; i++){
            System.out.printf("Digite o numero da posiçao %d: ", i + 1);
            vetor[i] = leitor.nextInt();
        }

        System.out.printf("Digite o valor da variavel N: ");
        int n = leitor.nextInt();

        for(int i = 0; i < 5; i++){
            if(vetor[i] < n){
                System.out.printf("O indice menor que N está em: %d\n", i);
            }
        }

        
    }

}

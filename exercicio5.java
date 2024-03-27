import java.util.Scanner;

public class exercicio5 {
    public static void executar(){

        Scanner leitor = new Scanner(System.in);

        int [] vetor = new int [5];

        for(int i = 0; i < 5; i++){
            System.out.printf("Digite o valor da posição %d: ", i + 1);
            vetor[i] = leitor.nextInt();
        }

        System.out.printf("Digite o valor da variavel N: ");
        int n = leitor.nextInt();

        int v = 0;

        for(int i = 0; i < 5; i++){
            if(vetor[i] == n){
                v++;
            }
        }

        System.out.printf("A quantidade de vezes que o numero %d aparece na tela é %d", n, v);

        
    }

}

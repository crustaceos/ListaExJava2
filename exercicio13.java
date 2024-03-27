import java.util.Scanner;

public class exercicio13 {
    public static void executar(){

        Scanner leitor = new Scanner(System.in);

        int[] vetorFibo = new int[100];

        int a = 0;
        int b = 1;

        for(int i = 2; i < 100; i ++){
            int c = a + b;
            vetorFibo[i] = c;
            
            a = b;
            b = c;
        }

        System.out.printf("Digite quantos numeros deseja saber da sequência fibonacci: ");
        int q = leitor.nextInt();

        int[] vetorUser = new int[q];

        for(int i = 0; i < q; i++){
            vetorUser[i] = vetorFibo[i];
        }

        for(int i = 0; i < q; i++){
            System.out.printf("%d\n", vetorUser[i]);
        }

        
        
    }

    

}
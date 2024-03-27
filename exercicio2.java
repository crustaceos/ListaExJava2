import java.util.Scanner;

public class exercicio2 {
    public static void executar(){

        Scanner leitor = new Scanner(System.in);
        
        System.out.printf("Digite a quantidade de numeros a serem digitados: ");
        int v = leitor.nextInt();

        int[] vetor = new int [v];

        for(int i = 0; i < v; i++){
            System.out.printf("Digite o numero da posição %d: ", i + 1);
            vetor[i] = leitor.nextInt();
        }
        
        for(int i = 0; i < v; i++){
            if(vetor[i] > 0){
                System.out.printf("O numero %d é positivo\n", vetor[i]);
            }
            else if(vetor[i] < 0){
                System.out.printf("O numero %d é negativo\n", vetor[i]);
            }
            else{
                System.out.printf("O numero %d é igual a zero\n", vetor[i]);
            }
        }

        

    }

}

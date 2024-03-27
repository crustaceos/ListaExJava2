import java.util.Scanner;

public class exercicio12 {
    public static void executar(){

        Scanner leitor = new Scanner(System.in);

        int[] vetor1 = new int[12];

        for(int i = 0; i < 12; i ++){
            System.out.printf("Digite o valor da posição %d do vetor: ", i + 1);
            vetor1[i] = leitor.nextInt();
        }

        int mult = 1;

        for(int i = 0; i < 12; i++){
            if(vetor1[i] > 0 ){
                if(vetor1[i] % 2 == 0){
                 mult = mult * vetor1[i];
            }
        }
      }

        
      System.out.printf("O produto dos numeros pares é %d" , mult);
        
    }

    

}
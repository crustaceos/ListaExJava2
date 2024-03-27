import java.util.Scanner;

public class exercicio7 {
    public static void executar(){

        Scanner leitor = new Scanner(System.in);

        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];

        for(int i = 0; i < 5; i++){
            System.out.printf("Digite os valores da posição %d do primeiro vetor: ", i + 1);
            vetor1[i] = leitor.nextInt();
        }

        for(int i = 0; i < 5; i++){
            System.out.printf("Digite os valores da posição %d do segundo vetor: ", i + 1);
            vetor2[i] = leitor.nextInt();
        }

        int contador = 0;
       
        for(int i = 0; i < 5; i++){
            if(vetor1[i] == vetor2[i]){
                contador++;
            }
        }

        if(contador == 5){
            System.out.printf("O vetores são iguais.");
        }
        else{
            System.out.printf("Os vetores não são iguais.");
        }
        

        
    }

}

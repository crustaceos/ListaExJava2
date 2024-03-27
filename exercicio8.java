import java.util.Scanner;

public class exercicio8 {
    public static void executar(){

        Scanner leitor = new Scanner(System.in);

        char[] vetorA = new char[5];
        char[] vetorB = new char[5];
        char[] vetorC = new char[10];

        for(int i = 0; i < 5; i++){
            System.out.printf("Digite o valor da posição %d: ", i + 1);
            vetorA[i] = leitor.nextLine().charAt(0);
        }

        for(int i = 0; i < 5; i++){
            System.out.printf("Digite o valor da posição %d: ", i + 1);
            vetorB[i] = leitor.nextLine().charAt(0);
        }

        for(int i = 0; i < 5; i++){
            vetorC[i] = vetorA[i];
        }

        for(int i = 0; i < 5; i++){
            vetorC[i + 5] = vetorB[i];
        }

        for(int i = 0; i < 10; i++){
            System.out.printf("%c", vetorC[i]); 
        }

        

    }

}

        


        
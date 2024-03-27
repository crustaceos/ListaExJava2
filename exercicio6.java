import java.util.Scanner;

public class exercicio6 {
    public static void executar(){

        Scanner leitor = new Scanner(System.in);

        float[] vetorN = new float[5];

        float[] vetorP = new float[5];

        for(int i = 0; i < 5; i++){
            System.out.printf("Digite a nota %d do aluno: ", i + 1);
            vetorN[i] = leitor.nextFloat();
        }

        for(int i = 0; i < 5; i++){
            System.out.printf("Digite o peso da nota %d do aluno: ", i + 1);
            vetorP[i] = leitor.nextFloat();
        }

        for(int i = 0; i < 5; i++){
            vetorN[i] = vetorP[i] * vetorN[i];
        }

        float somaN = 0;

        float somaP = 0;

        for(int i = 0; i < 5; i++){
            somaN += vetorN[i];
            somaP += vetorP[i];
        }

        System.out.printf("A media do aluno é de: %.2f", somaN / somaP);
        
    }

}
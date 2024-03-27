import java.util.Scanner;

public class exercicio1 {

     public static void executar(){

          Scanner leitor = new Scanner(System.in);

          int[] valor = new int[5];

          int media = 0;

          for(int i = 0; i < 5; i++){
               System.out.printf("Digite o valor da posição %d: ", i + 1);
               valor[i] = leitor.nextInt();

               media += valor[i];
          }
               media = media / 5;

          System.out.printf("A media dos numeros é: %d\n", media);

          for(int i = 0; i < 5; i++){
               if(valor[i] > media){
                    System.out.printf("O valor %d é maior que a média\n", valor[i]);
               }
               else if(valor[i] < media){
                    System.out.printf("O valor %d é menor do que a média\n", valor[i]);
               }
               else{
                    System.out.printf("O valor %d é igual a média\n", valor[i]);
               }
          }
          
          
          
     }
}

import java.util.Scanner;

public class Ex05 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);{
            int n = 10;
            int[] vetor = new int[5];

            for(int i = 0; i < 5; i++){
                System.out.println("Digite o número " + (i + 1) + ": ");
                vetor[i] = leitor.nextInt();
            }
            for(int i = 0; i < 5; i++){
                if(vetor[i] == n){
                    System.out.println("Número " + (i + 1) + " igual a n: " + vetor[i]);
                }
            }
            leitor.close();
        }
    }
}

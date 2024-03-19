import java.util.Scanner;

public class Ex08 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);{
            int[] vetorA = new int[5];
            int[] vetorB = new int[5];
            int[] vetorC = new int[10];

            System.out.println("Digite os elementos do primeiro vetor");
            for(int i = 0; i < 5; i++){
                System.out.println("Número " + (i + 1) + ": ");
                vetorA[i] = leitor.nextInt();
            }

            System.out.println("Digite os elementnos do segundo vetor");
            for(int i = 0; i < 5; i++){
                System.out.println("Número " + (i + 1) + ": ");
                vetorB[i] = leitor.nextInt();
            }

            for(int i = 0; i < 5; i++){
                vetorC[i] = vetorA[i];
                vetorC[i + 5] = vetorB[i];
            }

            System.out.println("Elementos concatenados: ");
            for(int i = 0; i < 10; i++){
                System.out.println(vetorC[i] + " ");    
            }
            leitor.close();
        }
    }
}

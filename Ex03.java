import java.util.Scanner;

public class Ex03 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);{
            int[] vetor1 = new int[5];
            int[] vetor2 = new int[5];
            
            for(int i = 0; i < 5; i++){
                System.out.println("Digite o número " + (i + 1) + ": ");
                vetor1[i] = leitor.nextInt();
            }
            for(int i = 0; i < 5; i++){
                vetor2[i] = vetor1[i] * 2;
                System.out.println("Dobro do número " + (i + 1) + ": " + vetor2[i]);
            }

            leitor.close();
        }
    }
}

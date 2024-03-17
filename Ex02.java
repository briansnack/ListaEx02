import java.util.Scanner;

public class Ex02 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);{
        int[] vetor = new int[5];
            for(int i = 0; i < 5; i++){
                System.out.println("Digite o número " + (i + 1) + ": ");
                vetor[i]= leitor.nextInt();
            }   
            for(int i = 0; i < 5; i++){
                System.out.println("Número " + (i + 1) + ": " + vetor[i]);
            }
            for(int i = 0; i < 5; i++){
                if(vetor[i] > 0){
                    System.out.println("Número " + (i + 1) + " é positivo");
                } else if(vetor [i] < 0){
                    System.out.println("Número " + (i +1) + " é negativo");
                } else {
                    System.out.println("Número " + (i + 1) + " é igual a 0");
                }
            }
            leitor.close();
        }
    }
}

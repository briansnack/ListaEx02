import java.util.Scanner;

public class Ex09 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);{
            int[] vetor1 = new int[5];
            int[] vetor2 = new int[5];
            int[] vetor3  = new int[5];

            for(int i = 0; i < 5; i++){
                System.out.println("Número " + (i + 1) + " do primeiro vetor: ");
                vetor1[i] = leitor.nextInt();
            }

            for(int i = 0; i < 5; i++){
                System.out.println("Número " + (i + 1) + " do segundo vetor: ");
                vetor2[i] = leitor.nextInt();
            }
            for(int i = 0; i < 5; i++){
                if(i % 2 == 0){
                    vetor3[i] = vetor1[i];
                } else {
                    vetor3[i] = vetor2[i];
                }
            }
            System.out.println("Vetor C");
            for(int i = 0; i < 5; i++){
                System.out.println(vetor3[i]); 
            }
            

            leitor.close();
        }
    }
}

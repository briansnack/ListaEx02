import java.util.Scanner;

public class Ex07 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);{
            int[] vetor1 = new int[5];
            int[] vetor2 = new int[5];

            for(int i = 0; i < 5; i++){
                System.out.println("Digite o primeiro vetor, número " + (i + 1 + ": "));
                vetor1[i] = leitor.nextInt();
            }
            for(int i = 0; i < 5; i++){
                System.out.println("Digite o segundo vetor, número " + (i + 1 + ": "));
                vetor2[i] = leitor.nextInt();
            }

            boolean saoIguais = true;

            for (int i = 0; i < 5; i++){
                if(vetor1[i] != vetor2[i]){
                    saoIguais = false;
                    break;
                }
            }

            if(saoIguais){
                System.out.println("Vetores são iguais");
            } else {
                System.out.println("Vetores são diferentes");
            }


            leitor.close();
        }
    }
}

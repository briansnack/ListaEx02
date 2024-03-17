import java.util.Scanner;

class Ex01 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);{
        int[] vetor = new int[5];

        System.out.println("Digite 5 números");
        for(int i = 0; i < 5; i++){
            System.out.println("Número " + (i + 1) + ":");
            vetor[i] = leitor.nextInt();
        }
        double soma = 0;
        for(int i = 0; i < 5; i++){
            soma += vetor[i];
        }
        double media = soma / 5;

        System.out.println("\nMédia: " + media);

        System.out.println("Valores menores que a média: ");
        for(int i = 0; i < 5; i++){
            if (vetor[i] < media){
                System.out.println(vetor[i]);
            }
        }

        System.out.println("Valores iguais a média: ");
        for(int i = 0; i < 5; i++){
            if (vetor[i] == media){
                System.out.println(vetor[i]);
            }
        }

        System.out.println("Valores maiores que a média: ");
        for(int i = 0; i < 5; i++){
            if (vetor[i] > media){
                System.out.println(vetor[i]);
            }
        }
            leitor.close();
        }
    }
}

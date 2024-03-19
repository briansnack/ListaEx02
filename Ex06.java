import java.util.Scanner;

public class Ex06 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);{
            double[] nota = new double[5];
            int[] peso = new int[5];

            for(int i = 0; i < 5; i++){
                System.out.println("Digite a nota " + (i + 1) + ": ");
                nota[i] = leitor.nextDouble();
                System.out.println("Digite o peso " + (i + 1) + ": ");
                peso[i] = leitor.nextInt();
            }
            
            double mediaP = ((nota[0] * peso[0]) + (nota[1] * peso[1]) + (nota[2] * peso[2]) + (nota[3] * peso[3]) + (nota[4] * peso[4])) / (peso[0] + peso[1] + peso[2] + peso[3] + peso[4]); 

            System.out.println("Média ponderada: " + mediaP);
            leitor.close();
        }
    }
}

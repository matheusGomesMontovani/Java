import java.util.Scanner;
import java.util.Arrays;

public class ExerciciosArrays2 {
    public static void main(String[] args) {

        int[] vetorEntrada = new int[10];
        int[] vetorPar = new int[10];
        int[] vetorImpar = new int[10];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < vetorEntrada.length; i++) {
            System.out.print("Digite 10 números: ");
            vetorEntrada[i] = scanner.nextInt();
        }

        for(int i = 0; i < vetorPar.length; i++) {
            System.out.print("Digite 10 números pares: ");
            vetorPar[i] = scanner.nextInt();
            if (vetorPar[i] % 2 == 0 ) {

            }
        }

        for(int i = 0; i < vetorImpar.length; i++) {
            System.out.print("Digite 10 ímpares: ");
            vetorImpar[i] = scanner.nextInt();
            if (i % 2 != 0 ) {
                
            }
        }

        scanner.close();

        System.out.println(Arrays.toString(vetorEntrada));
        System.out.println(Arrays.toString(vetorPar));
        System.out.println(Arrays.toString(vetorImpar));
    }
}

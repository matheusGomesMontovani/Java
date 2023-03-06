import java.util.Scanner;
import java.util.Arrays;

public class ExerciciosArrays1 {
    public static void main (String[] args) {

        int[] array_1 = new int[10];
        int[] array_2 = new int[10];
        int[] soma = new int[10];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < array_1.length; i++) {
            System.out.print("Digite 10 números: ");
            array_1[i] = scanner.nextInt();
        }
        System.out.println("--------------------------------");

        for(int i = 0; i < array_2.length; i++) {
            System.out.print("Digite 10 números: ");
            array_2[i] = scanner.nextInt();
        }
        System.out.println("--------------------------------");

        for (int i=0; i<array_1.length; i++) {
			soma[i] = array_1[i] + array_2[i];
		}
        System.out.println("--------------------------------");

        System.out.println(Arrays.toString(array_1));
        System.out.println(Arrays.toString(array_2));
        System.out.printf(Arrays.toString(soma));   

        scanner.close();
    }
}

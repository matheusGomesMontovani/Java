import java.util.Scanner;
import java.util.Arrays;
public class EstruturaDados {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] alunos = new String[5];
		double[] medias = new double[5];
		int[] faltas = new int[5];
		
		for (int i = 0; i<alunos.length; i++) {
			System.out.println("Digite o nome do aluno: ");
			alunos[1] = scanner.nextLine();
		}
		for (int i = 0; i<medias.length; i++){
			System.out.print("Digite a média do aluno: ");
			medias[1] = scanner.nextDouble();
		}
		for (int i = 0; i<faltas.length; i++){
			System.out.println("Digite digite quantas faltas teve o aluno: ");
			faltas[1] = scanner.nextInt();
		}
		
		System.out.println(alunos);
		System.out.println(medias);
		System.out.println(faltas);
	}

}

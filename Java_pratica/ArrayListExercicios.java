import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListExercicios {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer>inteiro = new ArrayList<Integer>();
        ArrayList<Integer>meia = new ArrayList<Integer>();

        /*Vamos fazer um sistema de ingressos de Cinema. Pergunte a idade até que a pessoa digite 0 para sair. 
        Se a pessoa tiver menos que 10 anos ou mais que 60 informe "Meia Entrada" se não, informe "Inteira". 
        Ao terminar imprima: "Total de x ingressos vendidos, sendo y meia entrada"*/
        
        while (true) {
            try {
                System.out.print("Digite a sua idade: ");
                int idade = scanner.nextInt();

                if (idade == 0) {
                    break;
                }
                
                if (idade < 0) {
                    System.out.println("ERRO!!!");
                    inteiro.remove(idade);
                }

                if ((idade >= 0 && idade < 10) || (idade > 60)){
                    meia.add(idade);
                }

                else {
                    inteiro.add(idade);
                }
            }
            catch(Exception e) {
                System.out.println("ERRO!!!");
                scanner.nextLine();
            }
            finally {

            }
        }

        
        System.out.println(inteiro);
        System.out.println(meia);
        System.out.printf(
            "Total de %d ingressos vendidos, sendo %d meia entrada e %d inteira.", 
            (inteiro.size() + meia.size()), meia.size(), inteiro.size()
            );
        scanner.close();
    }
}
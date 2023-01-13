import java.util.Scanner;
// import java.util.InputMismatchException;

public class EstruturaCondicionalifelse {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        // Faça um programa para ler o salário bruto e imprima o valor devido do imposto. Salário Bruto * Alíquota - Valor a deduzir
        while (true) {
            try {
                
                
                System.out.println("Escreva o seu salário bruto: ");
                float salarioBruto = scanner.nextFloat();

                if (salarioBruto >= 0 && salarioBruto <= 1903.98) {
                    System.out.println("Você não pagara imposto.");
                    break;
                }

                else if (salarioBruto > 1903.98 && salarioBruto <= 2826.65) {
                    System.out.printf("Você terá que pagar R$%.2f de imposto.", salarioBruto);
                    break;
                }

                else if (salarioBruto > 2826.65 && salarioBruto <= 3751.05) {
                    System.out.printf("Você terá que pagar R$%.2f de imposto.", salarioBruto);
                    break;
                }

                else if (salarioBruto > 3751.05 && salarioBruto <= 4664.68) {
                    System.out.printf("Você terá que pagar R$%.2f de imposto.", salarioBruto);
                    break;
                }

                else if (salarioBruto > 4664.68) {
                    System.out.printf("Você terá que pagar R$%.2f de imposto.", salarioBruto);
                    break;
                }

            } 
            catch (Exception e) {
                System.out.println("ERRO!!!");
                scanner.nextLine();
            } 
        }
        scanner.close();
    }
}
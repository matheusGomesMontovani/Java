package CondicionaiSequenciais;
import java.util.Scanner;

public class Estrutura_Condicional {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        
        // Faça um código para ler um número e imprimi-lo caso seja múltiplo de 5
    //    System.out.print("Digite um número: ");
    //     int num = scanner.nextInt();

    //     if (num%5==0) {
    //         System.out.println("" +num+ " é múltiplo de 5");
    //     } 
        
    //     else {
    //         System.out.println("" +num+ " não é múltiplo de 5");
    //     }

        
        
        // Faça um programa que leia dois números e imprima o maior deles
        // System.out.println("Digite um números: ");
        // int numero1 = scanner.nextInt();
        
        // System.out.println("Digite outro números: ");
        // int numero2 = scanner.nextInt();
        
        // if (numero1 > numero2) {
        //     System.out.printf("%d é maior que %d", numero1, numero2);
        // }
        // else {
        //     System.out.printf("%d é maior que %d", numero2, numero1);
        // }

        
        
        // Faça um código que leia dois números inteiros, efetue a adição e caso 
        // o resultado seja maior ou igual a 10 imprima "Soma maior ou igual a 10"
        // System.out.print("Digite um números: ");
        // int num1 = scanner.nextInt();
        
        // System.out.print("Digite outro números: ");
        // int num2 = scanner.nextInt();

        // if (num1 + num2 == 10) {
        //     System.out.print("Soma maior ou igual a 10");
        // }
        // else {
        //     System.out.print("Soma menor que 10");
        // }

        // Faça um código que leia a altura e peso do usuário, calcule IMC e imprima a facha do peso. 
        // (Até 18.5 abaixo do peso, de 18.5 até 25 peso normal, de 25 até até 30 acima do peso e acima de 30 obeso)
        System.out.print("Digita sua altura: ");
        float altura = scanner.nextFloat();

        System.out.print("Digita o seu peso: ");
        float peso = scanner.nextFloat();

        float imc = (peso) / (altura*altura);

        if (imc <= 18.5) {
            System.out.printf("O seu IMC é %.2f, isso significa que você está abaixo do peso.", imc);
        }
        else if (imc > 18.5 && imc <= 25) {
            System.out.printf("O seu IMC é %.2f, isso significa que o seu peso está noraml.", imc);
        }
        else if (imc > 25 && imc <= 30) {
            System.out.printf("O seu IMC é %.2f, isso significa que você está acima do peso.", imc);
        }
        else {
            System.out.printf("O seu IMC é %.2f, isso significa que você está obeso.", imc);
        }
        scanner.close();


    }
}



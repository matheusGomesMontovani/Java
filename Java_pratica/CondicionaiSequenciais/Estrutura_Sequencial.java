package CondicionaiSequenciais;
import java.util.Scanner;

class Estrutura_Sequencial {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        // Faça um código que pergunte o nome do usuário e imprima "Olá {fulano}, eu me chamo Java!"
        
        System.out.print("What's your name? ");
        
        String name = scanner.nextLine();
        
        System.out.println("Hello " + name + ", my name is Java!");


        System.out.println("-------------------------------------");

        //Imprima na tela o valor de 21 / 6, observe o valor da variável resposta
        // float num1 = 21;
        // float num2 = 6;
        // System.out.println(num1/num2);

        System.out.println("-------------------------------------");

        //Faça um programa que leia dois números inteiros e imprima a média ponderada dos dois, considere os pesos 3 e 4
        System.out.println("Write one number:");
        float num1 = scanner.nextFloat();

        System.out.println("Write other number:");
        float num2 = scanner.nextFloat();

        float mediaPonderada = ((((num1*3)+(num2*4))/(num1+num2)));
        
        System.out.println(mediaPonderada);

        scanner.close();
    }
}

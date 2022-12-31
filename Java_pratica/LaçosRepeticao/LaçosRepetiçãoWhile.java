package LaçosRepeticao;

import java.util.Scanner;

public class LaçosRepetiçãoWhile {
    public static void main(String[] arg) {
    Scanner scanner = new Scanner(System.in);

    // Faça um código que leia valores até que seja digitado 0. Imprima quantos itens foram lidos e qual a média dos valores
    int quantidade = 0;
    int soma = 0;
    float media = 0;
    while (true) {
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        
        if (numero == 0) {
            break;
        }
    quantidade += 1;
    soma = soma + numero;
    media = (soma/quantidade);
    }
    System.out.println("A quantidade é: " +quantidade+ "");
        
    System.out.println("A soma é: " +soma+ "");

    System.out.println("A média é: " +media+"");
    




    System.out.println("----------------------------------------");

    // Faça um código que leia valores até que seja digitado 0. Imprima o maior valor digitado
    int maior_num = 0;
    int menor_num = 1000000000;

    while (true) {
        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        if (num == 0){
            break;
        }
        if (num > maior_num) {
            maior_num = num;
        }
        if (num < menor_num) {
            menor_num = num;
        }
    }
    System.out.println("O maior número é: " +maior_num+ "");
    System.out.println("O menor número é: " +menor_num+ "");


    System.out.println("----------------------------------------");
    // Faça um código que leia idades até que seja digitado 0. Imprima quantas idades maiores ou iguais a 18 foram digitadas
    // int idades_18 = 0;
    // int idades = 0;

    // while (true) {
    //     System.out.print("Digite um número: ");
    //     int num = scanner.nextInt();

    //     if (num == 0) {
    //         break;
    //     }
    //     if (num >= 18) {
    //         idades_18 += 1;
    //         idades += 1;
    //     }
    //     else {
    //         idades += 1;
    //     }
    // }
    // System.out.println("A quantidade de idades é: " +idades+ "");
    // System.out.println("A quantidade de idades maiores ou iguais a 18 é : " +idades_18+ "");

    System.out.println("----------------------------------------");
    // Faça um código que leia idades até que seja digitado 0. Calcule a 
    // média de idades de quem possui mais que 21 anos e imprima
    int idadeSoma21 = 0;
    int idadeQuantidade = 0;

    while (true){
        System.out.print("Digite uma idade: ");
        int idade = scanner.nextInt();

        if (idade == 0) {
            break;
        }
        
        if (idade > 21) {
            idadeSoma21 += idade;
            idadeQuantidade += 1;
        }

    }
    int media21 = idadeSoma21 / idadeQuantidade;

    System.out.print("A média das idades maiores que 21 anos é: " +media21+ "");
    
    scanner.close();
    }
}

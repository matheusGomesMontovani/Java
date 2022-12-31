package LaçosRepeticao;


import java.util.Scanner;

public class LaçosRepetiçãoFor {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        for(int i=1001; i>1; i--) {
            if(i % 7 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("---------------------------------");
        for(int j=1; j<1001 ; j++){
            if(j % 7 == 0) {
                System.out.println(j);
            }
        }
        System.out.println("---------------------------------");
        // Faça um código que conte de 0 até 10 imprimindo na tele
        for(int i=0; i<11; i++){
            System.out.println(i);
        }
        System.out.println("---------------------------------");
        // Faça um código que conte de 10 até 1 imprimindo na tela
        for(int i=10; i>0; i--){
            System.out.println(i);
        }
        System.out.println("---------------------------------");
        // Faça um código que conte de -10 até 10 imprimindo na tela
        for(int i=-10; i<11; i++){
            System.out.println(i);
        }
        System.out.println("---------------------------------");
        // Faça um código que imprima todos os números pares até 100
        // System.out.print("Digite um número: ");
        // int num = scanner.nextInt();
        // for(int i=num; i<101; i++){
        //     if (i % 2 == 0){
        //         System.out.println(i);
        //     }
        // }
        System.out.println("---------------------------------");
        // Faça um código que imprima todos os números ímpares até 100
        // System.out.print("Digite um número: ");
        // int numero = scanner.nextInt();
        // for(int i=numero; i<101; i++){
        //     if (i % 2 != 0){
        //         System.out.println(i);
        //     }
        // }
        System.out.println("---------------------------------");
        // Faça um código que imprima todos os números primos de 2 até 100
        for(int i=2; i<101; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
        System.out.println("---------------------------------");
        // Faça um código que leia um número e imprima a tabuada do número de 1 a 10
        System.out.print("Digite por qual número você quer multiplicar: ");
        int numMult = scanner.nextInt();

        for(int contador = 1; contador < 11; contador ++ ){
            
            System.out.println(""+contador+ "x" +numMult+ "=" +contador*numMult);
            }

        System.out.println("---------------------------------");
        // Faça um código, usando dois loops for, que imprima o triangulo abaixo, dica: procure pelo parametro end do print
        for(int i = 9; i > 0; i--) {
            for(int j = i; j >0; j--){
                System.out.print(j);
            }
            System.out.println();
        } 


        scanner.close();
    }
}

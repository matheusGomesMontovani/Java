package CondicionaiSequenciais;
import java.util.Scanner;

class CaixaEletronicoIfElse{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // Vamos fazer um menu de caixa eletrônico, executando em loop até que o usuário peça para sair. 
        // Suponha que o saldo inicial seja R$1000. O usuário deverá digitar qual item do menu para prossegir. Imprima: """
        // 1 - Ver saldo
        // 2 - Sacar dinheiro
        // 3 - Depositar dinheiro
        // 4 - Sair
        // """

        while (true) {
            System.out.println("Digite 1 imprima o saldo atual");
            System.out.println("Digite 2 para sacar");
            System.out.println("Digite 3 para depositar");
            System.out.println("Digite 4 se deseja encerrar");
            
            float saldo = 1000;
            int num = scanner.nextInt();
            
            if (num == 1) {
                System.out.println("O seu saldo atual é: R$" +saldo+ "");
            }
            else if (num == 2) {
                System.out.println("Quanto você deseja sacar?");
                float saque = scanner.nextFloat();
                System.out.println("Você sacou: R$" +saque+ "");
                System.out.println("O seu saldo atual é: " +(saldo - saque)+"");
                if (saque > saldo) {
                    System.out.println("O valor desejado é maior que o saldo atual");
                }
            }
            else if (num == 3) {
                System.out.println("Quanto você deseja depositar?");
                float deposito = scanner.nextFloat();
                System.out.println("Você depositou: R$" +deposito+ "");
                System.out.println("O seu saldo atual é: " +(deposito + saldo)+"");
            }
            else if (num == 4) {
                System.out.println("Tenha um bom dia");
                break;
            }
        }
        scanner.close();
    }
}
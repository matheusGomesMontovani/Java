package Arrays_ArraysLists;
import java.util.ArrayList;
import java.util.Scanner;


public class ExercíciosArraysList {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        // ArrayList<Integer> idades_21 = new ArrayList<Integer>();

        // Faça um código que leia idades até que seja digitado 0. 
        // Calcule a média de idades de quem possui mais que 21 anos e imprima
        // float soma = 0;
        // while (true){
        //     System.out.print("Digite a idade (Digite 0 pra parar): ");
        //     int idade = scanner.nextInt();
        //     if (idade == 0) {
        //         break;
        //     }

        //     if (idade > 21) {
        //         idades_21.add(idade);
        //         soma += idade;
        //     }
        //     else {
        //         System.out.println("Somente idades acima de 21 anos");
        //     }
        // }
        // float media =  soma / idades_21.size();
        // System.out.println("A média é: " +media+ "");
        // System.out.println(soma);
        // System.out.println(idades_21.size());
        // System.out.println(idades_21);
       


        // Vamos fazer um sistema de ingressos de Cinema. Pergunte a idade até 
        // que a pessoa digite 0 para sair. Se a pessoa tiver menos que 10
        // anos ou mais que 60 informe "Meia Entrada" se não, informe "Inteira". 
        // Ao terminar imprima: "Total de x ingressos vendidos, sendo y meia entrada"

        ArrayList<Integer> inteira = new ArrayList<Integer>();
        ArrayList<Integer> meia = new ArrayList<Integer>();

        while (true) {
            System.out.print("Digite a sua idade pra comprar ingressos: ");
            int idadeIngressos = scanner.nextInt();

            if (idadeIngressos == 0) {
                break;
            }
            if (idadeIngressos > 10 && idadeIngressos < 60) {
                inteira.add(idadeIngressos);
            }
            else {
                meia.add(idadeIngressos);
            }

        }
        System.out.println("Total de " +(inteira.size() + meia.size())+". Sendo " +meia.size()+ " de meia entrada e " +inteira.size()+ " de inteira.");
        scanner.close();


        //Vamos fazer um menu de caixa eletrônico, executando em loop até que 
        //o usuário peça para sair. Suponha que o saldo inicial seja R$1000. 
        //O usuário deverá digitar qual item do menu para prossegir. Imprima: """
        // 1 - Ver saldo
        // 2 - Sacar dinheiro
        // 3 - Depositar dinheiro
        // 4 - Sair
        // """
    }
}

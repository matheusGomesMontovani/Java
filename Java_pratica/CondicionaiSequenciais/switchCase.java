package CondicionaiSequenciais;
import java.util.Scanner;

class switchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um valor entre 0 e 3: ");
        int num = scanner.nextInt();
        int quarter = num; // any value

        String quarterLabel = null;
        switch (quarter) {
        case 0: quarterLabel = "Q1 - Winter"; 
                break;
        case 1: quarterLabel = "Q2 - Spring"; 
                break;
        case 2: quarterLabel = "Q3 - Summer"; 
                break;
        case 3: quarterLabel = "Q4 - Summer"; 
                break;
        default: quarterLabel = "Unknown quarter";
};


System.out.println(quarterLabel);
scanner.close();
    }
}

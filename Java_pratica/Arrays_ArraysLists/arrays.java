package Arrays_ArraysLists;
import java.util.Arrays;
import java.lang.String;

class arrays {
    public static void main(String[] arg) {
        
        String[] arrays = new String [8];

        arrays[0] = "Bleach";
        arrays[1] = "Naruto";
        arrays[2] = "One Piece";
        arrays[3] = "Chainsaw Man";
        arrays[4] = "Evangelion";
        arrays[5] = "Death Note";
        arrays[6] = "Jujutsu Kaisen";
        arrays[7] = "Berserk";

        System.out.println("Element at index 0: "
                           + arrays[0]);
        System.out.println("Element at index 1: "
                           + arrays[1]);
        System.out.println("Element at index 2: "
                           + arrays[2]);
        System.out.println("Element at index 3: "
                           + arrays[3]);
        System.out.println("Element at index 4: "
                           + arrays[4]);
        System.out.println("Element at index 5: "
                           + arrays[5]);
        System.out.println("Element at index 6: "
                           + arrays[6]);
        System.out.println("Element at index 7: "
                           + arrays[7]);

        System.out.println(Arrays.toString(arrays)); 
        //import java.util.Arrays; pode ser tambem System.out.println(Arrays.toString(java.util.arrays))











        
        System.out.println("------------------------------");

        int[] array = new int [8];

        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        array[5] = 6;
        array[6] = 7;
        array[7] = 8;

        System.out.println("Element at index 0: "
                           + array[0]);
        System.out.println("Element at index 1: "
                           + array[1]);
        System.out.println("Element at index 2: "
                           + array[2]);
        System.out.println("Element at index 3: "
                           + array[3]);
        System.out.println("Element at index 4: "
                           + array[4]);
        System.out.println("Element at index 5: "
                           + array[5]);
        System.out.println("Element at index 6: "
                           + array[6]);

        System.out.println(Arrays.toString(array));

        

        System.out.println("------------------------------");
        String [] animes = {
            "Bleach", "Naruto", "One Piece", "Chainsaw Man", "Evangelion",
            "Death Note", "Jujutsu Kaisen", "Berserk"};
        
        String[] copyAnimes = Arrays.copyOfRange(animes, 2, 5);        
        for (String myAnimes : copyAnimes) {
            System.out.println(myAnimes + " ");           
        }            
        System.out.println(Arrays.toString(animes));












        System.out.println("------------------------------");
        String[][] names = {
            {"Mr. ", "Mrs. ", "Ms. "},
            {"Smith", "Jones"}
        };
        // Mr. Smith
        System.out.println(names[0][0] + names[1][0]);
        // Ms. Jones
        System.out.println(names[0][2] + names[1][1]);




        System.out.println("------------------------------");
        int[][] numeros = {
            {1, 2, 3, 1, 2},
            {4, 5, 6, 4, 5},
            {7, 8, 9, 7, 8}
        };
        int calculoMatriz_1 = ((numeros[0][0] * numeros[1][1] * numeros[2][2]) + (numeros[0][1] * numeros[1][2] * numeros[2][3]) + 
        (numeros[0][2] * numeros[1][3] * numeros[2][4]));
        
        int calculoMatriz_2 = ((numeros[0][4] * numeros[1][3] * numeros[2][2]) + (numeros[0][3] * numeros[1][2] * numeros[2][1]) + 
        (numeros[0][2] * numeros[1][1] * numeros[2][0]));
        
        System.out.println(calculoMatriz_1 - calculoMatriz_2);
    }
}

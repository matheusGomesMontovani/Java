package Arrays_ArraysLists;
import java.util.ArrayList;
import java.util.Comparator;

class ArraysLista {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList < Integer > ();
        
        numbers.add(1); //0
        numbers.add(2); //1
        numbers.add(3); //2
        numbers.add(4); //3
        numbers.add(5); //4
        numbers.add(6); //5

        numbers.remove(); //precisa escrever a posição

        numbers.remove(Integer.valueOf(6)); //precisa escrever o item

        numbers.clear();

        numbers.set(2, Integer.valueOf(50)); //adiciona um valor em uma posição

        System.out.println(numbers.get()); //retorna o valor de uma determinada posição

        numbers.sort(Comparator.reverseOrder()); //inverte a ordem

        numbers.sort(Comparator.naturalOrder()); //coloca na ordem do menor para o maior

        System.out.println(numbers.size()); //identifica quantos elementos tem na lista

        System.out.println(numbers.contains(Integer.valueOf())); //serve pra saber se um elemento está na lista

        System.out.println(numbers.isEmpty()); //serve pra saber se a lista está vazia

        System.out.println(numbers.toString());


    }
}

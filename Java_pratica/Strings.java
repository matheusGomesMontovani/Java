public class Strings {

    public static void main(String[] arg){
    
        String name = "Matheus Gomes Montovani";
        int age = 20;
        String country = "Brazil";

        String myInformation = String.format(
            "My name is %s, I'm %d years old and\nI live in %s", name, age, country
        );

        System.out.println(myInformation);
    }

}

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Olá, mundo!");
        System.out.println("Hello, mundo!");

        String[] nomesArr = new String[10];

        nomesArr[0] = "Gabriel";

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Gabriel");
        nomes.add("Vitor");
        nomes.add("da");
        nomes.add("Silva");
        nomes.add("Esperança");

        System.out.println(nomes.get(2));

        nomes.remove(2);
        nomes.remove("Silva");

        System.out.println(nomes.get(2));

        for (int i = 0; i < nomes.size(); i++){
            System.out.println(nomes.get(i));
        }

        int contador = 0;
        while(contador < 10){
            System.out.println("Estou no while");
            contador++;
        }

        //Casting


        double resultado = 0.0;
        System.out.println(resultado);
        int resultadoInt = (int) resultado;
        System.out.println(resultadoInt);

        int meuInt = 10;
        System.out.println(meuInt);
        double meuDouble = meuInt;
        System.out.println(meuDouble);

        //Conversão de String para Int
        String meuString = "10";
        int meuInt2 = Integer.parseInt(meuString);

        //Conversão de Int para String
        String minhaString = String.valueOf(meuInt2);
    }
}

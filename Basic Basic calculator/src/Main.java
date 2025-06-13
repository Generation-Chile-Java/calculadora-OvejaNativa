import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("índicame el primer número");
        int numeroUno = teclado.nextInt();
        System.out.println("índicame el segundo número");
        int numeroDos = teclado.nextInt();

        //suma
        System.out.println("la suma es:" + (numeroUno + numeroDos));


        //resta
        System.out.println("la resta es:" + (numeroUno - numeroDos));

        //Multiplicación
        System.out.println("la multiplicación es: " + (numeroUno * numeroDos));

        //división
        System.out.println("la división es: " + (numeroUno / numeroDos));

        //dividendo
        System.out.println("el dividendo es: " + (numeroUno % numeroDos));




    }
}
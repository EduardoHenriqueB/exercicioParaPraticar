package primos;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int valor;
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite um valor para saber se eh primo: ");
        valor = leia.nextInt();
        Primos primos = new Primos(valor);

        primos.verificar();
        primos.informar();

    }
}

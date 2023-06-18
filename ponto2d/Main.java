package ponto2d;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double x1,y1,x2,y2;
        
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o valor de X do PRIMEIRO ponto: ");
        x1 = leia.nextDouble();
        System.out.println("Digite o valor de Y do PRIMEIRO ponto: ");
        y1 = leia.nextDouble();
        System.out.println("Digite o valor de X do SEGUNDO ponto: ");
        x2 = leia.nextDouble();
        System.out.println("Digite o valor de Y do SEGUNDO ponto: ");
        y2 = leia.nextDouble();

        Ponto2D ponto1 = new Ponto2D(x1, y1);
        Ponto2D ponto2 = new Ponto2D(x2, y2);

        System.out.println("DISTANCIA ORIGEM DO PONTO 1: " + ponto1.calcularDist());
        System.out.println("DISTANCIA ORIGEM DO PONTO 2: " + ponto2.calcularDist());
        System.out.println("DISTANCIA ENTRE PONTOS: " + ponto1.calcularDistanP2(ponto2));
    }
}

package primos;
public class Primos {
    int valor;

    Primos(int valor) {
        this.valor = valor;
    }

    public boolean verificar() {
        if (valor <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(valor); i++) {
            if (valor % i == 0) {
                return false;
            }
        }

        return true;
    }

    public void informar() {
        System.out.println("PRIMO: " + verificar());
    }
}

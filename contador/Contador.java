package contador;

public class Contador{
    int valor;
    Contador(int valor){
        this.valor = valor;
    }


    public int zerar(){
        valor = 0;
        return valor;
    }
    public int incrementar(){
        valor++;
        return valor;
    }
    public void retornar(){
        System.out.println("[Contador] = " + valor);
    }
}

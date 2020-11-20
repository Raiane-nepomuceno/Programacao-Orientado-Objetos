package exercicio;

public class Banana extends Fruta{

    public Banana(String tipo, float preco) {
        super(tipo, preco);
    }
    @Override
    public String toString() {
        return "Banana{" +
                "tipo='" + getTipo() + '\'' +
                ", preco=" + getPreco() +
                '}';
    }
}

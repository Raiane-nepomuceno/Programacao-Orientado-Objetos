package exercicio;

public class Maca extends Fruta{
    public Maca(String tipo, float preco) {
        super(tipo, preco);
    }
    @Override
    public String toString() {
        return "Maçã{" +
                "tipo='" + getTipo() + '\'' +
                ", preco=" + getPreco() +
                '}';
    }
}

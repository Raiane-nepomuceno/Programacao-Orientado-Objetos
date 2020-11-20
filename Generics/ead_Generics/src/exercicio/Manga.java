package exercicio;

public class Manga extends Fruta{
    public Manga(String tipo, float preco) {
        super(tipo, preco);
    }
    @Override
    public String toString() {
        return "Manga{" +
                "tipo='" + getTipo() + '\'' +
                ", preco=" + getPreco() +
                '}';
    }
}

package funcionario;

public class Funcionario {
    private int id;
    private String nome;

    public Funcionario(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Funcionario() {
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
    public double remuneracao()
    {
        return 0;
    }

    @Override
    public String toString() {
        return
                "\nId:" + id +
                 "\nNome:" + nome;
    }
}

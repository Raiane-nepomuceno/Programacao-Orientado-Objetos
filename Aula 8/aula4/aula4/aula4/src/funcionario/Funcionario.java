package funcionario;

import despesa.Despesa;

public abstract class Funcionario implements Despesa {
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
    public abstract double remuneracao();

    @Override
    public String toString() {
        return
                "\nId:" + id +
                 "\nNome:" + nome;
    }
    public double totalPagar()
    {
        return remuneracao();
    }
}

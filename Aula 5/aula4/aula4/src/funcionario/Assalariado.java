package funcionario;

public class Assalariado extends Funcionario {
    private int id;
    private String nome;
    private double salario;

    public Assalariado(int id, String nome) {
        super(id, nome);
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double remuneracao()
    {
        return getSalario();
    }
}

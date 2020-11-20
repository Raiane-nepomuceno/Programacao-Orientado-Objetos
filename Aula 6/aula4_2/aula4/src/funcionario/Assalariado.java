package funcionario;

public class Assalariado extends Funcionario {
    private double salario;

    public Assalariado(int id, String nome) {
        super(id, nome);
    }

    public Assalariado(int id, String nome, double salario) {
        super(id, nome);
        this.salario = salario;
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

    @Override
    public String toString() {
        return super.toString() + "\nTipo:Assalariado\nRemuneração:"+remuneracao();
    }
}

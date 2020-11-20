package funcionario;

public class AssalariadoComissionado extends Comissionado{
    private double salario;

    public AssalariadoComissionado(int id, String nome) {
        super(id, nome);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public  double remuneracao()
    {
        return ((getTotalVendas()*getComissao())+getSalario());
    }
}

package funcionario;

public class AssalariadoComissionado extends Comissionado {
    private double salario;

    public AssalariadoComissionado(int id, String nome) {
        super(id, nome);
    }

    public AssalariadoComissionado(int id, String nome, double totalVendas, double comissao, double salario) {
        super(id, nome, totalVendas, comissao);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double remuneracao() {
        return ((getTotalVendas() * getComissao()) + getSalario());
    }

    @Override
    public String toString() {
        return "\nId:" + getId() + "\nNome:"+getNome()+"\nTipo:Assalariado Comissionado"+"\nTotal de Vendas:"+getTotalVendas()+"\nComissão:"+getComissao()+"\nRemuneração:"+remuneracao();
    }
}

package funcionario;

public class Comissionado extends Funcionario {
    private int id;
    private String nome;
    private double totalVendas;
    private double comissao;

    public Comissionado(int id, String nome) {
        super(id, nome);
    }


    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    public double remuneracao()
    {
        return totalVendas*comissao;
    }
}

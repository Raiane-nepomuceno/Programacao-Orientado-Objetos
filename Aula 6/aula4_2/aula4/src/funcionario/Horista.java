package funcionario;

public class Horista extends Funcionario {
    private double horasTrabalhadas;
    private double valorHora;

    public Horista(int id, String nome) {
        super(id, nome);
    }

    public Horista(int id, String nome, double horasTrabalhadas, double valorHora) {
        super(id, nome);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    public double remuneracao()
    {
        return horasTrabalhadas*valorHora;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo:horista\nRemuneração:"+remuneracao()+"\nValor da hora:"+getValorHora()+"\nHoras Trabalhadas:"+getHorasTrabalhadas();
    }
}

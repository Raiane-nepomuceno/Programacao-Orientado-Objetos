public class Correntista {
    int id;
    String nome;
    float saldo;

    public Correntista(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    void sacar(float valor)
    {
        if(valor<=saldo)
        {
            System.out.println("O valor solicitado para o saque é R$"+valor);
            System.out.println("Máquina carregando.....");
            System.out.println("Retire o dinheiro!");
            this.saldo -=  valor;
        }
        else{
            System.out.println(" -> Valor indisponível na conta solicitada, operação cancelada!");
        }
    }
    void depositar(float valor)
    {
        System.out.println("Depositando o valor inserido na máquina");
        this.saldo+= valor;
    }
    void extrato()
    {
        System.out.println("---------- SALDO ------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("------------------------------");
    }

}

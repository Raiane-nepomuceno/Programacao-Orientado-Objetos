package fatura;

import despesa.Despesa;

public class Fatura implements Despesa {
    private int id;
    private String descricao;
    private int quantidade;
    private double precoItem;

    public Fatura(int id, String descricao, int quantidade, double precoItem) {
        this.id = id;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.precoItem = precoItem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(double precoItem) {
        this.precoItem = precoItem;
    }
    public double totalPagar()
    {
        return quantidade*precoItem;
    }

    @Override
    public String toString() {
        return "Fatura{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", quantidade=" + quantidade +
                ", precoItem=" + precoItem + ", totalPagar:"+totalPagar()+'}';
    }
}

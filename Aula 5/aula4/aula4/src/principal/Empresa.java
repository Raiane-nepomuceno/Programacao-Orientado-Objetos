package principal;

import funcionario.AssalariadoComissionado;
import funcionario.Horista;

public class Empresa {
    public static void main(String[] args) {
        double salarioAna;
        AssalariadoComissionado ana = new AssalariadoComissionado(20,"Ana");
        ana.setSalario(2000);
        ana.setComissao(12);
        ana.setTotalVendas(10);
        salarioAna = ana.remuneracao();
        System.out.println("Remuneração: "+salarioAna);

    }
}

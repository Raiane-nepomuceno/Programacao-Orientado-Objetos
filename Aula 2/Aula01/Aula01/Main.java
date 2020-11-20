public class Main {
    public static void main(String[] args) {
        Correntista raiane = new Correntista(1,"Raiane");
        raiane.saldo = 150;
        raiane.extrato();
        raiane.depositar(250);
        raiane.extrato();
        raiane.sacar(100);
        raiane.extrato();
        raiane.sacar(325);
        raiane.extrato();
        Aluno ana = new Aluno(1,"Ana");
        ana.marcarFalta(25);
        ana.salvarnotas(4,3,4);
        ana.situacao();
      }
}

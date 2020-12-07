package financeiro.comando;
public class Sair extends Comando{
    public Sair() {
        super(null, null);
    }

    @Override
    public void execute() {
        System.out.println("Sessão finalizada!");
    }
}

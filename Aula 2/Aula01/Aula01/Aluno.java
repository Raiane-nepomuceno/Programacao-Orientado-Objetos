public class Aluno {
    int id,faltas;
    String nome;
    float notaProva,notaTrabalho,notaExercicios;

    public Aluno(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    void marcarFalta(int numFaltas)
    {
        this.faltas+=numFaltas;
    }
    void salvarnotas(float notaProva,float notaTrabalho,float notaExercicios
    )
    {
        this.notaProva = notaProva;
        this.notaTrabalho = notaTrabalho;
        this.notaExercicios = notaExercicios;
    }
    float calcularMedia()
    {
        return (notaProva*4 + notaTrabalho*5  +  notaExercicios*1)/10;
    }
    void situacao()
    {
        if(calcularMedia()>= 6 && faltas<=25)
        {
        System.out.println("A nota de " +nome + " é " +calcularMedia()+" e está aprovado(a)!");
        }
        else if(calcularMedia()<4 || faltas>25)
        {
            System.out.println("A nota de " +nome + " é " +calcularMedia()+" e está reprovado(a)!");
        }
        else{
            System.out.println("A nota de " +nome + " é " +calcularMedia()+ " e está de IFA!");
        }
    }
}

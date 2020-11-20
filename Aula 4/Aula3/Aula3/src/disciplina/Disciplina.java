package disciplina;

public class Disciplina {
    private String alunos[];
    private float notas[][];
    private static final int TAMANHO_TURMA = 10;
    private static final int QUANTIDADE_AVALIACAOES = 4;
    private int posicao;

    public Disciplina() {
        alunos = new String[TAMANHO_TURMA];
        notas = new float[TAMANHO_TURMA][QUANTIDADE_AVALIACAOES];
        posicao= 0;
    }
    public void adicionarAluno(String aluno)
    {
        if(posicao>=10)
        {
            System.out.println("Espaço indisponíveis para adicionar disciplinas");
        }else{
            alunos[posicao] =aluno;
            posicao++;
        }
    }
    public void visualizarAluno()
    {
        for (int i = 0; i < posicao; i++) {
            System.out.println(alunos[i]);

        }
    }
    public void adicionarNotas(int idAluno,int idAvaliacao,float nota)
    {
        if(idAluno>=10 || idAvaliacao>=4)
        {
            System.out.println("Id do aluno inválido ou número de availiações maior que o permitido");
        }else{
            notas[idAluno][idAvaliacao] = nota;
        }
    }
    public void adicionarNotas(int idAluno,float[] notas)
    {
        if(idAluno>=10 || notas.length>4)
        {
            System.out.println("Id do aluno inválido ou número de availiações maior que o permitido");
        }else{
            for (int i = 0; i < 4; i++)
                this.notas[idAluno][i] = notas[i];
        }
    }
    public void visualizarNota()
    {
        for (int i = 0; i < posicao; i++) {
            System.out.print(alunos[i]);
            float mediaNotas=0;
            for (int j = 0; j < QUANTIDADE_AVALIACAOES; j++) {
                mediaNotas+=notas[i][j];
                System.out.print(" "+notas[i][j]);
            }
            mediaNotas = mediaNotas/4;
            System.out.print(" Média:"+mediaNotas);
            System.out.println();
        }
    }
}

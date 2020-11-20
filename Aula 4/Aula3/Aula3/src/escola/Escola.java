package escola;

import disciplina.Disciplina;

public class Escola {
    public static void main(String[] args) {
        String alunos[] = {"José","Maria","Joaquim","Joana"};
        float notas[]= {10,8,5,9};
        Disciplina matematica = new Disciplina();
        matematica.adicionarAluno("José");
        matematica.adicionarAluno("Maria");
        matematica.adicionarAluno("Joaquim");
        matematica.adicionarAluno("Jonas");

        matematica.adicionarNotas(0,0,10);
        matematica.adicionarNotas(1,0,9);
        matematica.adicionarNotas(2,0,8);
        matematica.adicionarNotas(3,0,7);
        float nota1[] = {5,9,7,7};

        matematica.adicionarNotas(0,nota1);
        float nota2[] = {8,4,7,7};
        matematica.adicionarNotas(1,nota2);
        float nota3[] = {5,4,5,5};
        matematica.adicionarNotas(2,nota3);

        float nota4[] = {5,6,2,7};
        matematica.adicionarNotas(3,nota4);

        matematica.visualizarNota();

    }
}

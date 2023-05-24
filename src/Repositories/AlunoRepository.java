package Repositories;

import models.Aluno;

public class AlunoRepository {

    private Aluno[] alunos;

    public AlunoRepository() {
        this.alunos = new Aluno[10];
    }

    public void cadastrarAluno(Aluno aluno) {
        for (int i = 0; i < this.alunos.length; i++) {
            if (this.alunos[i] == null) {
                this.alunos[i] = aluno;
                break;
            }
        }
    }

    public Aluno buscar(String cpf){
        for (int i = 0; i < this.alunos.length; i++) {
            if (this.alunos[i] != null && this.alunos[i].getCpf().equals(cpf)) {
                return this.alunos[i];
            }
        }
        return null;
    }
}

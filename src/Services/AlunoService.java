package Services;

import Exeception.CPFException;
import Exeception.EmailException;
import Exeception.GException;
import Repositories.AlunoRepository;
import models.Aluno;

public class AlunoService {

    private AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public void cadastrarAluno(Aluno aluno) throws CPFException, EmailException, GException {
        if(aluno.getCpf().length() != 11){
            throw new CPFException();
        }else if(aluno.getMatricula().length() != 9){
            throw new GException("Matrícula inválida");
        }else if(aluno.getEmail().length() < 10){
            throw new EmailException();
        }else if(aluno.getTelefone().length() != 11){
            System.out.println("Telefone inválido");
        }
        else{
            this.alunoRepository.cadastrarAluno(aluno);
        }
    }

    public Aluno buscar(String cpf){
        return this.alunoRepository.buscar(cpf);
    }
}
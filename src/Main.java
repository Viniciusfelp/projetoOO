import Exeception.CPFException;
import Exeception.EmailException;
import Exeception.GException;
import Repositories.AlunoRepository;
import Services.AlunoService;
import models.Aluno;
import models.Endereco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws EmailException, CPFException, GException {
        Scanner s = new Scanner(System.in);

        AlunoRepository alunoRepository = new AlunoRepository();
        AlunoService alunoService = new AlunoService(alunoRepository);

        Aluno aluno = new Aluno("João", "12345678900", "12300456789", "joao@gmail.com", "81981918123",new Endereco());
        System.out.println("Cadastrar ou buscar aluno? (c/b)");

        alunoService.cadastrarAluno(aluno);
        System.out.println(alunoService.buscar(aluno.getCpf()).toString());

    }
}
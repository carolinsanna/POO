package br.edu.cadastro;

public class Principal {
	public static void main(String[] args) throws Exception {
		
		Aluno alunoOne = new Aluno();
		Aluno alunoTwo = new Aluno();
		
		alunoOne.nome = "Maria";
		alunoOne.matricula = "AL0001";
		alunoOne.curso = "Medicina";
		
		alunoTwo.nome = "Roberta";
		alunoTwo.matricula = "AL0002";
		alunoTwo.curso = "Direito";
		
		alunoOne.exibirDados();
		alunoTwo.exibirDados();
	}
}

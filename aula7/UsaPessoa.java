package br.unipe.java.aula7;

public class UsaPessoa {
	public static void main(String[] args) {
	
		Pessoa p = new Pessoa();
		p = new Aluno();
		Aluno a = new Aluno();
		
		imprimeNome(new Funcionario());//Passa o objeto diretamente 
		imprimeNome(p);
		imprimeNome(a);
						
	}
	
	public static void imprimeNome(Pessoa pessoa) {
		System.out.println(pessoa.getNome());
	}
}

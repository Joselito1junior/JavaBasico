package br.unipe.java.aula9;

public class Aluno {
	
	private String nome;
	private String disciplina;
	private int matricula;
	private Prova provaUm;
	private Prova provaDois;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public Prova getProvaUm() {
		return provaUm;
	}

	public void setProvaUm(Prova provaUm) {
		this.provaUm = provaUm;
	}

	public Prova getProvaDois() {
		return provaDois;
	}

	public void setProvaDois(Prova provaDois) {
		this.provaDois = provaDois;
	}
	
	public float getMediaAluno() {
			float notaUm = getProvaUm().getNotaPonderada();
			float notaDois = getProvaDois().getNotaPonderada();
			return notaUm + notaDois;
	}
}
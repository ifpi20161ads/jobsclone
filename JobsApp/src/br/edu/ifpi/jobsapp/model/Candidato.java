package br.edu.ifpi.jobsapp.model;

public class Candidato {
	private String nome;
	private String email;
	private String curriculo;
	private String apresentacao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCurriculo() {
		return curriculo;
	}

	public void setCurriculo(String curriculo) {
		this.curriculo = curriculo;
	}

	public String getApresentacao() {
		return apresentacao;
	}

	public void setApresentacao(String apresentacao) {
		this.apresentacao = apresentacao;
	}

	@Override
	public String toString() {
		return "Candidato [nome=" + nome + ", email=" + email + ", curriculo=" + curriculo + ", apresentacao="
			+ apresentacao + "]";
	}
}


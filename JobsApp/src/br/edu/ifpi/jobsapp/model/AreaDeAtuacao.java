package br.edu.ifpi.jobsapp.model;

import java.util.ArrayList;

public class AreaDeAtuacao {

	// class attributes

	private String nome;
	private ArrayList<Vaga> vagas;


	// getters and setters 

	public String getNome(){
		return this.nome;
	}
	public ArrayList<Vaga> getVagas(){
		return this.vagas;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public void setVagas(ArrayList<Vaga> vagas){

		this.vagas = vagas;
	}

}


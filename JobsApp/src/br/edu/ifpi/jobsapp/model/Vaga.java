package br.edu.ifpi.jobsapp.model;

public class Vaga {

	private boolean isRemote;
	private String cargo;
	private String descricao;
	private String dataDeAbertura;
	private AreaDeAtuacao areaDeAtuacao;
	private Empresa empresa;
	private double salario;
	private boolean isNegociable;
	private Local cidade;
	private TipoDeContratacao tipoDeContratacao;

	public Vaga(){}

	public Vaga(boolean isRemote, String cargo, String descricao, String dataDeAbertura, AreaDeAtuacao areaDeAtuacao, Empresa empresa, double salario, Local cidade, TipoDeContratacao tipoDeContratacao){

		this.isRemote = isRemote;
		this.cargo = cargo;
		this.descricao = descricao;
		this.dataDeAbertura = dataDeAbertura;
		this.areaDeAtuacao = areaDeAtuacao;
		this.empresa = empresa;
		this.salario = salario;
		this.isNegociable = false;
		this.cidade = cidade;
		this.tipoDeContratacao = tipoDeContratacao;
	}

	public Vaga(boolean isRemote, String cargo, String descricao, String dataDeAbertura, AreaDeAtuacao areaDeAtuacao, Empresa empresa, Local cidade, TipoDeContratacao tipoDeContratacao){

		this.isRemote = isRemote;
		this.cargo = cargo;
		this.descricao = descricao;
		this.dataDeAbertura = dataDeAbertura;
		this.areaDeAtuacao = areaDeAtuacao;
		this.empresa = empresa;
		this.salario = 0;
		this.isNegociable = true;
		this.cidade = cidade;
		this.tipoDeContratacao = tipoDeContratacao;
	}



	public boolean isRemote() {
		return isRemote;
	}

	public String getCargo() {
		return cargo;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getDataDeAbertura() {
		return dataDeAbertura;
	}

	public AreaDeAtuacao getAreaDeAtuacao() {
		return areaDeAtuacao;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public double getSalario() {
		return salario;
	}

	public boolean isNegociable() {
		return isNegociable;
	}

	public Local getCidade() {
		return cidade;
	}

	public TipoDeContratacao getTipoDeContratacao() {
		return tipoDeContratacao;
	}

	public String getSalaryString(){

		if (this.salario <= 0){

			return "Salario a combinar";
		} else {

			return String.format("R$ %.2d", this.salario);
		}
	}
}



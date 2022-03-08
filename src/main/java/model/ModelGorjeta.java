package model;

import java.io.Serializable;

public class ModelGorjeta implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer numeroPessoa;
	private Double valorServico;
	private Double porcentagem;
	
	
	public Integer getNumeroPessoa() {
		return numeroPessoa;
	}

	public void setNumeroPessoa(Integer numeroPessoas) {
		this.numeroPessoa = numeroPessoas;
	}

	public Double getValorServico() {
		return valorServico;
	}

	public void setValorServico(Double valorServico) {
		this.valorServico = valorServico;
	}

	public Double getPorcentagem() {
		return porcentagem;
	}

	public void setPorcentagem(Double porcentagem) {
		this.porcentagem = porcentagem;
	}
	

	public Double calcularTotal () {
		return this.valorServico + calcularGorjeta();
	}
	
	public Double calcularGorjeta () {
		return (this.porcentagem/100) * this.valorServico;
		
	}
	
	
	public Double calcularCadaPessoa () {
		Double total = calcularTotal();
		return total/this.numeroPessoa;
	}

}

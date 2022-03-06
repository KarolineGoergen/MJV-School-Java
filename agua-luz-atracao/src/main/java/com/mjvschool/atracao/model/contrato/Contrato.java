package com.mjvschool.atracao.model.contrato;


import com.mjvschool.atracao.model.cadastro.Endereco;
import com.mjvschool.atracao.model.cadastro.Pessoa;
import com.mjvschool.atracao.model.cadastro.Servico;

//java beans
public class Contrato {
	private long numeroProtocolo;
	private Pessoa cadastro;
	private String data;
	private String hora;
	private Servico servico;
	private Endereco endereco;

	public Servico getServico() {
		return servico;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public void setServico(Servico servico) {
		this.servico = servico;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getData() {
		return data;
	}
	public long getNumeroProtocolo() {
		return numeroProtocolo;
	}
	public void setNumeroProtocolo(long numeroProtocolo) {
		this.numeroProtocolo = numeroProtocolo;
	}
	public Pessoa getCadastro() {
		return cadastro;
	}
	public void setCadastro(Pessoa cadastro) {
		this.cadastro = cadastro;
	}
	public Endereco getEndereco(){
		return endereco;
	}
	public void setCadastroEndereco(Endereco endereco){
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Contrato [numeroProtocolo=" + numeroProtocolo + ", data=" + data + " hora="+hora+"]";
	}
	
}

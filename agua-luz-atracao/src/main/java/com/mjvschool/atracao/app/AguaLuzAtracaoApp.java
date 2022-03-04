package com.mjvschool.atracao.app;

import java.util.Date;
import java.util.List;

import com.mjvschool.atracao.model.cadastro.Endereco;
import com.mjvschool.atracao.model.cadastro.Pais;
import com.mjvschool.atracao.model.cadastro.Pessoa;
import com.mjvschool.atracao.model.cadastro.Servico;
import com.mjvschool.atracao.model.contrato.Contrato;
import com.mjvschool.atracao.output.GeradorArquivo;
import com.mjvschool.atracao.repository.ContratoRepository;

public class AguaLuzAtracaoApp {
	private static ContratoRepository contratoRepositorio = new ContratoRepository();
	public static void main(String[] args) {
		faseAtracao();
		faseGeracaoArquivo();
	}
	private static void faseGeracaoArquivo() {
		List<Contrato> contratos =  contratoRepositorio.listarTodos();
		GeradorArquivo gerador = new GeradorArquivo();
		gerador.gerarArquivoCsv(contratos);
		//gerador.gerarArquivoTxt(contratos);
		
	}
	private static void faseAtracao() {
		Contrato contrato1 = new Contrato();
		contrato1.setNumeroProtocolo(1984365);
		contrato1.setServico(Servico.LUZ);
		
		Pessoa pessoa = new Pessoa();
		pessoa.setCpf("007.324.223.21");
		pessoa.setNome("Raimundo Nonato Loureiro Castelo Branco");
		pessoa.setCelular("98965498760");
		//pessoa.setRg("89789");
		pessoa.setPais(Pais.BRASIL);
		
		
		Endereco endereco = new Endereco();
		endereco.setBairro("São Sebastião");
		endereco.setCep("07.210.715");
		endereco.setCidade("São Raimundo Nonato");
		endereco.setEstado("Sp");
		endereco.setLogradouro("Rua Sebastião Firmino");
		endereco.setNumero("123");
		endereco.setComplemento("AP 210 BL CENTAURO");
		pessoa.setEndereco(endereco);
		contrato1.setCadastro(pessoa);
		contrato1.setDataHora(new Date());
		
		contratoRepositorio.gravar(contrato1);
		
		
	}
}

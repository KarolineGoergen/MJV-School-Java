package com.mjvschool.atracao.output;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import com.mjvschool.atracao.model.contrato.Contrato;
import com.mjvschool.atracao.util.TextoUtil;

public class GeradorArquivo {
	public void gerarArquivoCsv(List<Contrato> contratos) {
		StringBuilder conteudo = new StringBuilder();
		for(Contrato ct: contratos) {
			conteudo.append(ct.getCadastro().getCpf().concat(";"));
			conteudo.append(ct.getCadastro().getNome().concat(";"));
			conteudo.append(ct.getCadastro().getCelular().concat(";"));
			conteudo.append(ct.getCadastro().getEndereco().getLogradouro().concat(";"));
			conteudo.append(ct.getCadastro().getEndereco().getNumero().concat(";"));
			conteudo.append(ct.getCadastro().getEndereco().getComplemento().concat(";"));
			conteudo.append(ct.getCadastro().getEndereco().getBairro().concat(";"));
			conteudo.append(ct.getCadastro().getEndereco().getCidade().concat(";"));
			conteudo.append(ct.getCadastro().getEndereco().getEstado().concat(";"));
			conteudo.append(ct.getCadastro().getEndereco().getCep().concat(";"));
			conteudo.append(ct.getNumeroProtocolo());
			conteudo.append(";");
			conteudo.append(ct.getData());
			conteudo.append(";");
			conteudo.append(ct.getHora());
			conteudo.append(";");
			conteudo.append(ct.getServico().getNome());
			conteudo.append(";");
			conteudo.append(ct.getServico().getValor());
			conteudo.append("\n");
		}
		
		System.out.println(conteudo.toString());
		
		File output = new File("C:\\MJV-School-Java\\agua-luz-output");
		if(!output.exists())
			output.mkdirs();
		
		Path path = Paths.get("C:\\MJV-School-Java\\agua-luz-output\\agua-luz-contratos.csv");

		try {
			Files.write(path, conteudo.toString().getBytes(StandardCharsets.UTF_8));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/*
	public void gerarArquivoTxt(List<Contrato> contratos) {
		StringBuilder conteudo =new StringBuilder();
		
		for(Contrato ct: contratos) {
			conteudo.append(ct.getCadastro().getCpf());
			conteudo.append(TextoUtil.ajustar(ct.getCadastro().getNome(), 30) );
			conteudo.append(ct.getCadastro().getCelular());
			conteudo.append("\n");
		}
		
		System.out.println(conteudo.toString());
		
		File output = new File("C:\\estudo\\mjv-java-school\\agua-luz-output");
		if(!output.exists())
			output.mkdirs();
		
		Path path = Paths.get("C:\\estudo\\mjv-java-school\\agua-luz-output\\agua-luz-contratos.txt");

		try {
			Files.write(path, conteudo.toString().getBytes(StandardCharsets.UTF_8));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
}

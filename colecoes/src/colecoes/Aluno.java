package colecoes;

public class Aluno implements Comparable<Aluno> {
	private String nome;
	private String cpf;
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public Aluno(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + "]";
	}
	@Override
	public int compareTo(Aluno o) {
		return this.nome.compareTo(o.nome);
	}
	
}

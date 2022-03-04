package colecoes;

public class ExemploArrays {
	public static void main(String[] args) {
		Aluno [] alunos = {new Aluno("aloisio"),new Aluno("marcelle"),new Aluno("viviane")} ;
		
		System.out.println("Numero de elementos é" + alunos.length);
		
		for(int x=0;x<alunos.length;x++) {
			Aluno aluno = alunos [x];
			System.out.println("x=" + x + " -> " + aluno);
		}
		
	}
}

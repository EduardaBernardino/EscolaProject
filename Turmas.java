package d1_escola;

public class Turmas extends Pessoa{
	private String cod_Turma;
	private int qtd_alunos;
	
	
	public Turmas(String nome, String cpf, int idade, String cod_turma, int qtd_alunos) {
		super(nome, cpf, idade);
		this.cod_Turma = cod_Turma;
		this.qtd_alunos = qtd_alunos;
	}

	 public String getCodigoTurma() {
	        return cod_Turma;
	}
	 public int Qtd_Alunos() {
		 	return qtd_alunos;
	 }

	@Override
	public void exibirInformacoes() {
		System.out.println("Turma: " + cod_Turma);
        System.out.println("Quantidade de Alunos: " + qtd_alunos);
        System.out.println("Professor responsável: " + nome); 
    
		
	}

}

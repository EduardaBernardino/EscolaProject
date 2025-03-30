package d1_escola;

public class Aluno extends Pessoa{
	private String n_matricula;
	private String turma;
	private int semestre;


	public Aluno(String nome, String cpf, int idade, String n_matricula, String turma, int semestre) {
		super(nome, cpf, idade);
		this.n_matricula = n_matricula;
		this.semestre = semestre;
		this.turma = turma;
	}
	
	public String getMatricula() {
		return n_matricula;
		
	}
	public String getturma() {
		return turma;
	}
	 public void setTurma(String turma) {
	        this.turma = turma;
}

	@Override
	public void exibirInformacoes() {
		System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade);
        System.out.println("Número de Matrícula: " + n_matricula);
        System.out.println("Turma: " + turma);
        System.out.println("Semestre: " + semestre);
		
	}
}

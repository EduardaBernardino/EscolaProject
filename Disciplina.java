package d1_escola;

public class Disciplina extends Pessoa {
	private String nome_materia;
	private String cod;

	public Disciplina(String nome, String cpf, int idade, String nome_materia, String cod) {
		super(nome, cpf, idade);
		this.cod = cod;
		this.nome_materia = nome_materia;
	
	}

	 public String getNome() {
	        return nome_materia;
	}
	 public void setNome(String nome_materia) {
	        this.nome_materia = nome_materia;
}

	 public String getCodigo() {
	        return cod;
}
	 public void setCod(String cod) {
	        this.cod = cod;
}


	@Override
	public void exibirInformacoes() {
		System.out.println("Disciplina: " + nome_materia + ", Código: " + cod);		
	}
}

	
	 
	        
	        
	        
	       

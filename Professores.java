package d1_escola;

public class Professores extends Pessoa{
	private String Certificacoes;
	private double salario;
	private String Especializacoes;
	
	public Professores(String nome, String cpf, int idade, String Certificacoes, double salario, String Especializacoes) {
		super(nome, cpf, idade);
		this.Certificacoes = Certificacoes;
		this.Especializacoes = Especializacoes;
		this.salario = salario;
	}


	
    public String getEspecializacoes() {
        return Especializacoes;		
	}
    public void setEspecializacoes(String Especializacoes) {
       this.Especializacoes = Especializacoes;
}
    
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }



	@Override
	public void exibirInformacoes() {
		System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade);
        System.out.println("Certificações: " + Certificacoes);
        System.out.println("Especializações: " + Especializacoes);
        System.out.println("Salário: R$ " + salario);
		
	}
}

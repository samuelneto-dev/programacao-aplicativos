package hospital;

public abstract class Medico {

	private String nome;
	private String CRM;
	private int idade;
	private double salario;

	public Medico(String nome, String cRM, int idade, double salario) {
		super();
		this.nome = nome;
		CRM = cRM;
		this.idade = idade;
		this.salario = salario;
	}

	
	public abstract boolean medicoAposentado();

	
	public double valorAposentadoria() {
		return salario * 0.8;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [nome=" + nome + ", CRM=" + CRM + ", idade=" + idade + ", salario="
				+ salario + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCRM() {
		return CRM;
	}

	public void setCRM(String cRM) {
		CRM = cRM;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
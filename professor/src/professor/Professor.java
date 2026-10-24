package professor;

public abstract class Professor {

	private String matricula;
	private String nome;
	private int horasSemanais;
	private double salarioBase;
	
	
	public Professor(String matricula, String nome, int horasSemanais, double salarioBase) {
		this.matricula = matricula;
		this.nome = nome;
		this.horasSemanais = horasSemanais;
		this.salarioBase = salarioBase;
	}
	
	public boolean elegivelAfastamento() {
        return this.horasSemanais >= 40;
	}
	
	public double calcularSalarioFinal() {
	    return this.salarioBase * this.horasSemanais * 4;
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getHorasSemanais() {
		return horasSemanais;
	}
	public void setHorasSemanais(int horasSemanais) {
		this.horasSemanais = horasSemanais;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
}

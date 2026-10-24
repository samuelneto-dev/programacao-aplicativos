package hospital;

public class MedicoCirurgiao extends Medico {

	public MedicoCirurgiao(String nome, String cRM, int idade, double salario) {
		super(nome, cRM, idade, salario);
	}

	
	@Override
	public boolean medicoAposentado() {
		return getIdade() > 50;
	}

	
	@Override
	public double valorAposentadoria() {
		return super.valorAposentadoria() + 800;
	}

}
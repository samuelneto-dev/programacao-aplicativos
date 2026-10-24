package hospital;

public class MedicoAuxiliar extends Medico {

	public MedicoAuxiliar(String nome, String cRM, int idade, double salario) {
		super(nome, cRM, idade, salario);
	}

	
	@Override
	public boolean medicoAposentado() {
		return getIdade() > 60;
	}



}
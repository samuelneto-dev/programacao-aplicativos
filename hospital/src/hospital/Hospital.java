package hospital;

import java.util.ArrayList;

public class Hospital {


	private ArrayList<Medico> medicos = new ArrayList<Medico>();

	public ArrayList<Medico> getMedicos() {
		return medicos;
	}

	public boolean adicionarMedico(Medico medico) {
		if (medico == null || buscarMedico(medico.getCRM()) != null) {
			return false; 
		}
		return medicos.add(medico);
	}

	public Medico buscarMedico(String crm) {
		for (Medico m : medicos) {
			if (m.getCRM().equalsIgnoreCase(crm.trim())) {
				return m;
			}
		}
		return null;
	}

	public boolean removerMedico(String crm) {
		Medico medico = buscarMedico(crm);
		if (medico == null) {
			return false;
		}
		return medicos.remove(medico);
	}

	public int totalMedicos() {
		return medicos.size();
	}

}
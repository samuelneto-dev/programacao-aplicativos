package sistemaGestaoFrota;

import java.util.ArrayList;

public class GestaoFrota implements IOperacoes {

	ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();

	@Override
	public boolean adicionarVeiculo(Veiculo v) {
		if (buscarVeiculo(v.getPlaca()) == null) {
			veiculos.add(v);
			return true;
		} else {
			System.out.println("Ja existe um veiculo com essa placa!");
			return false;
		}
	}

	@Override
	public boolean removerVeiculo(String cod) {
		if(buscarVeiculo(cod) == null) {
			return false;
		}else {
			veiculos.removeIf(n -> n.getPlaca().equalsIgnoreCase(cod));
		}
		return true;
	}

	@Override
	public Veiculo buscarVeiculo(String cod) {
		for (Veiculo v : veiculos) {
			if(v.getPlaca().equalsIgnoreCase(cod)) {
				return v;
			}
			
		}
		return null;
	}

	@Override
	public ArrayList<Veiculo> buscarVeiculoCategoria(CategoriasVeiculos categoria) {
		ArrayList<Veiculo> encontrados = new ArrayList<Veiculo>();
		for (Veiculo v : veiculos) {
			if(v.getCategoria() == categoria) {
				encontrados.add(v);
			}
			
		}
		return encontrados;
	}

	@Override
	public void atualizarValorDiario(String cod, double valor) {
		if(buscarVeiculo(cod)==null) {
			System.out.println("Veiculo inexistente!");
		}else {
			buscarVeiculo(cod).setValorLocacao(valor);
		}
	}

	@Override
	public void listarVeiculos() {
		for (Veiculo v : veiculos) {
			v.fichaTecnica();
			System.out.println();
		}
	}

}
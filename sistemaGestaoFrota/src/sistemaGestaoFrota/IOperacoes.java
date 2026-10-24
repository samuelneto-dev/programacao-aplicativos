package sistemaGestaoFrota;

import java.util.ArrayList;

public interface IOperacoes {

	public boolean adicionarVeiculo(Veiculo v);
	public boolean removerVeiculo(String cod);
	public Veiculo buscarVeiculo(String cod);
	public ArrayList<Veiculo> buscarVeiculoCategoria(CategoriasVeiculos categoria);
	public void atualizarValorDiario(String cod, double valor);
	public void listarVeiculos();
	
}
package sistemaGestaoFrota;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro("ABC-1234", "Civic", "Honda", 250.00, CategoriasVeiculos.CARRO, EstadoVeiculo.DISPONIVEL, 450, "Flex");
		Carro carro2 = new Carro("DEF-5678", "Model 3", "Tesla", 400.00, CategoriasVeiculos.CARRO, EstadoVeiculo.EM_MANUTENCAO, 425, "Eletrico");
		Caminhao caminhao = new Caminhao("GHI-9012", "FH 540", "Volvo", 1250.00, CategoriasVeiculos.CAMINHAO, EstadoVeiculo.EM_TRANSITO, 25.0, "3");
		
		System.out.println("Total de veiculos criados: " + Veiculo.getContadorVeiculos());
		System.out.println();
		
		GestaoFrota frota = new GestaoFrota();
		frota.adicionarVeiculo(carro1);
		frota.adicionarVeiculo(carro2);
		frota.adicionarVeiculo(caminhao);
		
		System.out.println("--- FROTA COMPLETA ---");
		frota.listarVeiculos();
		
		
		System.out.println("--- BUSCA: CATEGORIA CARRO ---");
		ArrayList<Veiculo> carros = frota.buscarVeiculoCategoria(CategoriasVeiculos.CARRO);
		for (Veiculo v : carros) {
			v.fichaTecnica();
			System.out.println();
		}
		
		frota.atualizarValorDiario("ABC-1234", 300.00);
		frota.removerVeiculo("DEF-5678");
		
		System.out.println("--- FROTA APOS ALTERACOES ---");
		frota.listarVeiculos();
		
		System.out.println("Nova diaria do ABC-1234: " + Veiculo.formatarMoeda(frota.buscarVeiculo("ABC-1234").getValorLocacao()));

	}

}
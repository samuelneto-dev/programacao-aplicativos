package sistemaGestaoFrota;

public class Caminhao extends Veiculo {

	private double capacidadeCarga;
	private String numeroEixos;
	
	
	
	public double getCapacidadeCarga() {
		return capacidadeCarga;
	}
	public void setCapacidadeCarga(double capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}
	public String getNumeroEixos() {
		return numeroEixos;
	}
	public void setNumeroEixos(String numeroEixos) {
		this.numeroEixos = numeroEixos;
	}
	
	public Caminhao(String placa, String modelo, String marca, double valorLocacao, CategoriasVeiculos categoria, EstadoVeiculo estado, double capacidadeCarga, String numeroEixos) {
		super(placa, modelo, marca, valorLocacao, categoria, estado);
		this.capacidadeCarga = capacidadeCarga;
		this.numeroEixos = numeroEixos;
	}
	@Override
	public void fichaTecnica() {
		System.out.println("=== Ficha tecnica ===");
		System.out.println("Placa do caminhão: " + getPlaca());
		System.out.println("Modelo do caminhão: " + getModelo());
		System.out.println("Marca do caminhão: " + getMarca());
		System.out.println("Valor da locação: " + formatarMoeda(getValorLocacao()));
		System.out.println("Categoria do caminhão: " + getCategoria());
		System.out.println("Estado do veiculo: " + getEstado());
		System.out.println("Capacidade de carga: " +getCapacidadeCarga());
		System.out.println("Numero de eixos: " + getNumeroEixos());
		
	}
	
}
package sistemaGestaoFrota;

public class Carro extends Veiculo {

	private double capacidadePortaMalas;
	private String tipoCombustivel;
	
	public double getCapacidadePortaMalas() {
		return capacidadePortaMalas;
	}
	public void setCapacidadePortaMalas(double capacidadePortaMalas) {
		this.capacidadePortaMalas = capacidadePortaMalas;
	}
	public String getTipoCombustivel() {
		return tipoCombustivel;
	}
	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
	
	public Carro(String placa, String modelo, String marca, double valorLocacao, CategoriasVeiculos categoria, EstadoVeiculo estado, double capacidadePortaMalas, String tipoCombustivel) {
		super(placa, modelo, marca, valorLocacao, categoria, estado);
		this.capacidadePortaMalas = capacidadePortaMalas;
		this.tipoCombustivel = tipoCombustivel;
	}
	
	@Override
	public void fichaTecnica() {
		System.out.println("=== Ficha tecnica ===");
		System.out.println("Placa do carro: " + getPlaca());
		System.out.println("Modelo de carro: " + getModelo());
		System.out.println("Marca do carro: " + getMarca());
		System.out.println("Valor da locação: " + formatarMoeda(getValorLocacao()));
		System.out.println("Categoria do carro: " + getCategoria());
		System.out.println("Estado do veiculo: " + getEstado());
		System.out.println("Capacidade do porta malas: " + getCapacidadePortaMalas());
		System.out.println("Tipo de combustivel: " + getTipoCombustivel());
		
		
	}
}
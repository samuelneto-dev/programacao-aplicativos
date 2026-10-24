package sistemaGestaoFrota;

import java.util.Locale;

public abstract class Veiculo {

	private static int contadorVeiculos = 0;

	private String placa;
	private String modelo;
	private String marca;
	private double valorLocacao;
	private CategoriasVeiculos categoria;
	private EstadoVeiculo estado;

	public Veiculo(String placa, String modelo, String marca, double valorLocacao, CategoriasVeiculos categoria, EstadoVeiculo estado) {
		setPlaca(placa);
		this.modelo = modelo;
		this.marca = marca;
		setValorLocacao(valorLocacao);
		setCategoria(categoria);
		setEstado(estado);
		contadorVeiculos++;
	}

	public static int getContadorVeiculos() {
		return contadorVeiculos;
	}

	public static String formatarMoeda(double valor) {
		return String.format(Locale.forLanguageTag("pt-BR"), "R$ %,.2f", valor);
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		if (placa == null || placa.isEmpty()) {
			throw new IllegalArgumentException("Placa nulo ou vazia!");
		} else {
			this.placa = placa;
		}
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getValorLocacao() {
		return valorLocacao;
	}

	public void setValorLocacao(double valorLocacao) {
		if (valorLocacao > 0) {
			this.valorLocacao = valorLocacao;
		} else {
			throw new IllegalArgumentException("Valor invalido!");
		}
	}

	public CategoriasVeiculos getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriasVeiculos categoria) {
		if (categoria == null) {
			throw new IllegalArgumentException("Categoria nula!");
		}
		this.categoria = categoria;
	}

	public EstadoVeiculo getEstado() {
		return estado;
	}

	public void setEstado(EstadoVeiculo estado) {
		if (estado == null) {
			throw new IllegalArgumentException("Estado nulo!");
		}
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Veiculo [placa=" + placa + ", modelo=" + modelo + ", marca=" + marca + ", valorLocacao=" + valorLocacao
				+ ", categoria=" + categoria + ", estado=" + estado + "]";
	}

	public abstract void fichaTecnica();


}
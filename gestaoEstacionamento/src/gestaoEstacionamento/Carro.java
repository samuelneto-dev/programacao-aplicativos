package gestaoEstacionamento;

public class Carro extends Veiculos {
    private TipoVeiculoEnum tipo;

    public Carro(String placa, int horasEstacionado) {
        super(placa, horasEstacionado);
        this.tipo = TipoVeiculoEnum.CARRO;
    }

    public TipoVeiculoEnum getTipo() {
        return tipo;
    }

    @Override
    public double calcularValorTotal() {
        return getHorasEstacionado() * 10.0;
    }

    @Override
    public String toString() {
        return "[Tipo: " + tipo + "] " + super.toString();
    }
}

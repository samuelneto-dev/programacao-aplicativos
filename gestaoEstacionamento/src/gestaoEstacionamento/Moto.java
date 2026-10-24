package gestaoEstacionamento;

public class Moto extends Veiculos {
    private TipoVeiculoEnum tipo;

    public Moto(String placa, int horasEstacionado) {
        super(placa, horasEstacionado);
        this.tipo = TipoVeiculoEnum.MOTO;
    }

    public TipoVeiculoEnum getTipo() {
        return tipo;
    }

    @Override
    public double calcularValorTotal() {
        return getHorasEstacionado() * 5.0;
    }

    @Override
    public String toString() {
        return "[Tipo: " + tipo + "] " + super.toString();
    }
}

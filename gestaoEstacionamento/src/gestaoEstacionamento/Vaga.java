package gestaoEstacionamento;

public class Vaga {
    private int numero;
    private Veiculos veiculo;

    public Vaga(int numero, Veiculos veiculo) {
        this.numero = numero;
        this.veiculo = veiculo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Veiculos getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculos veiculo) {
        this.veiculo = veiculo;
    }

    @Override
    public String toString() {
        return "Vaga N° " + numero + " -> " + (veiculo != null ? veiculo.toString() : "Livre");
    }
}

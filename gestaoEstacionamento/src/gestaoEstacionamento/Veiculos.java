package gestaoEstacionamento;

public abstract class Veiculos implements IValidade {
    private String placa;
    private int horasEstacionado;
    private static int totalVeiculosAtendidos = 0;

    public Veiculos(String placa, int horasEstacionado) {
        setPlaca(placa);
        this.horasEstacionado = horasEstacionado;
        totalVeiculosAtendidos++;
    }

    public static int getTotalVeiculosAtendidos() {
        return totalVeiculosAtendidos;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if (placa != null && placa.length() == 7) {
            this.placa = placa;
        } else {
            System.out.println("Erro: A placa deve ter exatamente 7 caracteres. Placa '" + placa + "' rejeitada.");
        }
    }

    public int getHorasEstacionado() {
        return horasEstacionado;
    }

    public void setHorasEstacionado(int horasEstacionado) {
        this.horasEstacionado = horasEstacionado;
    }

    @Override
    public boolean validarPlaca() {
        return this.placa != null && this.placa.length() == 7;
    }

    public abstract double calcularValorTotal();

    @Override
    public String toString() {
        return String.format("Placa: %s | Horas: %d | Valor a Pagar: R$ %.2f",
                (placa != null ? placa : "INVÁLIDA"), horasEstacionado, calcularValorTotal());
    }
}

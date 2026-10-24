package gestaoEstacionamento;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== CADASTRANDO VEÍCULOS ===");
        Carro carro1 = new Carro("ABC1D23", 3);
        Moto moto1 = new Moto("XYZ9876", 4);

        System.out.println("\n=== TESTANDO VALIDAÇÃO DE PLACA (SETTER) ===");
        System.out.println("Placa atual do carro: " + carro1.getPlaca());
        
        System.out.print("Tentando alterar a placa para 'ABC': ");
        carro1.setPlaca("ABC");
        System.out.println("Placa mantida: " + carro1.getPlaca());

        System.out.print("Tentando alterar a placa para 'JKL8901': ");
        carro1.setPlaca("JKL8901");
        System.out.println("Nova placa: " + carro1.getPlaca());

        System.out.println("\n=== GERENCIANDO VAGAS E ESTACIONAMENTO ===");
        Estacionamento estacionamento = new Estacionamento("Park Central");

        Vaga vaga1 = new Vaga(101, carro1);
        Vaga vaga2 = new Vaga(102, moto1);

        estacionamento.estacionar(vaga1);
        estacionamento.estacionar(vaga2);

        estacionamento.listarVagas();

        System.out.println("\n=== ATRIBUTO / MÉTODO STATIC ===");
        System.out.println("Total de veículos cadastrados no sistema: " + Veiculos.getTotalVeiculosAtendidos());
    }
}

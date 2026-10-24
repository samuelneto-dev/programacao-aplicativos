package gestaoEstacionamento;

import java.util.ArrayList;
import java.util.List;

public class Estacionamento {
    private String nome;
    private List<Vaga> vagas;

    public Estacionamento(String nome) {
        this.nome = nome;
        this.vagas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void estacionar(Vaga vaga) {
        this.vagas.add(vaga);
    }

    public void listarVagas() {
        System.out.println("\n=== VAGAS OCUPADAS - ESTACIONAMENTO " + nome.toUpperCase() + " ===");
        if (vagas.isEmpty()) {
            System.out.println("Nenhuma vaga ocupada no momento.");
        } else {
            for (Vaga vaga : vagas) {
                System.out.println(vaga);
            }
        }
    }
}

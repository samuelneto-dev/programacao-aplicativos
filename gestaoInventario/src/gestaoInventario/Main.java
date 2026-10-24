package gestaoInventario;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produto> inventario = new ArrayList<>();

        try {
            Smartphone phone = new Smartphone(
                "SM-001", "Galaxy S23", "Samsung", 4200.00, 
                EstadoProduto.NOVO, 3900, 256
            );

            Laptop laptop = new Laptop(
                "LP-001", "MacBook Air M2", "Apple", 8500.00, 
                EstadoProduto.RECONDICIONADO, 15, "Apple M2"
            );

            inventario.add(phone);
            inventario.add(laptop);

            for (Produto p : inventario) {
                p.exibirFichaTecnica();
            }


            Smartphone produtoInvalido = new Smartphone(
                "", "Phone Inválido", "Marca X", -100.00, 
                EstadoProduto.NOVO, 4000, 128
            );

        } catch (IllegalArgumentException e) {
            System.err.println("Erro ao cadastrar produto: " + e.getMessage());
        }
    }
}
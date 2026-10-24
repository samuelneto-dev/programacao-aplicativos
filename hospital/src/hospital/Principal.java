package hospital;

import java.util.Scanner;

public class Principal {

	static Scanner sc = new Scanner(System.in);
	static Hospital hospital = new Hospital();

	public static void main(String[] args) {

		int opcao = 0;

		do {
			System.out.println("\n===== SISTEMA DE GESTAO HOSPITALAR =====");
			System.out.println("1 - Cadastrar Medico");
			System.out.println("2 - Buscar Medico pelo CRM");
			System.out.println("3 - Remover Medico pelo CRM");
			System.out.println("4 - Listar Todos os Medicos");
			System.out.println("5 - Sair");
			System.out.print("Escolha uma opcao: ");

			opcao = Integer.parseInt(sc.nextLine());

			switch (opcao) {
			case 1:
				cadastrarMedico();
				break;
			case 2:
				buscarMedico();
				break;
			case 3:
				removerMedico();
				break;
			case 4:
				listarMedicos();
				break;
			case 5:
				System.out.println("\nEncerrando o sistema...");
				break;
			default:
				System.out.println("\nOpcao invalida! Digite um numero de 1 a 5.");
			}

		} while (opcao != 5);

		sc.close();
	}

	public static void cadastrarMedico() {

		System.out.println("\n--- CADASTRO DE MEDICO ---");
		System.out.println("1 - Medico Cirurgiao");
		System.out.println("2 - Medico Auxiliar");
		System.out.print("Tipo do medico: ");
		int tipo = Integer.parseInt(sc.nextLine());

		if (tipo != 1 && tipo != 2) {
			System.out.println("Tipo invalido! Cadastro cancelado.");
			return;
		}

		System.out.print("Nome: ");
		String nome = sc.nextLine();

		System.out.print("CRM: ");
		String crm = sc.nextLine();

		System.out.print("Idade: ");
		int idade = Integer.parseInt(sc.nextLine());

		System.out.print("Salario: ");
		double salario = Double.parseDouble(sc.nextLine().replace(",", "."));

		
		Medico medico;

		if (tipo == 1) {
			medico = new MedicoCirurgiao(nome, crm, idade, salario);
		} else {
			medico = new MedicoAuxiliar(nome, crm, idade, salario);
		}

		if (hospital.adicionarMedico(medico)) {
			System.out.println("Medico cadastrado com sucesso!");
		} else {
			System.out.println("Ja existe um medico cadastrado com o CRM " + crm + ".");
		}
	}

	public static void buscarMedico() {

		System.out.println("\n--- BUSCAR MEDICO ---");
		System.out.print("Informe o CRM: ");
		String crm = sc.nextLine();

		Medico medico = hospital.buscarMedico(crm);

		if (medico == null) {
			System.out.println("Nenhum medico encontrado com o CRM " + crm + ".");
			return;
		}

		exibirMedico(medico);
	}

	public static void removerMedico() {

		System.out.println("\n--- REMOVER MEDICO ---");
		System.out.print("Informe o CRM: ");
		String crm = sc.nextLine();

		if (hospital.removerMedico(crm)) {
			System.out.println("Medico removido com sucesso!");
		} else {
			System.out.println("Nenhum medico encontrado com o CRM " + crm + ".");
		}
	}

	public static void listarMedicos() {

		System.out.println("\n--- MEDICOS CADASTRADOS ---");

		if (hospital.totalMedicos() == 0) {
			System.out.println("Nenhum medico cadastrado.");
			return;
		}

		for (Medico m : hospital.getMedicos()) {
			exibirMedico(m);
		}

		System.out.println("Total: " + hospital.totalMedicos() + " medico(s).");
	}

	public static void exibirMedico(Medico medico) {
		System.out.println("\n" + medico);
		System.out.println("Aposentado: " + (medico.medicoAposentado() ? "SIM" : "NAO"));
		System.out.printf("Valor da aposentadoria: R$ %.2f%n", medico.valorAposentadoria());
	}

}
package application;

import java.util.Scanner;

import entities.RacasGran;
import entities.RacasMed;
import entities.RacasPeq;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char answer = 's';
		while (answer == 's') {
			System.out.println("Qual o porte do seu cachorro?");
			System.out.println("1) Pequeno" + "\n2) Médio" + "\n3) Grande");

			int porte = sc.nextInt();

			if (porte == 1) {
				RacasPeq racaMed = new RacasPeq();
				System.out.println("Qual a raça do seu cachorro?");
				System.out.println(racaMed);
				int raca = sc.nextInt();
				System.out.println("Qual a idade do seu cachorro?");
				double idade = sc.nextDouble();
				double idadeCao = racaMed.idadeCao(idade, raca);
				if (idade <= 2) {
					idadeCao = idade * 12.5;
					System.out.printf("O seu cachorro tem %.1f em anos humanos.", idadeCao);
				} else {
					System.out.printf("O seu cachorro tem %.1f em anos humanos.", idadeCao);
				}
			} else if (porte == 2) {
				RacasMed racaMed = new RacasMed();
				System.out.println("Qual a raça do seu cachorro?");
				System.out.println(racaMed);
				int raca = sc.nextInt();
				System.out.println("Qual a idade do seu cachorro?");
				double idade = sc.nextDouble();
				double idadeCao = racaMed.idadeCao(idade, raca);
				if (idade <= 2) {
					idadeCao = idade * 10.5;
					System.out.printf("O seu cachorro tem %.1f em anos humanos.", idadeCao);
				} else {
					System.out.printf("O seu cachorro tem %.1f em anos humanos.", idadeCao);
				}
			} else if (porte == 3) {
				RacasGran racaGran = new RacasGran();
				System.out.println("Qual a raça do seu cachorro?");
				System.out.println(racaGran);
				int raca = sc.nextInt();
				System.out.println("Qual a idade do seu cachorro?");
				double idade = sc.nextDouble();
				double idadeCao = racaGran.idadeCao(idade, raca);
				if (idade <= 2) {
					idadeCao = idade * 9;
					System.out.printf("O seu cachorro tem %.1f em anos humanos.", idadeCao);
				} else {
					System.out.printf("O seu cachorro tem %.1f em anos humanos.", idadeCao);
				}
			}
			System.out.println("\nDeseja ver a idade de um cachorro novamente? (s/n)");
			answer = sc.next().charAt(0);
		}

		sc.close();

	}

}

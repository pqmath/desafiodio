package project;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String nome;
		Integer agencia, conta;
		Integer saldo = 200;

		System.out.print("Nome de usuário: ");
		nome = sc.nextLine();

		System.out.print("Número da agência: ");
		agencia = sc.nextInt();

		System.out.print("Número da conta: ");
		conta = sc.nextInt();

		System.out.printf(
				"Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque!",
				nome, agencia, conta, saldo);

		sc.close();
	}
}

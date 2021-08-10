package com.cadastro.login;

import java.util.Scanner;

import entities.Account;

public class Java1st {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Entre com o número da conta: ");
		int number = sc.nextInt();
		System.out.print("Entre com o proprietário da conta: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Iniciar com um depósito inicial (s/n)? ");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.print("Entre com um valor de depósito inicial: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		}
		else {
			account = new Account(number, holder);
		}
		
		System.out.println();
		System.out.println("Dados da conta:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Entre com um valor de depósito: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Dados da conta atualizados:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Entre com um valor de saque: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Dados da conta atualizados:");
		System.out.println(account);
		
		sc.close();
	}
}
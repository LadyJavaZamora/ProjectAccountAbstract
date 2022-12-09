package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.AccountAbstrata;
import entities.BusinessAccountAbs;
import entities.SavingsAccountAbs;

public class ProgramAccountAbstract {

	public static void main(String[] args) {
	//Totalizando o saldo de todas as contas
      
		Locale.setDefault(Locale.US);
		List<AccountAbstrata> lista = new ArrayList<>(); //Instancia lista de contas
		
		//Popula lista de contas
		lista.add(new SavingsAccountAbs(1001, "Alex", 500.00, 0.01));
		lista.add(new BusinessAccountAbs(1002, "Maria", 1000.0, 400.0));
		lista.add(new SavingsAccountAbs(1004, "Bob", 300.0, 0.01));
		lista.add(new BusinessAccountAbs(1005, "Anna", 500.0, 500.0));
		
		//Mostrar o numero e o saldo das contas
		for (AccountAbstrata acc : lista) {
			System.out.printf("Balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}
		
		//Percorre a lista totalizando o saldo
		double sum = 0.0;
		for (AccountAbstrata acc : lista) {
			sum += acc.getBalance();
		}
		
		//Imprime o saldo
		System.out.printf("Total balance: %.2f%n", sum);
		
		//Depositar 10.00 nas quatro contas
		for (AccountAbstrata acc : lista) {
			acc.deposit(10.0);
		}
		
		//Para cada conta, imprimir o número da conta e o novo total
		for (AccountAbstrata acc : lista) {
			System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}
		
		//Novo saldo total das quatro contas
		double sum2 = 0.0;
		for (AccountAbstrata acc : lista) {
			sum2 += acc.getBalance();
		}
		
		//Imprime o novo saldo total
		System.out.printf("New Total balance: %.2f%n", sum2);
	}
}

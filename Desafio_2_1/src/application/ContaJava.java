package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;
import entities.ContaPoupanca;

public class ContaJava {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//declarei os objetos cb e cp
		ContaBancaria cb;
		ContaPoupanca cp = null;
		
		System.out.println("----------------------------------------");
		System.out.println("----------Bem vindos a Agência----------");
		System.out.println("----------------------------------------");
		System.out.print("Cadastro");
		System.out.println();
		System.out.print("Digite seu nome: ");
		String cliente = sc.next();
		System.out.print("Digite o número da conta: ");
		int numConta = sc.nextInt();
		System.out.print("Deseja entrar com uma quantia inicial (s/n)? ");
		char resposta = sc.next().charAt(0);
		if( resposta == 's') {
			System.out.print("Informe a quantia que deseja iniciar:R$ ");
			double quantiaInicial = sc.nextDouble();
			
			//instanciação do objeto cb recebendo o construtor de 3 argumentos	
			cb = new ContaBancaria(cliente, numConta, quantiaInicial);
		}
		else {
			
			//instanciação do obejto cb recebendo um construtor de 2 argumentos
			cb = new ContaBancaria(cliente, numConta);
		}
		System.out.println("----------------------------------------");
		
		System.out.println();
		System.out.println("Dados atualizados");
		
		//imprimir o objeto 
		System.out.println(cb);
		
		System.out.println("----------------------------------------");
		
		System.out.println();
		System.out.print("Depositar uma quantia:R$ ");
		double valorDepositado = sc.nextDouble();
		
		//chamei o objeto cb do método depositar, recebendo o valor depositado
		cb.depositar(valorDepositado);
		
		System.out.println("----------------------------------------");
		
		System.out.println("Dados atualizados");
		System.out.println(cb);
		
		System.out.println("----------------------------------------");
		
		System.out.println();
		System.out.print("Sacar uma quantia:R$ ");
		double valorSacado = sc.nextDouble();
		
		//chamei o objeto cb do método depositar, recebendo o valor sacado
		cb.sacar(valorSacado);
		
		System.out.println("----------------------------------------");
		
		System.out.println("Dados atualizados");
		System.out.println(cb);
		
		
		System.out.println();
		System.out.print("Deseja acessa a Conta Poupança (s/n)? ");
		char resp = sc.next().charAt(0);
		if ( resp == 's') {
			System.out.println("---------Conta Poupança----------");
			
			//instanciação do objeto cp recebendo o construtor de 3 argumentos	
			cp = new ContaPoupanca(cliente, numConta, 1000);
		}
		else {
			System.out.println("Sessão Finalizada!");
		}
		
		System.out.println();
		System.out.println("Dados atualizados");
		
		//imprimi o objeto cp
		System.out.println(cp);
		
		System.out.println();
		System.out.print("De quantos dias deseja saber o rendimento da conta? ");
		int qtdDias = sc.nextInt();
		//chamei o objeto cp do método calcularNovoSaldo, recebendo o valor quantidade de dias
		cp.calcularNovoSaldo(qtdDias);
		
		System.out.println("----------------------------------------");
		
		System.out.println("Dados atualizados");
		System.out.println(cp);
		
		sc.close();

	}

}

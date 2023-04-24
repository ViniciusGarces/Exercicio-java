package application;

import java.util.ArrayList;

import java.util.Scanner;

import entities.Bebidas;
import entities.Cafe;
import entities.Comida;
import entities.Hot_Dog;
import entities.Pedido;
import entities.Pizza;
import entities.Salgado;
import entities.Suco;
import entities.enums.Status_Pedido;

public class Main {

	// estanciação das lista, na qual o cliente irá adicionar os itens escolhidos ao realizar o pedido
	static ArrayList<Comida> comidaDisponivel = new ArrayList<>();
	static ArrayList<Bebidas> bebidaDisponivel = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//momento que o cliente decide realizar pedido ou sair
		while(true) {
			System.out.println("Bem vindo a lanchonete SIM SEM HORA");
			System.out.println("Digite (1) para REALIZAR PEDIDO ou (2) par SAIR");
			int opcao = sc.nextInt();
			switch(opcao) {
			case 1:
				realizarPedido();
				break;
			case 2:
				return;
			}
		}

	}
	
	// método que deveria mostrar o menu disponível para o cliente escolher 
	public static void Menu() {
		//estanciação do cosntrutor das comidas
		Hot_Dog hd = new Hot_Dog("Hot Dog", 10.00, "cheddar", "batata palha");
		Pizza pizza = new Pizza("Pizza", 15.00, "catupiry", "queijo", "molho de tomate");
		Salgado salgado = new Salgado("Salgado", 5.00, "coxinha");
		
		//estanciação das bebidas
		Suco suco = new Suco("Uva", "leite");
		Cafe cafe = new Cafe("leite");
		
		//lista que irá conter as comidas adicionas no pedido
		ArrayList<Comida> comidaDisponivel = new ArrayList<>();
		comidaDisponivel.add(hd);
		comidaDisponivel.add(pizza);
		comidaDisponivel.add(salgado);
		
		//lista que irá conter as bebidas adicionadas no pedido
		ArrayList<Bebidas> bebidaDisponivel = new ArrayList<>();
		bebidaDisponivel.add(cafe);
		bebidaDisponivel.add(suco);
	}
	//método realizar pedido
	public static void realizarPedido() {
		//instanciação do construtor da classe atributo
		Pedido cmd = new Pedido();
		System.out.println("Cliente: ");
		cmd.setCliente(sc.nextLine());
		int opcao = -1;
		while(true) {
			//deveria mostrar as comidadas disponiveis em forma de lista, acessando a lista. Size é um método que identifica quantos elementos estão armazenados na lista
			for(int i=0; i < comidaDisponivel.size(); i++) {
				 System.out.println(i + ")" + comidaDisponivel.get(i).getNomeComida());
			}
			//deveria mostrar as bebidas disponíveis em dorma de lista, acessando a lista
			for(int i=0; i < bebidaDisponivel.size(); i++) {
				 System.out.println(i + ")" + bebidaDisponivel.get(i).getTipoBebida());
			}
			System.out.println("Para encerrar a sessão digite (0)");
			opcao = sc.nextInt();
			if(opcao != 0) {
				//lista que contem as comidas e bebidas
				ArrayList<Comida> com= new ArrayList<>();
				ArrayList<Bebidas> beb = new ArrayList<>();
				
				//acessando a lista de comidas recebendo os itens escolhidos
				com = cmd.getItensEscolhidos();
				//acessando a lista de bebids, recebendo as bebidas escolhidas
				beb = cmd.getBebidasEscolhidas();
				System.out.println(com);
				System.out.println(beb);
				//lista comida, adiciona outras comidas do menu
				com.add(comidaDisponivel.get(opcao));
				//lista bebida, adiciona outras bebidas do menu
				beb.add(bebidaDisponivel.get(opcao));
				cmd.setItensEscolhidos(com);
				cmd.setBebidasEscolhidas(beb);
				
				// chamei a classe de enuns, retomando os status do pedido
				Status_Pedido sp = Status_Pedido.Processando_Pedido;
				Status_Pedido sp2 = Status_Pedido.Pedido_Realizado;
				
				System.out.println(sp);
				System.out.println(sp2);
			}
			else {
				break;
			}
		}
		//aciona a lista, chamando o metodo do valor a pagar;
		cmd.valorAPagar();
		
		//// chamei a classe de enuns, retomando os status do pedido
		Status_Pedido sp3 = Status_Pedido.Pedido_Realizado;
		
		System.out.println(sp3);
	}

}

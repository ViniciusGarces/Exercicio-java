package entities;

import java.util.ArrayList;

public class Pedido {

	//atributos
	public String cliente;
	public String endereco;
	
	//lista que irá adicionar os intens e bebidas escolhidos pelo cliente ao realizar pedido
	private ArrayList<Comida> itensEscolhidos;
	private ArrayList<Bebidas> bebidasEscolhidas;
	
	//construtor recebendo a lista que contém itens escolhidos pelo cliente ao realizar pedido
	public Pedido() {
		itensEscolhidos = new ArrayList<>();
	}

	// construtor com argumentos
	public Pedido(String cliente, String endereco, ArrayList<Comida> itensEscolhidos, ArrayList<Bebidas> bebidasEscolhidas) {
		super();
		this.cliente = cliente;
		this.endereco = endereco;
		this.itensEscolhidos = itensEscolhidos;
		this.bebidasEscolhidas = bebidasEscolhidas;
	}

	//métodos getters e setters
	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public ArrayList<Comida> getItensEscolhidos() {
		return itensEscolhidos;
	}

	public void setItensEscolhidos(ArrayList<Comida> itensEscolhidos) {
		this.itensEscolhidos = itensEscolhidos;
	}
	
	public ArrayList<Bebidas> getBebidasEscolhidas() {
		return bebidasEscolhidas;
	}

	public void setBebidasEscolhidas(ArrayList<Bebidas> bebidasEscolhidas) {
		this.bebidasEscolhidas = bebidasEscolhidas;
	}
	
	//método qeu declara o valor a ser pago pelo cliente. Contém um laço de repetição for que recebe a lista de itens escolhidos pelo cliente
	public void valorAPagar() {
		double total = 0.00;
		for(Comida cmd: itensEscolhidos) {
			total = cmd.getPreco();
		}
		System.out.println("Valor total a pagar: " + total);
	}
}

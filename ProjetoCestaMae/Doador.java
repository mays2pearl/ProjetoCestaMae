package ProjetoCestaMae;

import java.util.ArrayList;
import java.util.Scanner;

public class Doador extends Usuario { //classe que herda de usuario

	
	private int op;
	private int resposta;
	
	public Doador (String nome,String CPF,String endereco,int rendaFamiliar, int op) {
		
		super(nome, CPF, endereco, endereco, rendaFamiliar, op);
		
	}
	Scanner leia = new Scanner (System.in);
	
	ArrayList <Integer> doacoes = new ArrayList(); //array list que recebe as doações
	

	
	public void doacao(String getNome, String getCPF) //metodo doacao dentro dele tem uma condição, se true passa para switch case
	{
		System.out.println("\t\tBem-vindo ao sistema de doação Cesta Mãe! Doe como um amor de mãe!");
		
		System.out.println("Se deseja doar, digite 1");
		resposta = leia.nextInt();
		System.out.println("Digite seu nome");
		getNome = leia.next();
		System.out.println("Digite seu CPF");
		getCPF = leia.next();
		
		
		if (resposta == 1)
		{
			System.out.println("\nEscolha uma opção: ");
			System.out.println("\n(1) - Para doar 15 reais");
			System.out.println("\n(2) - Para doar 25 reais");
			System.out.println("\n(3) - Para doar 50 reais");
			System.out.println("\n(4) - Para doar outros valores");
			
			op = leia.nextInt();
			
			switch (op)
			{
			case 1: 
				doacoes.add(15);
				System.out.println("\nParabéns!! Você doou 15 reais!Sua doação é muito importante para nós!");
				break;
			case 2: 
				doacoes.add(25);
				System.out.println("\nParabéns!! Você doou 25 reais!Sua doação é muito importante para nós!");
				break;
			case 3: 
				doacoes.add(50);
				System.out.println("\nParabéns!! Você doou 50 reais!Sua doação é muito importante para nós!");
				break;
			case 4: 
				
				System.out.println("\nBanco Caixa Econômica cc 0002332 ag:1223");
				break;
				default:
					System.out.println("Opção inválida!");
			}
		}
	}
	
}

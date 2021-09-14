package ProjetoCestaMae;

import java.util.Scanner;

public class Principal {
	
		public static void main(String[] args) {
			
			Scanner leia = new Scanner (System.in);
			
			int resp;
			
			System.out.println("\nBem vindo a projeto Cesta mãe"); //menu para interagir com o usuario
			System.out.println("\nSelecione uma opção abaixo");
			System.out.println("\n(1)Para receber doação de cesta basica");
			System.out.println("\n(2)Para fazer uma doação");
			
			resp = leia.nextInt();
			
			if(resp == 1) {   //condição de beneficiario ou doador
				
				Usuario Novo = new Usuario("","","","",0,0); //metodos da classe Usuario
				Novo.validarRenda();
				Novo.login();
				
			}else if(resp == 2){
				
				Doador doadorNovo = new Doador("","","",0,0);//metodos da classe Doador
				doadorNovo.doacao("","");
			}
			
			

	}

}

package classMath.GeraMegaSena;

import java.util.Scanner;

public class simularJogoMega {

	public static void main(String[] args) {
	
	geraJogo gerarMega = new geraJogo();
	
	//Inicia classe para entradas do usuário
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("***********************************");
	System.out.println("*******MEGA-SENA AUTOMÁTICO********");
	System.out.println();
	System.out.println("Digite a quantidade de jogos que deseja realizar: ");
	
	// Recebe a entrada de dados e armazena na variável
	int quantidadeJogos = entrada.nextInt();
	
		
	for(int i = 0; i < quantidadeJogos; i++) {
		gerarMega.gerajogo();
	}
}
}

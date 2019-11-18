package classMath.GeraMegaSena;



public class geraJogo {
	
	geraNumeroValido numeroValido = new geraNumeroValido();
	int numeroArray;
	
	int[] jogo = new int[6];
	
	void gerajogo() {
		
		System.out.println("***************************************");
		System.out.println("*********MEGA-SENA AUTOMÁTICO**********");
		
		// Gera um número válido para cada posição do array
		for(int i = 0; i < jogo.length; i ++) {
			
			numeroArray = numeroValido.geraNumero();
			
				// Verifica se já existe um número igual no array
				for(int j = 0; j < jogo.length; j++) {
					if(jogo[j] == numeroArray) {
						numeroValido.geraNumero();
					}
				}
			
			jogo[i] = numeroArray;
			System.out.println("Numero: " + numeroArray);
		}
	}
	
}

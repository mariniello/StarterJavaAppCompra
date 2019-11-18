package classMath.GeraMegaSena;

public class geraNumeroValido {

	double  numero; 
	int numeroValido;
	
	
public int geraNumero(){
						
		numero = Math.round((Math.random() * 100));
		int numeroAleatorio = (int) numero;
		if(numeroAleatorio > 60 || numeroAleatorio == 0) {
			geraNumero();
		}else{
			numeroValido = numeroAleatorio;
		}
		return numeroValido;
		}
	
	
}

package interfaces.pagamento.operadoras;

import interfaces.pagamento.Autorizavel;
import interfaces.pagamento.Cartao;
import interfaces.pagamento.Operadora;

public class Redecard implements Operadora {

	public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
		return cartao.getNumeroCartao().startsWith("456") 
				&& autorizavel.getValorTotal() < 200;
	
}
}
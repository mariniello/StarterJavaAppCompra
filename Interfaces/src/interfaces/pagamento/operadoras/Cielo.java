package interfaces.pagamento.operadoras;

import interfaces.pagamento.Autorizavel;
import interfaces.pagamento.Cartao;
import interfaces.pagamento.Operadora;

public class Cielo implements Operadora {

	@Override
	public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
		return cartao.getNumeroCartao().startsWith("123") 
				&& autorizavel.getValorTotal() < 100;
		
	}

}

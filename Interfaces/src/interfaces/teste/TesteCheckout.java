package interfaces.teste;

import interfaces.caixa.Checkout;
import interfaces.caixa.Compra;
import interfaces.impressao.Impressora;
import interfaces.impressao.impressoras.ImpressoraHP;
import interfaces.pagamento.Cartao;
import interfaces.pagamento.Operadora;
import interfaces.pagamento.operadoras.Redecard;

public class TesteCheckout {

	public static void main(String[] args) {
		Operadora operadora = new Redecard();
		Impressora impressora = new ImpressoraHP();
		
		Cartao cartao = new Cartao();
		cartao.setNomeTitular("João M Couves");
		cartao.setNumeroCartao("456");
		
		Compra compra = new Compra();
		compra.setNomeCliente("João Mendonsa Couves");
		compra.setProduto("Sabonete");
		compra.setValorTotal(500);
		
		Checkout checkout = new Checkout(operadora, impressora);
		checkout.fecharCompra(compra, cartao);
		
	}
}

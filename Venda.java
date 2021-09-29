
public class Venda {
	private float valorTotal;
	private byte formaPagamento;
	
	
	public Venda(float valorTotal,float valorTotalDesc, byte formaPagamento) {
		this.valorTotal = valorTotal;
		this.formaPagamento = formaPagamento;
		
	
	}
	public float getValorTotal() {
		return this.valorTotal;
	}
	
	public float calcularValorFinal() {
		return this.getValorTotal() + this.calcularDesconto();
	}
	
	private float calcularDesconto() {
		switch(formaPagamento) {
		
		case 2:
			return this.valorTotal * 0.03f; 
		case 3:
			return this.valorTotal * 0.015f; 
		default:
			return this.valorTotal  * -0.1f;
		}
		
}
}

import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o valor total da venda");
		float totalDaVenda = teclado.nextFloat();
		
		System.out.println("escolha a forma de pagamento:");
		System.out.println("1 - á vista");
		System.out.println("2 - á prazo");
		System.out.println("3 - parcelado");
		byte formaPagamento = teclado.nextByte();
		teclado.close();
		
		Venda venda = new Venda(totalDaVenda,formaPagamento, formaPagamento);
		System.out.printf("o total a ser pago é de R$ %.2f",venda.calcularValorFinal());


	}

}

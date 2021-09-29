import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Estatistica calc = new Estatistica();
		
		System.out.println("Para saber a taxa de Natalidade ou Mortalidade, adicione o valor pertencente a cada um:");
		System.out.println("caso nao saiba adicione : 0");
		
		
		System.out.println("Digite o número de crianças nascidas:");
		float crian = teclado.nextFloat();
		
		System.out.println("Digite o número de obitos:");
		float obito = teclado.nextFloat();
		
		System.out.println("Digite o número de habitantes:");
		float habitantes = teclado.nextFloat();
		
		System.out.println("Escolha a opcao desejada:");
		System.out.println("1 - para Natalidade");
		System.out.println("2 - para Mortalidade");
		byte opcao = teclado.nextByte();
		
		switch(opcao) {
		case 1:
		System.out.printf("A taxa de natalidade é %.2f",calc.calcularNatalidade(crian,habitantes));
		break;
		case 2:
			System.out.printf("A taxa de mortalidade é %.2f",calc.calcularMortalidade(obito,habitantes));
			break;
		default:
			System.out.printf("opcao invalida, tente novamente");
		}
	}

}

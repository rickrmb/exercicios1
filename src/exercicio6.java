import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner(System.in);
		//Faça um programa onde o funcionário digite o valor da compra e um cupom, informando o valor final a ser pago
		//A loja oferece 3% de desconto para quem tem o cupom DIADEFESTA
		
		Double totalCompra, valorFinal=0.0;
		String cupom;
		System.out.println("SISTEMA DE DESCONTO");
		System.out.println("Por favor, digite o valor total da sua compra");
		totalCompra = leitor.nextDouble();
		System.out.println("Por favor, digite o cupom de desconto");
		cupom = leitor.next();
		
		if(cupom.equalsIgnoreCase("diadefesta")){
			valorFinal=totalCompra * 0.97;
			System.out.println("O valor total da sua compra com desconto é de R$ " + valorFinal);
			}else{
			valorFinal=totalCompra;
			System.out.println("O valor total da sua compra é de R$ " + valorFinal);
		}
		
		
		
		
		leitor.close();

	}

}

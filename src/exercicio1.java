import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leitor = new Scanner (System.in);
		System.out.println("DESCUBRA SUA IDADE EM 31 DE DEZEMBRO DE 2021\n");
		double nascimento;
		double subtracao;
		
		System.out.println("Por favor, informe seu ano de nascimento:");
		
		nascimento = leitor.nextDouble();
		
		subtracao = 2021 - nascimento;
		
		System.out.println("Sua idade será " + subtracao);
		
		
		leitor.close();
		
	}

}

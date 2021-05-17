import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leitor = new Scanner (System.in);
		
		System.out.println("DESCUBRA A DURAÇÃO DO SEU FILME\n");
				
		double minuto;
		double multiplicacao;
		double divisao;
		
		System.out.println("Por favor, informe o tempo do seu filme em minutos:");
		
		minuto = leitor.nextDouble();
		multiplicacao = minuto * 60;
		divisao = minuto / 60;
		
		System.out.println("O tempo do filme em horas é " + divisao);
		System.out.println("O tempo do filme em minutos é " + multiplicacao);	
		
		
		
		leitor.close();
		
		
		
	}

}

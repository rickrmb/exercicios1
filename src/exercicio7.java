import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leitor = new Scanner(System.in);
		
		System.out.println("IDENTIFICAÇÃO DE LIXO\n");
		double lixo1, lixo2, lixo3;

		String mensagem = "";
		System.out.println("POR FAVOR, DIGITE O PESO DO LIXO 1");
		lixo1 = leitor.nextDouble();
		mensagem = "LIXO 1 SERÁ PEGO";
		
		System.out.println("POR FAVOR, DIGITE O PESO DO LIXO 2");
		lixo2 = leitor.nextDouble();
		if(lixo1>lixo2) {
		mensagem = "LIXO 2 SERÁ PEGO";
		}
		
		System.out.println("POR FAVOR, DIGITE O PESO DO LIXO 3");
		lixo3 = leitor.nextDouble();
		if(lixo2>lixo3 && lixo1>lixo3) {
  		mensagem = "LIXO 3 SERÁ PEGO";
		}

		System.out.println(mensagem);
		
		leitor.close();
		
	}
}
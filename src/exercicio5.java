import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leitor = new Scanner(System.in);
		System.out.println("IDENTIFICAÇÃO DE LIXO\n");
		double lixo1, lixo2, lixo3;

		
		System.out.println("Por favor, informe o peso do lixo 1");
		lixo1 = leitor.nextDouble();
		
		System.out.println("Por favor, informe o peso do lixo 2");
		lixo2 = leitor.nextDouble();
		
		System.out.println("Por favor, informe o peso do lixo 3");
		lixo3 = leitor.nextDouble();
		
		
		
		if(lixo1 < lixo2 & lixo1 < lixo3) {
			System.out.println("Recolhendo o lixo 1");
		}else{
			if(lixo2 < lixo3 & lixo2 < lixo1) {
			System.out.println("Recolhendo o lixo 2");
			}else{
			System.out.println("Recolhendo o lixo 3");
			
			}
		}
					
		
		
		leitor.close();
		
	}
}


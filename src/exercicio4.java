import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner leitor = new Scanner(System.in);
	
		System.out.println("DETEC��O DE INIMIGO - STATUS DA ARMA\n");
		double distancia;
		
		
		
		System.out.println("Por favor, informe a dist�ncia do inimigo (cm):");
		distancia=leitor.nextDouble();
		
			if(distancia <= 70) {
				System.out.println("Dist�ncia de " + distancia +"cm, arma DESATIVADA!");
			}else{
				System.out.println("Dist�ncia de "+ distancia + "cm, arma ATIVADA!");
			}

	leitor.close();
		
	}

}

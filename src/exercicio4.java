import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner leitor = new Scanner(System.in);
	
		System.out.println("DETECÇÃO DE INIMIGO - STATUS DA ARMA\n");
		double distancia;
		
		
		
		System.out.println("Por favor, informe a distância do inimigo (cm):");
		distancia=leitor.nextDouble();
		
			if(distancia <= 70) {
				System.out.println("Distância de " + distancia +"cm, arma DESATIVADA!");
			}else{
				System.out.println("Distância de "+ distancia + "cm, arma ATIVADA!");
			}

	leitor.close();
		
	}

}

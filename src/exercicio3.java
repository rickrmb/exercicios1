import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//O cinema só deixa entrar maiores de 18. pergunte ao usuário a idade dele. se for mais que 18, exiba a mensagem "Bom cinema". Se for menor que 18 anos, exiba a mensagem "apenas acompanhado dos pais".
		
		Scanner leitor = new Scanner (System.in);
		System.out.println("BEM-VINDO AO CINEMA");
		
		double idade,classificacao;
		
		System.out.println("Por favor, informe a sua idade:");
		
		idade=leitor.nextDouble();
		
		
		System.out.println("Por favor, informe a classificação do filme");
		
		classificacao=leitor.nextDouble();
		
		if(idade >= classificacao) {
			System.out.println("Bom cinema!");
		}else{
			System.out.println("Apenas acompanhado dos pais");
		}
			
		
		leitor.close();
		
		
	}

}

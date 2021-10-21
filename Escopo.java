import java.util.Scanner;
public class Escopo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("idade: ");
		int idade = entrada.nextInt();
		
		boolean podedirigir = idade >=18;
		String NomePai = "";
		
		if (!podedirigir) {
			
			System.out.print("Nome do pai: ");
			
			NomePai = entrada.next();
		}
		 System.out.println("Voce pode dirigir ?");
		 
		if (podedirigir) {
			System.out.println("Sim,claro");
		} else {
			System.out.println("Nao,seu fizer isso,seu pai " + NomePai + " vai preso");
		}
	}

}

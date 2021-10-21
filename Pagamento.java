import java.util.Scanner;
public class Pagamento {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite final da placa: ");
		int FinalP = entrada.nextInt();
		
		switch (FinalP) {
		case 1:
			System.out.println("Vencimento dia 11 de janeiro");
			break;
		case 2:
			System.out.println("Vencimento dia 12 de janeiro");
			break;
		default:{
			System.out.println("Vencimento sem data,desculpe");
			}
						}
		}
	}
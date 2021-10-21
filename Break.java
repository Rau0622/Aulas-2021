import java.util.Scanner;
public class Break {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Divisor:");
		int Divisor = entrada.nextInt();
		for (int I = 100;I <= 200 ;I++) {
			if(I % Divisor == 0) {
				break;
				}
			
			System.out.println(I);
			}
		System.out.println("Fim do programa");
		}
	}


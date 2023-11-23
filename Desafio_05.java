package fundamentos;
import java.util.Scanner;
public class Desafio_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite duas notas: ");
		
		double n1= entrada.nextDouble();
		double n2 = entrada.nextDouble();
		
		if ((n1+n2)/2 >= 7 ) {
			System.out.println("Aprovado");
		}
		else if ((n1+n2)/2 >=4) {
			System.out.println("Recuperação");
		}
		else {
			System.out.println("Reprovado");
				}
			}
		
		
		
	}



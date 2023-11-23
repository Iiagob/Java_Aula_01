package fundamentos;
import java.util.Scanner;
public class Desafio_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número entre 1 e 7: ");
		
		double n1 = entrada.nextDouble();
		
		if (n1 == 1) {
			System.out.println("Domingo");
		}
		else if (n1 == 2) {
			System.out.println("Segunda");
		}
		else if (n1 == 3) {
			System.out.println("Terça");
		}
		else if (n1 == 4) {
			System.out.println("Quarta");
		}
		else if (n1 == 5) {
			System.out.println("Quinta");
		}
		else if (n1 == 6) {
			System.out.println("Sexta");
		}
		else if (n1 == 7) {
			System.out.println("Sabado");
		}
		else {
			System.out.println("Valor invalido");
			}
		}

}

package fundamentos;
import java.util.Scanner;
public class Desafi0_2 {
public static void main(String[] args) {
	Scanner entrada= new Scanner(System.in);
	System.out.println("Digite um número: ");
	double resp = entrada.nextDouble();
	if (resp>=0) {
		System.out.println("Positivo");}
	else {
		System.out.println("Negativo");}
	}
}


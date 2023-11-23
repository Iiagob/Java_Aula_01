package fundamentos;
import java.util.Scanner;
public class Desafio_06 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int cont =0;
		
		System.out.println("Telefonou para vítima?(1= sim ou 0 = nao) ");
		
		double n = entrada.nextDouble();
		if (n == 1) {
			cont=cont+1;
		}
		
		System.out.println("Esteve no local do crime?(1= sim ou 0 = nao)");
		n = entrada.nextDouble();
		
		if (n == 1) {
			cont=cont+1;
		}
		System.out.println("Mora perto da vitima?(1= sim ou 0 = nao)");
		n = entrada.nextDouble();
		
		if (n==1) {
			cont=cont+1;
		}
		System.out.println("Devia para a vitima?(1= sim ou 0 = nao)");
		n = entrada.nextDouble();
		
		if (n==1) {
			cont=cont+1;
		}
		System.out.println("Ja trabalhou com a vitima?(1= sim ou 0 = nao)");
		n = entrada.nextDouble();	
		if (n==1){
			cont=cont+1;
		}

		if (cont == 2) {
			System.out.println("Suspeito");
		}
		else if (cont == 3 || cont == 4) {
			System.out.println("Cúmplice");
		}
		else if (cont == 5) {
			System.out.println("Assassino");
		}
		else {
			System.out.println("Inocente");
			
		}
	}
}



package projeto2;
//aprendendo entrada de dados via teclado//

import java.util.Scanner;
public class Main2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		String x;
		int y;
		double z;
		System.out.println("Digite um nome: ");
		x = sc.next(); //lendo string
		System.out.printf("Digite um número:");
		y = sc.nextInt(); //lendo inteiros
		System.out.printf("Digite um valor:");
		z = sc.nextDouble();
		
		System.out.printf("Dados digitados: %s, %d, %.2f. ", x, y, z);
		
		//usando o nextLine vc pode informar uma linha inteira com espaços
		
		sc.close(); //usa quando não for mais necessário entradas de dados
		
	}

}


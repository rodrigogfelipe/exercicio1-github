/* Fazer um programa para ler as medidas da larguras e comprimento de um terreno retangular
 * com uma casa decimaal, bem como o valor do metro quadrado do terreno com duas casas decimais. 
 * Em seguida, o prgrama de mostra o valor da área do terreno, bem como o valor do preço do 
 * terreno, ambod com duas casas decimais , conforme exemplo
 *  */
import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner tcl = new Scanner(System.in);
		
		double largura, comprimento, area, preco, metroQuadrado;
		
		System.out.println("Digite o tamanho da largura: ");
		largura= tcl.nextDouble();
		
		System.out.println("Digite o tamanho do comprimento:");
		comprimento= tcl.nextDouble();
		
		System.out.println("Qual é o preço do terreno R$: ");
		metroQuadrado= tcl.nextDouble();
		
		area= largura * comprimento;
		preco= area * metroQuadrado;
		
		System.out.printf("AREA = %.2f\n", area);
		System.out.printf("PRECO R$ %.2f\n", preco);
		
		tcl.close();
			
	}

}

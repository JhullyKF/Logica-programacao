/******************************************************************************
 Crie um algoritmo que leia o valor da variável do tipo real 
 x digitado pelo usuário eescreva na tela o valor de x²

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    float x;
	    System.out.println("Insira um valor: ");
	    Scanner teclado = new Scanner(System.in);
		x = teclado.nextFloat();
		System.out.format("Resultado: %.2f", x*x);
	}
}

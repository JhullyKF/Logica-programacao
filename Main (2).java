/******************************************************************************
 Elabore um algoritmo que leia o valor do salário mínimo e o valor do salário 
 de uma  pessoa digitados pelo usuário. Calcular e imprimir quantos salários 
 mínimos essapessoa ganha.
 
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    final double SAL_MIN = 1412.00;
	    float salario;
	    
	    System.out.println("Informe seu salário: \r");
	    Scanner teclado = new Scanner(System.in);
	    
		salario = teclado.nextFloat();
		System.out.format("Seu salário equivale a %.2f salários mínimos", 
		salario/SAL_MIN);
	}
}

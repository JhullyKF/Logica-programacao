/******************************************************************************
 Elabore um algoritmo que leia uma temperatura em graus Celsius digitada 
 pelo usuário e apresente-a convertida em graus Fahrenheit. A fórmula de 
 conversão é: F = (9.0/5.0) * C + 32.0,em que F é a temperatura em Fahrenheit 
 e C é a temperatura em Celsius

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int temp;
	    float resultado;
	    System.out.println("Insira uma temperatura em Celsius: ");
	    Scanner teclado = new Scanner(System.in);
		temp = teclado.nextInt();
		resultado = temp * 9/5 + 32;
		System.out.format("Resultado: %.2f", resultado);
	}
}

/******************************************************************************
 Elaborar um programa que apresente o valor da conversão em dólar (US$) de 
 um valor lido em real (R$). O programa deve solicitar ao usuário o valor da 
 cotação dodólar e também a quantidade de reais disponível.
 
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    final double VALOR_DOLAR = 5.02;
	    float qtdReais;
	    
	    System.out.println("Informe sua quantidade em reais:");
	    Scanner teclado = new Scanner(System.in);
	    
		qtdReais = teclado.nextFloat();
		System.out.format("Você possui %.2f dólares", qtdReais/VALOR_DOLAR);
	}
}

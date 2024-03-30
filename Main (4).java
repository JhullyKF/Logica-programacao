/******************************************************************************
 Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno.
 A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2, a nota B 
 tem peso 3 e a nota C tem peso 5.
 
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    final int PESO_A = 2;
	    final int PESO_B = 3;
	    final int PESO_C = 5;
	    float notaA, notaB, notaC, resultado;
	    Scanner teclado = new Scanner(System.in);

	    System.out.println("Informe a primeira nota:");
	    notaA = teclado.nextFloat();
	    System.out.println("Informe a segunda nota:");
	    notaB = teclado. nextFloat();
	    System.out.println("Informe a terceira nota:");
	    notaC = teclado.nextFloat();
	    
	    resultado = (notaA * PESO_A + notaB * PESO_B + notaC * PESO_C) / 
	        (PESO_A + PESO_B + PESO_C);
	    
	    System.out.format("Média: %.2f", resultado);
	}
}

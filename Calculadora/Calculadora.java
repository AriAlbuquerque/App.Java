package DIO.models.java.new1.Calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		
		
		System.out.println("Digite o primeiro número: ");
		a = sc.nextInt();
		
		System.out.println("Digite o segundo número: ");
		b = sc.nextInt();
		
	int soma = soma (a,b);
	int subtracao = subtracao(a,b);
	float multiplicacao = multiplicacao(a,b);
	float divisao = divisao(a,b);
	
		System.out.println("A soma: " + soma);
		System.out.println("A subtracao: " + subtracao);
		System.out.println("A divisao: " + divisao);
		System.out.println("A multiplicacao: " + multiplicacao);
		
	}
	
	public static int soma (int a, int b) {
		return a + b;}
		
	public static int subtracao (int a, int b ) {
			return a - b;}
		
	public static int divisao (int a,int b) {
			return a / b;}
			
			
	public static int multiplicacao (int a, int b) {
	return a * b;}


	

	}
	



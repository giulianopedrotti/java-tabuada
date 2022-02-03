package br.com.fiap.tabuada;

import java.util.Scanner;

public class Tabuada {
	
	public void Executa() {
		// Declarando variáveis
		int multiplicador;
		int multiplicar;
		int contador=0;
		int resultado=0;
		int produto=0;
		
		Scanner optUser = new Scanner(System.in);
		System.out.println("Insira o numero da tabuaba");
		multiplicar = optUser.nextInt();
		
		System.out.println("Insira o numero multiplicador");
		multiplicador = optUser.nextInt();
		
		System.out.println("");
		System.out.println("Tabuada do " + multiplicar + " usando while");
		
		while (contador <= multiplicador) {
			resultado = multiplicar * contador;
			System.out.println(multiplicar +  " X " + contador + " = " + resultado );
			contador = contador + 1;
		}
		
		System.out.println("");
		System.out.println("Tabuada do " + multiplicar + " usando for");
		
		for (int volta = 0; volta <= multiplicador; volta++ ) {
			produto = multiplicar * volta;
			System.out.println(multiplicar + " X " + volta + " = "  + produto);
		}
		
		// Utilizando VETORES
		int notas[] = new int[5];
		
		notas[0] = 7;
		notas[1] = 8;
		notas[2] = 10;
		notas[3] = 9;
		notas[4] = 8;
		
		System.out.println("");
		System.out.println("A nota do terceiro bimestre foi " + notas[4]);
		notas[4] = 10;
		System.out.println("A nota do terceiro bimestre foi " + notas[4]);
		
		int ii = 0;
		while (ii < notas.length) {
			System.out.println(notas[ii]);
			ii++;
		}
		
		double precos[] = {12.8, 50.9};
		System.out.println(precos[1]);
		
		String frutas[] = {"Laranja", "Banana", "Cajú", "Caqui", "Melancia", "Maracujá"};
		
		for (int forcount = 0; forcount < frutas.length; forcount++) {
			System.out.println(frutas[forcount]);
		}
		System.out.println("###########################################################");
		for (String fruta : frutas) {
			System.out.println(fruta);
		}
 	}

}

package com.generation;

import java.util.Scanner;

public class Main {
	
// Angelica Hernández
// 5/5
// Revisó: Andrea Sánchez

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int[] n = new int[20];

	    for (int i = 0; i < 20; i++) {
	      n[i] = (int)(Math.random() * 381) + 20;
	      System.out.print(n[i] + " ");
	    }
	    
	    System.out.println("\n¿Qué números quiere resaltar? ");
	    System.out.print("1 – los múltiplos de 5 \n2 – los múltiplos de 7 \n");
	    int opcion = sc.nextInt();

	    int multiplo = (opcion == 1) ? 5 : 7;

	    
	    for (int e : n) {
		      if (e % multiplo == 0) {
		        System.out.print("[" + e + "] ");
		      }
		      
		       else {
		        System.out.print(e + " ");
		      }
		    }

	}

}

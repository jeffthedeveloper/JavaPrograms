package exercicoJavaAntecessorSucessor;

import java.util.Scanner;

public class AntecessorSucessor {

	public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  
	  System.out.println("Digite um número:");
	  int numero = scan.nextInt();
	  
	  int antecessor = numero -1;
	  int sucessor = numero +1;
	  
	  scan.close();
	  
	  System.out.println("O número " + numero + " tem " + antecessor + " com seu antecessor e " 
	    + sucessor + " como seu sucessor.");

	}

}

package br.senac.pi;
import java.util.Scanner;
public class ganimedes {

	public static void main(String[]args){
		
	double nota1,nota2,nota3,nota4,media;
	Scanner in = new Scanner(System.in);
	
	System.out.println("Sua primeira nota �:");
	   nota1 = in.nextDouble();
	
	System.out.println("sua segunda nota �:");
	    nota2 = in.nextDouble();
	
	System.out.println("Sua terceira nota �:");
		nota3 = in.nextDouble();
	
	System.out.println("sua quarta nota �:");
	   nota4 = in.nextDouble();
	 
	media = (nota1+nota2+nota3+nota4) / 4;
		
		if (media>=7 ){
			
			System.out.println("Aprovado!!");
		}		
			else if   (media  >= 6  &&  media <  7 ){
				
				
				System.out.println("Recupera�ao");
				
				
}
		
	

		
		else {
			
			System.out.println("reprovado!!");
			
		}
		
	}   
	   
	}
	


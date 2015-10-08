package br.senac.pi;
import java.util.Scanner;
public class novosalario {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		String Gerente,Coordenador,Supervisor ;
		double salario, novosalario;
		 
		System.out.println("Gerente ");
		System.out.println("salario: ");
		salario = ler.nextDouble();		
		novosalario = salario * 1.15;
		System.out.println("Irá receber: R$"+novosalario);
		
		
		System.out.println("\nCoordenador ");
		System.out.println("salrio: ");
		salario = ler.nextDouble();		
		novosalario = salario *1.1;
		System.out.println("Irá receber: R$"+novosalario);
		
		
		System.out.println("\nSupervisor ");
		System.out.println("salario: ");
		salario = ler.nextDouble();
		novosalario = salario * 1.08;
		System.out.println("Irá receber: R$"+novosalario);
		

	}

}
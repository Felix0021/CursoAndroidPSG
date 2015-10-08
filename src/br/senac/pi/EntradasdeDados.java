package br.senac.pi;
import java.util.Scanner;
public class EntradasdeDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Olá!");//mensagem inicial
		System.out.print("Digite um número: ");//interage com o usuario
		Scanner s = new Scanner(System.in);//prepara a entrada de dados
		int valor = s.nextInt();//faz a leitura de dados
		System.out.println("Valor = "+ valor);//imprime o valor lido
		s.close();//libera o recurso de entrada de dados
	}

}

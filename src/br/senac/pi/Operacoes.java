package br.senac.pi;

public class Operacoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome = "Java ";
		String sobrenome = "Enterprise";
		System.out.println("Nome Completo: " + nome + sobrenome);
		int idade = 40;
		boolean brasileiro = true;
		System.out.println("idade: " + idade);
		if(brasileiro){
			System.out.println("Brasileiro: "+"sim");
		}
		System.out.println("Opera��es matematicas");
		int n1=10;
		int n2=5;
		System.out.printf("A soma entre %d e %d �:",n1, n2);
		System.out.println(n1+n2);//Mostra o Resultado
		System.out.printf("A multiplica��o entre %d e %d �:", n1,n2);
		System.out.println(n1*n2);
		System.out.printf("A subtra��o entre %d e %d �:", n1,n2);
		System.out.println(n1-n2);
		System.out.printf("A divis�o entre %d e %d �:", n1, n2);
		System.out.println(n1/n2);
		System.out.printf("O resto da divis�o entre %d e %d �", n1 ,n2);
		System.out.println(n1%n2);
		//preced�ncia de avalia��o de operadores
		System.out.println((n1-n2)*5);
		
	
	}

}

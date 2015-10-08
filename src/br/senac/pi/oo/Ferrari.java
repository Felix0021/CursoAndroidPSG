package br.senac.pi.oo;

public class Ferrari {

	public static void main(String[] args) {
		  
		
	carro c1 = new carro ();
    c1.marca = "Ferrari";    //Atribuição de valores a atributos
    c1.modelo = "F448";
    c1.chassi = "f45679FRTY";
    c1.ano = 2015;
   	System.out.println("marca"+c1.marca);
   	System.out.println("modelo"+c1);
    
    
    
	c1.partida(); //Chamada ao métado
	c1.acelerar();
	c1.freiar();
	
	}

}

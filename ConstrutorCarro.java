package atividades;

public class ConstrutorCarro {
	
	public static void main(String[] args) {
		
		Carro carro1 = new Carro("HWW-7005", 9457 );
		Carro carro2 = new Carro("JQP-9578", 4896 );
		Carro carro3 = new Carro("GQT-5748", 1679 );
		
		System.out.println(carro1.getPlaca());
		System.out.println(carro2.getNumChassi());
		System.out.println(carro3.getPlaca() + " " + carro3.getNumChassi());
		
	}

}

package atividades;

public class ConstrutorAnimal {
	
	public static void main(String[] args) {
		
		Animal animal1 = new Animal(30, "Branco" );
		Animal animal2 = new Animal(40, "Preto" );
		Animal animal3 = new Animal(50, "Cinza" );
		
		System.out.println(animal1.getTamanho());
		System.out.println(animal2.getCor());
		System.out.println(animal3.getTamanho() + " " + animal3.getCor());
	}

}

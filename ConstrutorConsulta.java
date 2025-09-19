package atividades;

public class ConstrutorConsulta {
	
	public static void main(String[] args) {
		
		Consulta paciente1 = new Consulta("02/05/2025", "Dentária" , " Molares");
		Consulta paciente2 = new Consulta("02/05/2025", "Dentária" , " Molares");
		Consulta paciente3 = new Consulta("02/05/2025", "Dentária" , " Molares");
		
		System.out.println(paciente1.getData());
		System.out.println(paciente2.getNomePonte());
		System.out.println(paciente3.getData() + " " + paciente3.getNomePonte() + " " + paciente3.getNomeDents());
		
		
		
	}

}

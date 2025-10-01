package atividades;

public class Consulta {
	
	private String data;
	private String nomePonte;
	private String nomeDents;
	
	public Consulta(String data, String nomePonte, String nomeDents) {
		this.data = data;
		this.nomePonte = nomePonte;
		this.nomeDents = nomeDents;
	}

	public String getData() {
		return data;
	}

	public String getNomePonte() {
		return nomePonte;
		
	}	

	public String getNomeDents() {
		return nomeDents;
	}


	

}

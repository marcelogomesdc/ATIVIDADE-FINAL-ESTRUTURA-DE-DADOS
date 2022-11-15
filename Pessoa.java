package br.edu.iftm.model;

public class Pessoa {

	private int id;
	private String nome;
	private String telefone;
	private String endereco;
	private String email;

	private String celular;
	private static int contador = 0;

	public Pessoa(String nome, String telefone, String endereco, String email, String celular){
		this.celular = celular;
		Pessoa.contador++;
		this.nome = nome;
	    this.telefone = telefone;
	    this.endereco = endereco;
	    this.email = email;
		this.celular = celular;
	    this.id = Pessoa.contador;
	}
	
	public Pessoa(String nome, String telefone) {
		Pessoa.contador++;
		this.nome = nome;
		this.telefone = telefone;
	    this.id = Pessoa.contador;
	}
	 


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (telefone == null) {
			if (other.telefone != null)
				return false;
		} else if (!telefone.equals(other.telefone))
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNumero() {
		return telefone;
	}
	
	public void setNumero(String telefone) {
		this.telefone = telefone;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}





	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}



	@Override
	public String toString() {
		return "\nId="+ id + "\nNome=" + nome + "\nTelefone=" + telefone + "\nNascimento=" + endereco + "\nE-mail=" + email+"\nCelular="+ celular+"\n\n";
	}

	

}

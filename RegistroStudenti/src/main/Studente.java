package main;

public class Studente {
	//ATTRIBUTI
	private String nome;
	private String cognome;
	private int matricola;

	//COSTRUTTORI
	public Studente(String nome, String cognome, int matricola) {
		this.nome = nome;
		this.cognome = cognome;
		this.matricola = matricola;
	}
	
	public Studente() {
	}

	//METODI GET
	public String getNome() {
		return nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public int getMatricola() {
		return matricola;
	}
}

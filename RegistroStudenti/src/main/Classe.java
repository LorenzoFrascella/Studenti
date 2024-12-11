package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Classe {
	//ATTRIBUTI
	private ArrayList <Studente> studenti;
	
	//COSTRUTTORE
	public Classe(ArrayList <Studente> studenti) {
		this.studenti = studenti;
	}
	
	//METODI
	public void aggiungiStudente(Studente s) {
		boolean inserito = false; //variabile per verificare se uno studente è stato inserito
		Studente studente;
		if(studenti.size() != 0) { //se la lista è già riempita esegui
			for(int i = 0; i < studenti.size(); i++) {
				if(!(s.getMatricola() == studenti.get(i).getMatricola())) { //se la matricola dello studente passato tramite parametri, è diversa dalla matricola di tutti gli studenti presenti nella lista esegui
					inserito = false;
				} else { //altrimenti inserito = true (matricola già esistente)
					System.out.println("Matricola gia esistente");
					inserito = true;
					break;
				}
			}
		if(inserito == false) { //se inserito è uguale a false aggiungi studente
			studente = new Studente(s.getNome(), s.getCognome(), s.getMatricola());
			studenti.add(studente); //aggiunta studente nella lista
		}
		} else { //se la lista è vuota aggiungi studente
			studente = new Studente(s.getNome(), s.getCognome(), s.getMatricola());
			studenti.add(studente);
		}
	}
	
	public void visualizzaStudente() {
		for(Studente studente : studenti) {
			System.out.println("NOME: " + studente.getNome() + " COGNOME: " + studente.getCognome() + " MATRICOLA: " + studente.getMatricola()); //stampa gli attributi degli studenti per ogni elemento passato nella lista
		}
	}
	
	public void cercaStudente() {
		Scanner scanner = new Scanner(System.in);
		int matricola = 0;
		
		System.out.print("Inserire una matricola: ");
		matricola = scanner.nextInt(); //legge numero intero (matricola)
		
		for(int i = 0; i < studenti.size(); i++) {
			if(matricola == studenti.get(i).getMatricola()) {
				System.out.println("NOME: " + studenti.get(i).getNome() + " COGNOME: " + studenti.get(i).getCognome() + " MATRICOLA: " + studenti.get(i).getMatricola()); //stampa lo studente con matricola corrispondente a quella inserita in input
				break;
			} else if(!(matricola == studenti.get(i).getMatricola()) && i == studenti.size() - 1) { //altrimenti a fine lista se non è stato trovato stampa il messaggio di "non trovato"
				System.out.println("Matricola errata, studente non registrato.");
			}
		}
	}
	
}

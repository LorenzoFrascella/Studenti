package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/* Creare un programma Java che consenta di gestire un registro degli studenti. Il programma deve:

		   Registrare nuovi studenti con:
		   Nome,
		   Cognome,
		   Matricola (univoca).
		   Visualizzare l'elenco degli studenti.
		   Cercare uno studente tramite la matricola.
		   Requisiti Tecnici:
		   Creare una classe Studente con i campi necessari.
		   Utilizzare un ArrayList per memorizzare gli studenti.
		   Creare un menu testuale che permetta all'utente di:
		
		   Aggiungere uno studente.
		   Visualizzare tutti gli studenti.
		   Cercare uno studente per matricola.
		   Uscire dal programma */
		ArrayList <Studente> studenti = new ArrayList <Studente>();
		Classe c = new Classe(studenti);
		
		Scanner scanner = new Scanner(System.in);
		int continua = 1, scelta = 0;
		
		do {
			System.out.println("1)AGGIUNGI STUDENTE\n2)VISUALIZZA TUTTI GLI STUDENTI\n3)CERCA UNO STUDENTE TRAMITE MATRICOLA\n4)ESCI DAL PROGRAMMA");
			scelta = scanner.nextInt();
			
			switch(scelta) {
				case 1:
					Studente s = new Studente();
					s = inserisci(); //richiama metodo inserisci()
					c.aggiungiStudente(s); //richiama metodo aggiungiStudente()
					System.out.print("PREMI 0 PER CONTINUARE:");
					continua = scanner.nextInt();
					break;
				
				case 2:
					c.visualizzaStudente(); //richiama metodo visualizzaStudente()
					System.out.print("PREMI 0 PER CONTINUARE:");
					continua = scanner.nextInt();
					break;
					
				case 3:
					c.cercaStudente(); //richiama metodo cercaStudente()
					System.out.print("PREMI 0 PER CONTINUARE:");
					continua = scanner.nextInt();
					break;
					
				case 4:
					System.exit(0); //esce dal programma
					break;
					
				default: 
					System.out.print("NUMERO ERRATO, PREMI 0 PER TORNARE AL MENU:");
					continua = scanner.nextInt();
			}
		} while (continua == 0); //ripeti ficnhé continua è 0
		scanner.close();
	}
	
	
	static Studente inserisci() {
		Scanner scannerDati = new Scanner(System.in);
		String nome = "", cognome = "";
		int matricola = 0;
		System.out.print("inserire il nome dello studente da aggiungere: ");
		nome = scannerDati.nextLine(); //inserisce stringa nome
		
		System.out.print("inserire il cognome dello studente da aggiungere: ");
		cognome = scannerDati.nextLine(); //inserisce stringa cognome
		
		System.out.print("inserire la matricola dello studente da aggiungere: ");
		matricola = scannerDati.nextInt(); //inserisce numero intero per matricola
		
		Studente s = new Studente(nome, cognome, matricola); //crea oggetto Instanza di Studente
		return s;
	}

}

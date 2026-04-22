package it.univaq.biblioteca;

import java.time.Instant;
import java.util.Date;

import it.univaq.biblioteca.catalog.Book;
import it.univaq.biblioteca.catalog.DVD;
import it.univaq.biblioteca.catalog.Item;
import it.univaq.biblioteca.catalog.Magazine;
import it.univaq.biblioteca.users.User;
import it.univaq.biblioteca.users.UserType;


public class Main {

	public static void main(String[] args) {
		System.out.println("Hello world!");
				
//		Book finalFantasy = new Book(
//				"Final fantasy X", "autore", "2010", 
//				"754-8657-4865", 
//				23.30f, 
//				"fantasy", 
//				"Mondatori", 
//				1327, 
//				"inglese", 
//				"fhfbvhfvbuhre"
//		);
//		System.out.println(finalFantasy);
		
//		String output = "" + finalFantasy;
//		System.out.println(output);
		
//		System.out.println(String.valueOf(false));
//		System.out.println(false);
		
		// ADD USER METHOD 1: Un riferimento per ogni istanza
		
//		User user = new User(11, "studente", "Mario", "Rossi", "21-04-1976", "MRARSS76D21I456F", false, "M",
//				"0863445566", null, "mario.rossi@email.com", 30.00f, (short) 0, (short) 0);
//		User user2 = new User(11, "studente", "Gianni", "Verdi", "12-03-1981", "GNNVRD81C12I456F", false, "M",
//				"0863445566", null, "gianni.verdi@email.com", 30.00f, (short) 0, (short) 0);
//		User user3 = new User("docente", "Alfredo", "Giambattista", "13-02-1966", "LFRGMB66B13I456F", false, "M",
//				"0863445566", null, "alfredo.giambattista@email.com", 30.00f, (short) 0, (short) 0);
//		User user4 = new User("esterno", "Giorgio", "29-01-1999", "GRGGMB99A29I456F", false, "M", 
//				null, "giorgio.giambattista@email.com", 40.0f, (short) 0, user3);
//		System.out.println(user);
//		System.out.println(user2);
//		System.out.println(user3);
//		System.out.println(user4);
//		
//		Library library = new Library(10, 5);
//		library.addUser(user);
//		library.addUser(user2);
//		library.addUser(user3);
//		library.addUser(user4);
		
		// ADD USER METHOD 2: Un riferimento condiviso per tutte le istanze
		
//		Library library = new Library(10, 5);
//		
//		User user;
//		user = new User(11, "studente", "Mario", "Rossi", "21-04-1976", "MRARSS76D21I456F", false, "M",
//				"0863445566", null, "mario.rossi@email.com", 30.00f, (short) 0, (short) 0);
//		System.out.println(user);
//		library.addUser(user);		
//		
//		user = new User(11, "studente", "Gianni", "Verdi", "12-03-1981", "GNNVRD81C12I456F", false, "M",
//				"0863445566", null, "gianni.verdi@email.com", 30.00f, (short) 0, (short) 0);
//		System.out.println(user);
//		library.addUser(user);
//		
//		user = new User("docente", "Alfredo", "Giambattista", "13-02-1966", "LFRGMB66B13I456F", false, "M",
//				"0863445566", null, "alfredo.giambattista@email.com", 30.00f, (short) 0, (short) 0);
//		System.out.println(user);
//		library.addUser(user);
//		
//		user = new User("esterno", "Giorgio", "29-01-1999", "GRGGMB99A29I456F", false, "M", 
//				null, "giorgio.giambattista@email.com", 40.0f, (short) 0, user);
//		System.out.println(user);
//		library.addUser(user);
		
		// ADD USER METHOD 3: Creazione istanza ed inserimento completamente inline
		
		Library library = new Library(10, 5); 
		
		// Inserimento utenti
		
		library.addUser(new User(11, UserType.STUDENTE, "Mario", "Rossi", "21-04-1976", "MRARSS76D21I456F", false, "M",
				"0863445566", null, "mario.rossi@email.com", 30.00f, (short) 0, (short) 0));		 
		
		library.addUser(new User(11, UserType.STUDENTE, "Gianni", "Verdi", "12-03-1981", "GNNVRD81C12I456F", false, "M",
				"0863445566", null, "gianni.verdi@email.com", 30.00f, (short) 0, (short) 0));
		
		library.addUser(new User(UserType.DOCENTE, "Alfredo", "Giambattista", "13-02-1966", "LFRGMB66B13I456F", false, "M",
				"0863445566", null, "alfredo.giambattista@email.com", 30.00f, (short) 0, (short) 0));
		
		// Nota: ho dovuto aggiungere un metodo Library.getUser(int index) per farmi riportare un istanza di
		// utente dato un certo indice, per poter utilizzare il costruttore all'istruzione seguente
		library.addUser(new User(UserType.ESTERNO, "Giorgio", "29-01-1999", "GRGGMB99A29I456F", false, "M", 
				null, "giorgio.giambattista@email.com", 40.0f, (short) 0, library.getUser(2)));
		
		// Inserimento libri
		
//		boolean result = library.addBook(new Book("Title1", "Me", "1/04/2026", "5674783657846357", 20f, "horror", "editor1", 300, "italiano", ""));
//		System.out.println("Inserimento 1:" + result);
//		result = library.addBook(new Book("Title2", "Me", "1/04/2025", "5674783657846357", 20f, "science", "editor1", 300, "italiano", ""));
//		System.out.println("Inserimento 2:" + result);
//		result = library.addBook(new Book("Title3", "Me", "1/04/2024", "5674783657846357", 20f, "thriller", "editor1", 300, "italiano", ""));
//		System.out.println("Inserimento 3:" + result);
		
//		if (library.addBook(new Book("Title1", "Me", "1/04/2026", "5674783657846357", 20f, "horror", "editor1", 300, "italiano", "")))
//			System.out.println("Inserimento 1:OK");
//		else System.out.println("Inserimento 1:NO");
//		if (library.addBook(new Book("Title2", "Me", "1/04/2025", "5674783657846357", 20f, "science", "editor1", 300, "italiano", "")))
//			System.out.println("Inserimento 2:OK");
//		else System.out.println("Inserimento 2:NO");
//		if (library.addBook(new Book("Title3", "Me", "1/04/2024", "5674783657846357", 20f, "thriller", "editor1", 300, "italiano", "")))
//			System.out.println("Inserimento 3:OK");
//		else System.out.println("Inserimento 3:NO");
		
		System.out.println("Inserimento 1:" + (
				library.addItem(new Book("Title1", "Me", new Date(126, 3, 1) /* 1/04/2026 */, "5674783657846357", 20f, "horror", "editor1", 300, "italiano", "")) ?
						"OK" : "NO"
		));
		
		System.out.println("Inserimento 2:" + (
				library.addItem(new Book("Title2", "Me", new Date(125, 3, 1) /* 1/04/2025 */, "5674783657846358", 20f, "science", "editor1", 300, "italiano", "")) ?
						"OK" : "NO"
				));
		
		System.out.println("Inserimento 3:" +(
				library.addItem(new Book("Title3", "Me", new Date(124, 3, 1) /* 1/04/2024 */, "5674783657846359", 20f, "thriller", "editor1", 300, "italiano", "")) ?
						"OK" : "NO"
				));
		
		System.out.println("Inserimento 4:" +(
				library.addItem(new DVD("Film1", "Me", new Date(124, 3, 1) /* 1/04/2024 */, "5674783657846360", 20f, "thriller", "editor1", "italiano", 180, "DVD", 4.7f)) ?
						"OK" : "NO"
				));
		
		System.out.println("Inserimento 5:" +(
				library.addItem(new Magazine("Rivista 1", "Me", new Date(124, 3, 1) /* 1/04/2024 */, "5674783657846361", 20f, "thriller", "editor1", "italiano", 2, "weekly")) ?
						"OK" : "NO"
				));
		
			
		library.debug();
		System.out.println();
		System.out.println(library.ricercaPerIsbn("5674783657846358"));
		
		System.out.println();
		System.out.println(library.ricercaTitoloPiuRecente(library.getBook(2)));
		
//		it.univaq.biblioteca.books.Item item1 = new it.univaq.biblioteca.books.Item();
//		System.out.println(item1.TEST);
//		
//		it.univaq.biblioteca.users.Item item2 = new it.univaq.biblioteca.users.Item();
//		System.out.println(item2.TEST2);
		
//		it.univaq.biblioteca.books.Item.test();
		
		System.out.println(library.existStudent("Mario", "Rossi"));
	}

}

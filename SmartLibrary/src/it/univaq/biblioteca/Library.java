package it.univaq.biblioteca;

import it.univaq.biblioteca.catalog.Book;
import it.univaq.biblioteca.catalog.DVD;
import it.univaq.biblioteca.catalog.Item;
import it.univaq.biblioteca.users.User;

public class Library {
	
	// Catalogo libri
	private Item[] catalog;
	private int book_index = -1;
	
	// Elenco utenti
	private User users[];
	private int user_index = 0;

	/**
	 * 
	 * @param catalogSize
	 * @param maxUsers
	 */
	public Library(int catalogSize, int maxUsers) {
		super();
//		books = new Book[catalogSize];
		catalog = new Item[catalogSize];
		users = new User[maxUsers];		
	}
	
	public boolean addBook(Book book) {
		if (this.ricercaGeneralePerIsbn(book.getIsbn()) == null) {
			catalog[++book_index] = book;
			return true;
		}
		else return false; // else posso anche toglierlo in questo caso
	}
	
	public boolean addDVD(DVD dvd) {
		if (this.ricercaGeneralePerIsbn(dvd.getIsbn()) == null) {
			catalog[++book_index] = dvd;
			return true;
		}
		else return false; // else posso anche toglierlo in questo caso
	}
	
	public User getUser(int index) {
		return users[index];
	}
	
	public Book getBook(int index) {
		if (catalog[index] instanceof Book)
			return (Book) catalog[index];
		return null;
	}
	
	public Item getItem(int index) {
		return catalog[index];
	}
	
	public void addUser(User user) {
		users[user_index++] = user;
//		DEBUG con costrutto avanzato for-each
//		for (User u: users)
//			System.out.println(u);
		
//		DEBUG con ciclo for per iterare l'array di utenti
//		for (int i = 0; i < users.length; i++)
//			System.out.println(i + ":" + users[i]);
	}
	
	public Item ricercaGeneralePerIsbn(String isbn) {
		for (Item b: catalog) {	
			if (b != null && b.getIsbn().equals(isbn))
				return b;
		}
		return null;
	}
	
	public Book ricercaPerIsbn(String isbn) {
		for (Item i: catalog) {			
			if (i instanceof Book) {
				Book b = (Book) i;
				if (b != null && b.getIsbn().equals(isbn))
					return b;
			}
		}
		return null;
	}
	
	public DVD ricercaDvdPerIsbn(String isbn) {
		for (Item i: catalog) {			
			if (i instanceof DVD) {
				DVD b = (DVD) i;
				if (b != null && b.getIsbn().equals(isbn))
					return b;
			}
		}
		return null;
	}
	
	public Book ricercaTitoloPiuRecente(Book book) {
		if (book == null) return null;
		Book result = null;
		for (Item i: catalog) {
			if (i instanceof Book) {
				Book b = (Book) i;
				if (b!= null && b.getPublishedDate().after(book.getPublishedDate()))
					if (result == null) result = b;
					else if (b.getPublishedDate().after(result.getPublishedDate()))
						result = b;
			}
		}
		return result;
	}
	
	public void debug() {
		System.out.println("Utenti ->");
		for (User u: users)
			if (u != null)
				System.out.println(u);
		System.out.println("Libri ->");
		for (Item b: catalog)
			if (b != null)
				System.out.println(b);
	}
	
}

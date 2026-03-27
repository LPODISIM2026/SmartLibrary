package it.univaq.biblioteca;

public class Library {
	
	// Catalogo libri
	private Book[] books;
	private int book_index = -1;
	
	// Elenco utenti
	private User users[];

	/**
	 * 
	 * @param catalogSize
	 * @param maxUsers
	 */
	public Library(int catalogSize, int maxUsers) {
		super();
		books = new Book[catalogSize];
		users = new User[maxUsers];
	}
	
	public void addBook(Book book) {
		books[++book_index] = book;
	}
	
}

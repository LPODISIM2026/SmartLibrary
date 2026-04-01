package it.univaq.biblioteca;

public class Library {
	
	// Catalogo libri
	private Book[] books;
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
		books = new Book[catalogSize];
		users = new User[maxUsers];		
	}
	
	public boolean addBook(Book book) {
		if (this.ricercaPerIsbn(book.getIsbn()) == null) {
			books[++book_index] = book;
			return true;
		}
		else return false; // else posso anche toglierlo in questo caso
	}
	
	public User getUser(int index) {
		return users[index];
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
	
	public Book ricercaPerIsbn(String isbn) {
		for (Book b: books)
			if (b != null && b.getIsbn().equals(isbn))
				return b;
		return null;
	}
	
	public void debug() {
		System.out.println("Utenti ->");
		for (User u: users)
			if (u != null)
				System.out.println(u);
		System.out.println("Libri ->");
		for (Book b: books)
			if (b != null)
				System.out.println(b);
	}
	
}

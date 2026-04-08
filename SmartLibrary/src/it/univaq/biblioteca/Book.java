package it.univaq.biblioteca;

import java.util.Date;

import it.univaq.biblioteca.books.Item;

public class Book extends Item {
	
	private String title;
	private String author;
	private Date publishedDate; // TODO - convert to Date object
	private String isbn;
	private float price;
	private String category;
	private String editor;
	private int pages;
	private String language;
	private String _abstract;
//	private String bookAbstract;
	
	/**
	 *  
	 * @param title
	 * @param author
	 * @param publishedDate
	 * @param isbn
	 * @param price
	 * @param category
	 * @param editor
	 * @param pages
	 * @param language
	 * @param _abstract
	 */
	public Book(String title, String author, Date publishedDate, String isbn, float price, String category,
			String editor, int pages, String language, String _abstract) {
		super();
		this.title = title;
		this.author = author;
		this.publishedDate = publishedDate;
		this.isbn = isbn;
		this.price = price;
		this.category = category;
		this.editor = editor;
		this.pages = pages;
		this.language = language;
		this._abstract = _abstract;
	}

	public Book(String title, String author, Date publishedDate, String isbn, int pages, Book libro) {
		super();
		// New information
		this.title = title;
		this.author = author;
		this.publishedDate = publishedDate;
		this.isbn = isbn;
		this.pages = pages;
		// Existing information		
		this.price = libro.price;
		this.category = libro.category;
		this.editor = libro.editor;		
		this.language = libro.language;
		this._abstract = libro._abstract;
	}
	
	

	/**
	 * This returns the book's author
	 * 
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * Set the author name
	 * 
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return the editor
	 */
	public String getEditor() {
		return editor;
	}

	/**
	 * @param editor the editor to set
	 */
	public void setEditor(String editor) {
		this.editor = editor;
	}

	/**
	 * @return the _abstract
	 */
	public String get_abstract() {
		return _abstract;
	}

	/**
	 * @param _abstract the _abstract to set
	 */
	public void set_abstract(String _abstract) {
		this._abstract = _abstract;
	}

	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the publishedDate
	 */
	public Date getPublishedDate() {
		return publishedDate;
	}

	/**
	 * @param publishedDate the publishedDate to set
	 */
	public void setPublishedDate(Date publishedDate) {
		this.publishedDate = publishedDate;
	}

	/**
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(float price) {		
		this.price = price;
	}

	/**
	 * @return the pages
	 */
	public int getPages() {
		return pages;
	}

	/**
	 * @param pages the pages to set
	 */
	public void setPages(int pages) {
		this.pages = pages;
	}

	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "Libro [title=" + title + ", author=" + author + ", publishedDate=" + publishedDate + ", isbn=" + isbn
				+ ", price=" + price + ", category=" + category + ", editor=" + editor + ", pages=" + pages
				+ ", language=" + language + ", _abstract=" + _abstract + "]";
	}
	

}

package it.univaq.biblioteca.catalog;

import java.util.Date;

public class Book extends Item {
	
	
	private int pages;	
	private String _abstract;
	
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
		super(title, author, publishedDate, isbn, price, category, editor, language);
		
		this.pages = pages;
		this._abstract = _abstract;
	}

	public Book(String title, String author, Date publishedDate, String isbn, int pages, Book libro) {
		super(
			// New information
			title, author, publishedDate, isbn,
			// Existing information
			libro.getPrice(), libro.getCategory(), libro.getEditor(), libro.getLanguage()
				);
		// New information		
		this.pages = pages;
		// Existing information
		this._abstract = libro._abstract;
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

	@Override
	public String toString() {
		return "Book [pages=" + pages + ", _abstract=" + _abstract + ", getTitle()=" + getTitle() + ", getAuthor()="
				+ getAuthor() + ", getPublishedDate()=" + getPublishedDate() + ", getIsbn()=" + getIsbn()
				+ ", getPrice()=" + getPrice() + ", getCategory()=" + getCategory() + ", getEditor()=" + getEditor()
				+ ", getLanguage()=" + getLanguage() + "]";
	}
	

}

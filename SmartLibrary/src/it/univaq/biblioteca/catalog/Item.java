package it.univaq.biblioteca.catalog;

import java.util.Date;

public abstract class Item implements IBorrowable, ISearchable {
	
	private String title;
	private String author;
	private Date publishedDate;
	private String isbn;
	private float price;
	private String category;
	private String editor;
	private String language;
	
	// IBorrowable
	private boolean avail = true;
	
	
	/**
	 * @param title
	 * @param author
	 * @param publishedDate
	 * @param isbn
	 * @param price
	 * @param category
	 * @param editor
	 * @param language
	 */
	public Item(String title, String author, Date publishedDate, String isbn, float price, String category,
			String editor, String language) {
		super();
		this.title = title;
		this.author = author;
		this.publishedDate = publishedDate;
		this.isbn = isbn;
		this.price = price;
		this.category = category;
		this.editor = editor;
		this.language = language;
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
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}


	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
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
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}


	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
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

	abstract public String getDetails();
	
	// IBorrowable
	
	public void borrow() {
		avail = false;
	}
	
    public void returnItem() {
    	avail = true;
    }
    
    public boolean isAvailable() {
    	return avail;
    }
		
}
package it.univaq.biblioteca.catalog;

import java.util.Date;

public class DVD extends Item {

	private int durata; // in minuti
	private String formato; // DVD o Bluray
	private float gigabytes;
	/**
	 * @param title
	 * @param author
	 * @param publishedDate
	 * @param isbn
	 * @param price
	 * @param category
	 * @param editor
	 * @param language
	 * @param durata
	 * @param formato
	 * @param gigabytes
	 */
	public DVD(String title, String author, Date publishedDate, String isbn, float price, String category,
			String editor, String language, int durata, String formato, float gigabytes) {
		super(title, author, publishedDate, isbn, price, category, editor, language);
		this.durata = durata;
		this.formato = formato;
		this.gigabytes = gigabytes;
	}
	
	@Override
	public String toString() {
		return "DVD [durata=" + durata + ", formato=" + formato + ", gigabytes=" + gigabytes + ", getTitle()="
				+ getTitle() + ", getAuthor()=" + getAuthor() + ", getPublishedDate()=" + getPublishedDate()
				+ ", getIsbn()=" + getIsbn() + ", getPrice()=" + getPrice() + ", getCategory()=" + getCategory()
				+ ", getEditor()=" + getEditor() + ", getLanguage()=" + getLanguage() + "]";
	}

	@Override
	public String getDetails() {
		return "DVD [title=" + getTitle() + ", language=" + getLanguage() + ", isbn=" + getIsbn() +
				", durata=" + durata + "]";
	}

	@Override
	public boolean matches(String query) {
		return getAuthor().contains(query);
	}	
	
	
}

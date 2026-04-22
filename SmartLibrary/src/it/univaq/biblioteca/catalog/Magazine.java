/**
 * 
 */
package it.univaq.biblioteca.catalog;

import java.util.Date;

/**
 * This class implements a Magazine item
 * @author Me
 */
public class Magazine extends Item {

	private int number;
	private String periodicity;
	
	
	/**
	 * @param title
	 * @param author
	 * @param publishedDate
	 * @param isbn
	 * @param price
	 * @param category
	 * @param editor
	 * @param language
	 * @param number
	 * @param periodicity
	 */
	public Magazine(String title, String author, Date publishedDate, String isbn, float price, String category,
			String editor, String language, int number, String periodicity) {
		super(title, author, publishedDate, isbn, price, category, editor, language);
		this.number = number;
		this.periodicity = periodicity;
	}


	@Override
	public String toString() {
		return "Magazine [number=" + number + ", periodicity=" + periodicity + ", getTitle()=" + getTitle()
				+ ", getAuthor()=" + getAuthor() + ", getPublishedDate()=" + getPublishedDate() + ", getIsbn()="
				+ getIsbn() + ", getPrice()=" + getPrice() + ", getCategory()=" + getCategory() + ", getEditor()="
				+ getEditor() + ", getLanguage()=" + getLanguage() + "]";
	}


	@Override
	public String getDetails() {
		return "Magazine [language=" + getLanguage() + ", title=" + getTitle() + ", isbn=" + getIsbn() +
				", number=" + number + ", period=" + periodicity + "]";				
	}
	
	
	

}

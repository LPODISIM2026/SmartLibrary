package it.univaq.biblioteca.catalog;

public interface IBorrowable {

	void borrow();
    void returnItem();
    boolean isAvailable();
}

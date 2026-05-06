package it.univaq.biblioteca.catalog;

public interface IBorrowable {

	void borrow() throws Unborrowable;
    void returnItem() throws Unreturnable;
    boolean isAvailable();
}

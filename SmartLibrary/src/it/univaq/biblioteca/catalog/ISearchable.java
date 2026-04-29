package it.univaq.biblioteca.catalog;

public interface ISearchable {

	boolean matches(String query);

    default int getSearchScore(String query) {
        return matches(query) ? query.length() : 0;
    }
}

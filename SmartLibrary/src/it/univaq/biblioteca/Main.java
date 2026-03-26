package it.univaq.biblioteca;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello world!");
				
		Libro finalFantasy = new Libro(
				"Final fantasy X", "autore", "2010", 
				"754-8657-4865", 
				23.30f, 
				"fantasy", 
				"Mondatori", 
				1327, 
				"inglese", 
				"fhfbvhfvbuhre"
		);
		System.out.println(finalFantasy);
		
//		String output = "" + finalFantasy;
//		System.out.println(output);
		
//		System.out.println(String.valueOf(false));
//		System.out.println(false);
		
		User user = new User(1, "studente", "Mario", "Rossi", "21-04-1976", "MRARSS76D21I456F", false, "M",
				"0863445566", null, "mario.rossi@email.com", 30.00f, (short) 0, (short) 0);
		System.out.println(user);		
	}

}

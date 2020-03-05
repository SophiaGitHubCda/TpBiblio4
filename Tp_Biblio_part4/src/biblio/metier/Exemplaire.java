package biblio.metier;

import java.time.LocalDate;
import java.util.Calendar;

public class Exemplaire {
	
	private int idExemplaire;
	private LocalDate dateAchat;
	EnumStatusExemplaire status;
	private String isbn;
	
	
	
	


	public Exemplaire(int idExemplaire, LocalDate dateAchat, EnumStatusExemplaire status, String isbn) {
		super();
		this.idExemplaire = idExemplaire;
		this.dateAchat = dateAchat;
		this.status = status;
		this.isbn = isbn;
	}






	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}






	public int getIdExemplaire() {
		
		return 0;
	}

}

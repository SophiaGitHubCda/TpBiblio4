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






	@Override
	public String toString() {
		return "Exemplaire [idExemplaire=" + idExemplaire + ", dateAchat=" + dateAchat + ", status=" + status
				+ ", isbn=" + isbn + "]";
	}






	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}






	public int getIdExemplaire() {
		
		return 0;
	}






	public void setEmpruntEnCours(EmpruntEnCours emp10) {
		// TODO Auto-generated method stub
		
	}






	public void setStatus(EnumStatusExemplaire prete) {
		// TODO Auto-generated method stub
		
	}






	public LocalDate getDateAchat() {
		return dateAchat;
	}






	public void setDateAchat(LocalDate dateAchat) {
		this.dateAchat = dateAchat;
	}






	public String getIsbn() {
		return isbn;
	}






	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}






	public EnumStatusExemplaire getStatus() {
		return status;
	}






	public void setIdExemplaire(int idExemplaire) {
		this.idExemplaire = idExemplaire;
	}

}

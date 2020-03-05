package biblio.metier;

import java.time.LocalDate;
import java.util.ArrayList;

public class EmpruntEnCours {
	
	private LocalDate dateEmprunt;
	private int idUtilisateur;
	private int idExemplaire;
	private int exemp;
	private int ut;
	private LocalDate d;
	private int ex;
	private int u;
	private Utilisateur utilisateur;
	
	
	

	public void setEmprunteur(int idUtilisateur) {
		this.idUtilisateur=u;
	}
	
	public void setExemplaire(int idExemplaire) {
		this.idExemplaire=ex;
	}
	
	public void setDateEmprunt(LocalDate dateEmprunt) {
		this.dateEmprunt=d;
	}
	
	




	public EmpruntEnCours(int idUtilisateur, int idExemplaire, LocalDate dateEmprunt) {
		this.idUtilisateur=ut;
		this.idExemplaire=exemp;
		this.dateEmprunt=dateEmprunt;
	}


	public EmpruntEnCours(LocalDate dateEmprunt) {
		super();
		this.dateEmprunt = dateEmprunt;
	}





	public LocalDate getDateEmprunt() {
		return dateEmprunt;
	}







	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

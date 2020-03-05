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


	public int getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public int getIdExemplaire() {
		return idExemplaire;
	}

	public void setIdExemplaire(int idExemplaire) {
		this.idExemplaire = idExemplaire;
	}

	public int getExemp() {
		return exemp;
	}

	public void setExemp(int exemp) {
		this.exemp = exemp;
	}

	public int getUt() {
		return ut;
	}

	public void setUt(int ut) {
		this.ut = ut;
	}

	public LocalDate getD() {
		return d;
	}

	public void setD(LocalDate d) {
		this.d = d;
	}

	public int getEx() {
		return ex;
	}

	public void setEx(int ex) {
		this.ex = ex;
	}

	public int getU() {
		return u;
	}

	public void setU(int u) {
		this.u = u;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public EmpruntEnCours(LocalDate dateEmprunt) {
		super();
		this.dateEmprunt = dateEmprunt;
	}





	public LocalDate getDateEmprunt() {
		return dateEmprunt;
	}
	
	
	







	@Override
	public String toString() {
		return "EmpruntEnCours [dateEmprunt=" + dateEmprunt + ", idUtilisateur=" + idUtilisateur + ", exemp=" + exemp
				+ "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

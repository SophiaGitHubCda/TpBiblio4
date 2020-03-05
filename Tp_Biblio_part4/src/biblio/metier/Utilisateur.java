package biblio.metier;

import java.util.ArrayList;

public class Utilisateur extends Personne{
	
	
	private int idUtilisateur;
	private String pwd;
	private String pseudonyme;
	private ArrayList<EmpruntEnCours> EmpruntEnCours = new ArrayList <EmpruntEnCours>();
	
	
	public int getNbEmpruntsEncours() {
		return EmpruntEnCours.size();
	}

	public ArrayList<EmpruntEnCours> getEmpruntEnCours() {
		return EmpruntEnCours;
	}

	public void setEmpruntEnCours(EmpruntEnCours empruntEnCours) {
		this.EmpruntEnCours.add(empruntEnCours);
	}

	public Utilisateur(int idUtilisateur, String pwd, String pseudonyme) {
		setIdUtilisateur(idUtilisateur);
		setPwd(pwd);
		setPseudonyme(pseudonyme);
	
	}
	
	public Utilisateur(int idUtilisateur) {
		setIdUtilisateur(idUtilisateur);
	}
	
	
	public Utilisateur() {
		
	}
	
	public void addEmpruntEnCours(){
		
	}
	
	
	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getPseudonyme() {
		return pseudonyme;
	}

	public void setPseudonyme(String pseudonyme) {
		this.pseudonyme = pseudonyme;
	}

	
	
	public int getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}






	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

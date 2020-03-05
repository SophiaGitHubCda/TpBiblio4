package biblio.metier;

public class Adherent extends Utilisateur{
	
	private String telephone;
	private int nbMaxPrets = 3;
	private int dureeMaxPrets = 15;
	
	
	
//constructeur
	public Adherent(int idUtilisateur, String pwd, String pseudonyme, String telephone, int nbMaxPrets,
			int dureeMaxPrets) {
		super(idUtilisateur, pwd, pseudonyme);
		this.telephone = telephone;
		this.nbMaxPrets = nbMaxPrets;
		this.dureeMaxPrets = dureeMaxPrets;
	}

	public Adherent() {
		super();
	}

//methodes
	
public int getNbRetards() {
int nbRetards=0;
return nbRetards;
}

public int isConditionsPretAcceptees() {
int isConditionPretAcceptees=0;
return isConditionPretAcceptees;
}

//guetteurs setteurs
	public String getTelephone() {
	return telephone;
}

public void setTelephone(String telephone) {
	this.telephone = telephone;
}

public int getNbMaxPrets() {
	return nbMaxPrets;
}

public void setNbMaxPrets(int nbMaxPrets) {
	this.nbMaxPrets = nbMaxPrets;
}

public int getDureeMaxPrets() {
	return dureeMaxPrets;
}

public void setDureeMaxPrets(int dureeMaxPrets) {
	this.dureeMaxPrets = dureeMaxPrets;
}





	public static void main(String[] args) {
		

	}

}

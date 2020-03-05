package biblio.metier;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

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

for (int i = 0; i < this.getNbEmpruntsEncours(); i++) {
	
	//Conversion LocalDate en Date
	LocalDate localdate = this.getEmpruntEnCours().get(i).getDateEmprunt();
	Date dateemprunt = Date.from(localdate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
	
	//Test de retard sur l'emprunt
	if (this.isPretEnRetard(dateemprunt, new Date(), this.dureeMaxPrets)) {
		nbRetards++;
	}	
}
return nbRetards;
}


public boolean isPretEnRetard(Date dateEmpruntEffective, Date maintenant, int dureeMaxPret) {
	Calendar calDateMin = Calendar.getInstance();
	calDateMin.setTime(maintenant);
	calDateMin.add(Calendar.DATE, -dureeMaxPret);

	Calendar calDateEmprunt = Calendar.getInstance();
	calDateEmprunt.setTime(dateEmpruntEffective);

	return calDateEmprunt.before(calDateMin);
}



public Boolean isConditionsPretAcceptees() {
	
	boolean reponse = true;
	
	if (this.getNbRetards() > 0) {
		reponse = false;
	}
	
	if (this.getNbEmpruntsEncours() >= this.getNbMaxPrets()) {
		reponse = false;
	}
	
	return reponse;
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





	@Override
public String toString() {
	return "Adherent [telephone=" + telephone + ", nbMaxPrets=" + nbMaxPrets + ", dureeMaxPrets=" + dureeMaxPrets + "]";
}
	
	
	
	
	
	

	@Override
	public void addEmpruntEnCours(EmpruntEnCours ep) throws BiblioException {
		try {
			if (this.isConditionsPretAcceptees()) {
				super.addEmpruntEnCours(ep);
			} else {
				throw new BiblioException();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		

	}

}

package biblio.test;

import java.time.LocalDate;

import biblio.dao.ExemplaireDao;
import biblio.dao.UtilisateursDao;
import biblio.metier.Adherent;
import biblio.metier.BiblioException;
import biblio.metier.EmpruntEnCours;
import biblio.metier.EnumStatusExemplaire;
import biblio.metier.Exemplaire;

public class TestAdherentTroisEmprunts {

	public static void main(String[] args) throws BiblioException {
		
		//creation database exemplairedao
			ExemplaireDao Dao1 = new ExemplaireDao();
			
		//creation des exemplaires
			Exemplaire ex = new Exemplaire(1,LocalDate.of(2020, 02, 1),EnumStatusExemplaire.disponible ,"isbn1");
			Dao1.findByKey(1);
			System.out.println(ex.toString());
			
			Exemplaire ex1 = new Exemplaire(2,LocalDate.of(2020, 03, 1),EnumStatusExemplaire.disponible ,"isbn2");
			Dao1.findByKey(1);
			System.out.println(ex1.toString());
			
			Exemplaire ex2 = new Exemplaire(3,LocalDate.of(2020, 02, 15),EnumStatusExemplaire.disponible ,"isbn3");
			Dao1.findByKey(1);
			System.out.println(ex2.toString());
			
			Exemplaire ex3 = new Exemplaire(4,LocalDate.of(2020, 04, 18),EnumStatusExemplaire.disponible ,"isbn4");
			Dao1.findByKey(1);
			System.out.println(ex3.toString());
			
			Exemplaire ex4 = new Exemplaire(5,LocalDate.of(2021, 02, 1),EnumStatusExemplaire.disponible ,"isbn5");
			Dao1.findByKey(1);
			System.out.println(ex4.toString());
			
			Exemplaire ex5 = new Exemplaire(6,LocalDate.of(2018, 02, 1),EnumStatusExemplaire.disponible ,"isbn6");
			Dao1.findByKey(1);
			System.out.println(ex5.toString());
			
			
			
		//creation database utilisateur
			UtilisateursDao  UtilisateurDao1= new UtilisateursDao();
			
		// Creation d'un Adherent
			
			Adherent ad = new Adherent(11,"NomAdherent","PrenomAdherent","Femme",05,65);
			System.out.println(ad.toString());
			System.out.println();
	
		//Ajouter dans la Data base des Utilisateurs : adherent et employé
			UtilisateurDao1.findByKey(11);
			
			
		//Creation d'un emprunt en cours pour l'adh�rent	
			EmpruntEnCours emp10 = new EmpruntEnCours(1, 11, LocalDate.of(2020, 02, 1));
			ad.addEmpruntEnCours(emp10);
			ex.setEmpruntEnCours(emp10);
			ex.setStatus(EnumStatusExemplaire.prete);
			System.out.println(emp10);
	}

}

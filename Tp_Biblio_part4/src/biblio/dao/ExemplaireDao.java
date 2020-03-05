package biblio.dao;

import java.time.LocalDate;

import biblio.metier.EmpruntEnCours;
import biblio.metier.EnumStatusExemplaire;
import biblio.metier.Exemplaire;

public class ExemplaireDao {
	
	
		//Tableau qui simule la Base de Données des Exemplaires
		private  Exemplaire [] ExemplaireDB = {
		        new Exemplaire(1,LocalDate.of(2020, 05, 26), EnumStatusExemplaire.disponible, "titreduLivre1"),
		        new Exemplaire(2,LocalDate.of(2020, 03, 27), EnumStatusExemplaire.disponible, "titreduLivre1"),
		        new Exemplaire(3,LocalDate.of(2018, 04, 27), EnumStatusExemplaire.supprime, "titreduLivre1"),
		        new Exemplaire(4,LocalDate.of(2020, 03, 28), EnumStatusExemplaire.prete, "titreduLivre1"),
		        new Exemplaire(5,LocalDate.of(2020, 06, 27), EnumStatusExemplaire.disponible, "titreduLivre1"), 
		        };

		public Exemplaire findByKey(int id) {
			for (Exemplaire exemplaire : ExemplaireDB)
				if ((exemplaire.getIdExemplaire()==id))
					return exemplaire;
			//Exception utilisateur inconnu retourne exception
			return null;
		}


}

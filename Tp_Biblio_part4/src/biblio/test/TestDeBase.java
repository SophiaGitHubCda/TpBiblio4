package biblio.test;

import java.time.LocalDate;

import biblio.metier.Adherent;
import biblio.metier.BiblioException;
import biblio.metier.EmpruntEnCours;
import biblio.metier.EnumStatusExemplaire;
import biblio.metier.Exemplaire;

public class TestDeBase {

	public static void main(String[] args) throws BiblioException {
		// TODO Auto-generated method stub
		
		Adherent adh = new Adherent(123,"TOTO","TATA","TONTON",3,15);
		//Exemplaire exe = new Exemplaire(123,LocalDate.of(2020, 03, 01),EnumStatusExemplaire.disponible,"ISBN");
		EmpruntEnCours emp = new EmpruntEnCours(123,456,LocalDate.of(2020, 03, 01));
		EmpruntEnCours emp2 = new EmpruntEnCours(123,456,LocalDate.of(2020, 03, 01));
		EmpruntEnCours emp3 = new EmpruntEnCours(123,456,LocalDate.of(2020, 03, 01));
		EmpruntEnCours emp4 = new EmpruntEnCours(123,456,LocalDate.of(2020, 03, 01));
		
		adh.addEmpruntEnCours(emp);
		adh.addEmpruntEnCours(emp2);
		adh.addEmpruntEnCours(emp3);
		adh.addEmpruntEnCours(emp4);
		
		System.out.println("nbr emprunts : " + adh.getNbEmpruntsEncours());
		System.out.println("retards : " + adh.getNbRetards());
		System.out.println("ispretaccepté : " + adh.isConditionsPretAcceptees());

	}

}

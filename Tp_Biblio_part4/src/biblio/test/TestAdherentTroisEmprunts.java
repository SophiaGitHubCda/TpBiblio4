package biblio.test;

import java.time.LocalDate;

import biblio.dao.ExemplaireDao;
import biblio.metier.EnumStatusExemplaire;
import biblio.metier.Exemplaire;

public class TestAdherentTroisEmprunts {

	public static void main(String[] args) {
		
		//creation database exemplairedao
			ExemplaireDao Dao1 = new ExemplaireDao();
			
		//creation des exemplaires
			Exemplaire ex = new Exemplaire(1,LocalDate.of(2020, 02, 1),EnumStatusExemplaire.disponible ,"isbn1");
			Dao1.findByKey(1);
			System.out.println(ex.toString());
	}

}

package biblio.metier;

import java.time.LocalDate;

public class EmpruntArchive {
	
	private LocalDate dateEmprunt;
	private LocalDate dateRestitutionEff;
	
	

	public EmpruntArchive(LocalDate dateEmprunt, LocalDate dateRestitutionEff) {
		super();
		this.dateEmprunt = dateEmprunt;
		this.dateRestitutionEff = dateRestitutionEff;
	}

	public EmpruntArchive() {
		super();

	}


	public LocalDate getDateEmprunt() {
		return dateEmprunt;
	}



	public void setDateEmprunt(LocalDate dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
	}



	public LocalDate getDateRestitutionEff() {
		return dateRestitutionEff;
	}



	public void setDateRestitutionEff(LocalDate dateRestitutionEff) {
		this.dateRestitutionEff = dateRestitutionEff;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package biblio.dao;

import biblio.metier.Utilisateur;

public class UtilisateursDao {
	
	
	
	private Utilisateur [] UtilisateurDB= {
			new Utilisateur (1,"aaa","zzzz"),
			new Utilisateur (1,"cccc","bbb"),
			new Utilisateur (1,"eee","ddd"),
			new Utilisateur (1,"qqqq","eeee"),
			new Utilisateur (1,"nnnn","ffff"),
			new Utilisateur (1,"toto","mmmm"),
			new Utilisateur (1,"tata","ppppp")
	};
	
	public Utilisateur findByKey(int id) {
		for(Utilisateur utilisateur:UtilisateurDB)
			if ((utilisateur.getIdUtilisateur()==id))
				return utilisateur;
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

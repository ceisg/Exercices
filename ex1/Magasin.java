package ex1;

import java.util.ArrayList;

public class Magasin {

	private String nom;
	private ArrayList<Article> articles;

	public Magasin(String nom) {
		this.nom = nom;
		articles = new ArrayList<Article>();
	}

	public void add(Article art) {
		articles.add(art);

	}

	public void supprimer(Article art) {
		articles.remove(art);
	}

	public boolean contains(Article art) {
		for (Article a : articles)
			if (a.getCode() == art.getCode())
				return true;
		return false;
	}

	public void afficher() {
		for (Article a : articles)
			System.out.println(a.toString());
	}

}

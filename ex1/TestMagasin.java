package ex1;

public class TestMagasin {

	public static void main(String[] args) {

		Article tv = new Fragile("LG", 100, "em2");
		Article pc = new Fragile("Dell", 2000, "em1");
		Article table = new Article("plaset", 300);

		Magasin mg = new Magasin("MG Maxi");

		mg.add(table);
		mg.add(pc);
		mg.add(tv);

		mg.afficher();
		mg.supprimer(pc);
		System.out.println(mg.contains(pc));

		mg.afficher();

	}

}

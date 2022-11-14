package ex1;

public class Article implements Transportable, Exportable {
	private int code;
	private String nom;
	private double prixHT;
	private static int cmp = 0;

	public Article(String nom, double prixHT) {
		this.code = ++cmp;
		this.nom = nom;
		this.prixHT = prixHT;
	}

	@Override
	public String toString() {
		return "[code=" + code + ", nom=" + nom + ", prixHT=" + prixHT + "][ Prix Transport = " + prixTransport()
				+ ",Droit de Douane =" + droitDouane() + "]";
	}

	public int getCode() {
		return code;
	}

	@Override
	public double droitDouane() {

		return prixHT * 0.1;
	}

	@Override
	public double prixTransport() {

		return prixHT * 0.05;
	}

}

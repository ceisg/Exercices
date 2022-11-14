package ex1;

public class Fragile extends Article {

	private String emballage;

	public Fragile(String nom, double prixHT) {
		super(nom, prixHT);

	}

	public Fragile(String nom, double prixHT, String emballage) {
		super(nom, prixHT);
		this.emballage = emballage;
	}

	@Override
	public String toString() {
		return super.toString() + "[emballage=" + emballage + "]";
	}

	@Override
	public double prixTransport() {

		return super.prixTransport() * 2;
	}

}

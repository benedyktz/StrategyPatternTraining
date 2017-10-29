
public class KontoBankowe {
	
	double stanKonta;
	public KosztProwadzeniaKonta kosztType;
	
	public void setKoszt(KosztProwadzeniaKonta kosztType) {
		this.kosztType = kosztType;
	}
	
	public double getStanKonta() {
		return stanKonta;
	}
	
	public void setStanKonta(double stanKonta) {
		this.stanKonta = stanKonta;
	}
	
	public void pokazOplate() {
		System.out.println("Oplata za prowadzenie konta: " + kosztType.naliczOplateZaProwadzenieKonta(stanKonta));
	}
	
}

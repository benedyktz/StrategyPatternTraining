
public class KosztProwadzeniaKontaPremium implements KosztProwadzeniaKonta {

	public double naliczOplateZaProwadzenieKonta(double stanKonta) {
		
		double oplata;
		
		if(stanKonta < 10000) {
			oplata = 0;
		} else{
			oplata = 10;
		}
		
		return oplata;
	}
	
}

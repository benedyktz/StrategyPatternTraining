
public class BankApp {
	
	public static void main(String[] args) {
		
		KontoBankowePremium premium = new KontoBankowePremium();
		KontoBankoweStandard standard = new KontoBankoweStandard();

		premium.setStanKonta(5000);
		premium.pokazOplate();
		
		standard.setStanKonta(25000);
		standard.pokazOplate();
		
		premium.setStanKonta(15000);
		premium.pokazOplate();
		
	}
}

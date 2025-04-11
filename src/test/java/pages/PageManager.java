package pages;

public class PageManager {
	
	private static StorePage sp;
	private static CartPage cp;
	private static CheckoutPage cop;
	
	
	public static StorePage getSp() {
		return sp ==null ? new StorePage(): sp;
	}


	public static CartPage getCp() {
		return cp==null? new CartPage(): cp;
	}


	public static CheckoutPage getCop() {
		return cop==null? new CheckoutPage(): cop;
	}
	 
	
	

}

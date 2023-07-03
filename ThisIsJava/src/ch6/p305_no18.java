package ch6;

// ShopService 클래스
public class p305_no18 {
	private static p305_no18 shopservice = new p305_no18();
	
	private p305_no18() {
		
	}
	
	public p305_no18 getInstance() {
		return shopservice;
	}
}
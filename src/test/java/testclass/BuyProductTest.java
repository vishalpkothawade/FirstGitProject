package testclass;

import org.testng.annotations.Test;

import extentlisteners.TestNGListeners;

public class BuyProductTest extends  TestNGListeners{
	
	@Test(priority = 5)
	public void verifyaddToCart()
	{
		test.info("adding the product inside the cart");
		buyproduct.addToCart();
		
		
	}

}

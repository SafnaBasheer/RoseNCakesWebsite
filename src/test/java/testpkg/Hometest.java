package testpkg;

import java.io.IOException;

import org.testng.annotations.Test;

import basepkg.RncBase;
import pagepkg.Addtocartpage;
import pagepkg.Checkoutpage;
import pagepkg.Homepage;

public class Hometest extends RncBase{
	
	
	@Test(priority=1)
	
	public void homeTest() throws InterruptedException, IOException
	{
		Homepage ob=new Homepage(driver);
		ob.isLogoDisplayed();
		ob.cakeSelect("cakes");
		ob.linkCount();
		ob.click();
		ob.screenshot();
	}
	
@Test(priority=2)
	public void cartTest() throws InterruptedException
	{
		Addtocartpage ob1=new Addtocartpage(driver);
		
		ob1.available();
	    ob1.cake();
		ob1.quantity();
		ob1.date();
		ob1.time();
		ob1.msg_box();
		ob1.click();
	}


@Test(priority=3)

public void checkOutTest()
{
	Checkoutpage ob2=new Checkoutpage(driver);
	ob2.shipping();
	ob2.order();
	ob2.submit();
	ob2.addressDetails("safna","9072432845","kokkadan", "perumbavoor", "683556", "kerala", 38);
	ob2.finalSubmit();
	ob2.logOut();
}
}

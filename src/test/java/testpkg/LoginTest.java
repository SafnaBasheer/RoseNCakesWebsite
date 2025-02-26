package testpkg;

import org.testng.annotations.Test;

import basepkg.RncBase;
import pagepkg.Loginpage;

public class LoginTest extends RncBase{
	
	@Test
	
	public void test2()
	
	{
	   Loginpage ob1=new Loginpage(driver);
	   
	   ob1.setLogValues("safnabasheer18@gmail.com","safna12345");
	   ob1.loginClick();	
		
	   String expectedUrl="https://www.rosencakes.com/dashboard.php";
	   String actualUrl=driver.getCurrentUrl();
	   
	   if(actualUrl.equals(expectedUrl))
	   {
		   System.out.println("login validation passed");
	   }
	   else
	   {
		   System.out.println("login validation failed");
	   }
	}
	
	

}

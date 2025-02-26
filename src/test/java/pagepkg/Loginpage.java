package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepkg.RncBase;

public class Loginpage extends RncBase{
	
	@FindBy(xpath="//*[@id=\"usemail\"]")   
	WebElement email;
	
	@FindBy(xpath="//*[@id=\"usrpass\"]")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"btwnreg\"]")
	WebElement login;
	
	public Loginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setLogValues(String lemail,String lpass)
	{
		
		email.sendKeys(lemail);
		password.sendKeys(lpass);
		
	}
	
	public void loginClick()
	{
		
		login.click();
	}
	
	
}

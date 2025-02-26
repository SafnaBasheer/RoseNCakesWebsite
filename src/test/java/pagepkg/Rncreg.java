package pagepkg;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import basepkg.RncBase;

public class Rncreg extends RncBase {
	
	WebDriverWait wait;
	
	@FindBy(xpath="/html/body/header/div[1]/div/div[2]/p/a[4]")
	WebElement lnk_reg;
	
	@FindBy(xpath="//*[@id=\"name\"]")
	WebElement txt_name;
	
	
	@FindBy(xpath="/html/body/div[3]/div/div/div/div/div[2]/form/div[2]/input")
	WebElement txt_email;
	
	@FindBy(xpath="//*[@id=\"usrcontno\"]")
	WebElement txt_phone;
	
	@FindBy(xpath="/html/body/div[3]/div/div/div/div/div[2]/form/div[4]/input")
    WebElement txt_password;
	
	@FindBy(xpath="//*[@id=\"compass\"]")
	WebElement txt_confirmpass;
	
	@FindBy(xpath="//*[@id=\"useradd\"]")
	WebElement txt_address;
	
	@FindBy(xpath="//*[@id=\"cityname\"]")
	WebElement txt_city;
	
	@FindBy(xpath="//*[@id=\"picode\"]")
	WebElement txt_pincode;
	
	@FindBy(xpath="//*[@id=\"state\"]")
	WebElement txt_state;
	
	@FindBy(xpath="//*[@id=\"shcountry\"]")
	WebElement drop_country;
	
	@FindBy(id="terms")
	WebElement checkbox;
	
	@FindBy(xpath="//*[@id=\"btwnreg\"]")
	WebElement register;
	
	@FindBy(xpath="//h4[normalize-space()='Thank You for joining us.']")
    WebElement msgConfirmation;
	
	
	public Rncreg(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void setValues(String name,String email,String phone,String password,String conpass,String address,String city,String pin,String state,int country) throws InterruptedException
	{
		
		txt_name.sendKeys(name);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		txt_email.sendKeys(email);
		
		txt_phone.sendKeys(phone);
		Thread.sleep(2000);
        txt_password .sendKeys(password);
		txt_confirmpass.sendKeys(conpass);
		txt_address.sendKeys(address);
		txt_city.sendKeys(city);
		txt_pincode.sendKeys(pin);
		txt_state.sendKeys(state);
		Select select=new Select(drop_country);
		select.selectByIndex(country);
		
		Thread.sleep(1000);
		
		
		
		
	}
	
	
	
	
	public void verifyclick()
	{
		System.out.println("Displayed:"+checkbox.isDisplayed());
		System.out.println("Enabled:"+checkbox.isEnabled());
		System.out.println("Selected:"+checkbox.isSelected());
		if(!checkbox.isSelected())
		{
			checkbox.click();
		}
		
		
		
	}
	
	
	public void regClick()
	{
		
		register.click();
		
		
	}
	
	
	public void click()
	{
		lnk_reg.click();
	}
	
	
	public void alert()
	{
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}

	
	
	
	
	
}
 

	


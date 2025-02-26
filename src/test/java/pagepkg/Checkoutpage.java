package pagepkg;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import basepkg.RncBase;

public class Checkoutpage extends RncBase{
	
	@FindBy(xpath="//*[@id=\"shipchrg1\"]")
	WebElement free_shipping;
	
	@FindBy(xpath="//*[@id=\"couponval\"]")
     WebElement coupon_code;
	
	@FindBy(xpath="//*[@id=\"frmqtyu\"]/table[3]/tbody/tr[2]/td[2]/input[2]")
	WebElement apply;
	
	@FindBy(xpath="//*[@id=\"frmqtyu\"]/table[5]/tbody/tr/td[2]/table/tbody/tr[1]/td/a/b")
	WebElement place_order;
	
	@FindBy(xpath="//*[@id=\"regform\"]/input")
	WebElement submit;
	
	@FindBy(xpath="//*[@id=\"frmbook\"]/table/tbody/tr[9]/td[3]/input")
	WebElement receiver_name;
	
	@FindBy(xpath="//*[@id=\"frmbook\"]/table/tbody/tr[11]/td[3]/input")
	WebElement mobile_no;
	
	@FindBy(xpath="//*[@id=\"frmbook\"]/table/tbody/tr[13]/td[3]/input")
	WebElement shipping_adress;
	
	@FindBy(xpath="//*[@id=\"frmbook\"]/table/tbody/tr[15]/td[3]/input")
	WebElement shipping_city;
	
	@FindBy(xpath="//*[@id=\"frmbook\"]/table/tbody/tr[17]/td[3]/input")
	WebElement pincode;
	
	@FindBy(xpath="//*[@id=\"frmbook\"]/table/tbody/tr[19]/td[3]/input")
	WebElement state;
	
	@FindBy(xpath="//*[@id=\"shcountry\"]")
	WebElement country;
	
	@FindBy(xpath="//*[@id=\"btnbook\"]")
	WebElement finalsumbit;
	
	@FindBy(xpath="/html/body/header/div[1]/div/div[2]/p/a[4]")
	WebElement logout;
	
	public Checkoutpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
		
		public void shipping()
		{
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
			free_shipping.click();
		}
		
		public void order()
		{
			
			place_order.click();
		}
		
		public void submit()
		{
		
			submit.click();
		}
		
		public void addressDetails(String rname,String mob,String addr,String rcity,String pin,String rstate,int rcountry)
		{
			receiver_name.sendKeys(rname);
			mobile_no.sendKeys(mob);
			shipping_adress.sendKeys(addr);
			shipping_city.sendKeys(rcity);
			pincode.sendKeys(pin);
			state.sendKeys(rstate);
			Select select=new Select(country);
			select.selectByIndex(rcountry);
			
		}
		
		public void finalSubmit()
		{
			finalsumbit.click();
			
		}
		
		public void logOut()
		{
			logout.click();
		}
		
}

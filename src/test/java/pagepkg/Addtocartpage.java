package pagepkg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import basepkg.RncBase;

public class Addtocartpage extends RncBase {
	
	@FindBy(xpath="/html/body/main/div/div/div[1]/div[2]/div/div[5]/div/form/table[1]/tbody/tr/td[3]/input[1]")
	WebElement available_option;
	
	@FindBy(xpath="/html/body/main/div/div/div[1]/div[2]/div/div[5]/div/form/div[1]/table/tbody/tr[2]/td[3]/input[2]")
	WebElement cake_type;
	
	@FindBy(xpath="//*[@id=\"ordqty\"]")
	WebElement order_quantity;
	
	@FindBy(xpath="//*[@id=\"calendar_datePicker\"]")
	WebElement delivery_date;
	
	@FindBy(xpath="//*[@id=\"deltime\"]")
	WebElement delivery_time;
	
	@FindBy(xpath="//*[@id=\"msgoncake\"]")
	WebElement message_box;
	
	@FindBy(xpath="//*[@id=\"btnOrder\"]")
	WebElement submit;
	
	
	public Addtocartpage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	public void available() throws InterruptedException
	{
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		available_option.click();
	}
	
	public void cake() throws InterruptedException
	{
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		cake_type.click();
	}
	
	
	public void quantity()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		Select select=new Select(order_quantity);
		select.selectByIndex(1);
		
	}
	
	public void date()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		delivery_date.click();
		while(true)
		{
			String monthtext=driver.findElement(By.xpath("//*[@id=\"currM\"]")).getText();
			if(monthtext.equals("February 2025"))
			{
				System.out.println(monthtext);
				break;
			}
			else
			{
				driver.findElement(By.xpath("//*[@id=\"next\"]"));
			}
			
			}
		List<WebElement> datelist=driver.findElements(By.xpath("//*[@id=\"frmchk\"]/table[3]/tbody/tr[2]/td[3]/div/table/tbody/tr[3]/td[7]/span"));
	
		for(WebElement ele:datelist)	
		{
			String date=ele.getText();
			if(date.equals("15"))
			{
				ele.click();
				break;
			}
		}
		
		
	}
		
			
	public void time()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		Select select=new Select(delivery_time);
		select.selectByIndex(2);
	}
	
	public void msg_box()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		message_box.sendKeys("Happy Birthday");
	}
	
	public void click()
	{
		submit.click();
	}
	
	}
	
	



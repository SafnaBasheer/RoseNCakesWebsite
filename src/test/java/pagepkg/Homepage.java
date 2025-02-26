package pagepkg;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v129.page.model.Screenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import basepkg.RncBase;

public class Homepage extends RncBase{
	
	WebDriver driver;
	
@FindBy(xpath="//*[@id=\"freesrc\"]")
WebElement search;

@FindBy(xpath="/html/body/header/div[2]/div/div/div[1]/div/a/img")
WebElement logo;

@FindBy(xpath="//*[@id=\"btnbusreg\"]")
WebElement go;

@FindBy(xpath="/html/body/main/div/div/div[2]/div/div[1]/a/img")
WebElement cake_pic;

@FindBy(xpath="/html/body/main/div/div/div[1]/div[1]/img")
WebElement cakepicture;




public Homepage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}



	
public void cakeSelect(String hsearch) throws InterruptedException
{    
	
search.sendKeys(hsearch);
Thread.sleep(1000);
go.click();	
	
}


public void isLogoDisplayed()
{
	
	System.out.println("logo dispalyed="+logo.isDisplayed());
}



public void screenshot() throws IOException
{
 WebElement cake=driver.findElement(By.xpath("/html/body/main/div/div/div[1]/div[1]/img"));
 File s= cake.getScreenshotAs(OutputType.FILE);
 FileHandler.copy(s,new File("./Screenshot/cakepicture.png"));
}
	

public void click()
{
	cake_pic.click();
}

public void linkCount()
{
	List<WebElement>li=driver.findElements(By.tagName("a"));
	System.out.println("total no: of links="+li.size());
}
}


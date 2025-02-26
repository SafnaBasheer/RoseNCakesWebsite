package testpkg;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import basepkg.RncBase;
import pagepkg.Rncreg;
import utilitypkg.Excelutils;

public class Rnctest extends RncBase{
	
	@Test
	
	public void test() throws InterruptedException
	{
		Rncreg ob=new Rncreg(driver);
		driver.manage().window().maximize();
		
		ob.click();
		
		Thread.sleep(1000);
		
		String x1="C:\\Users\\safna\\OneDrive\\Desktop\\Rnc.xlsx";
		String Sheet="sheet1";
		int rowCount=Excelutils.getRowCount(x1, Sheet);
		
		
		for(int i=1;i<=rowCount;i++)
		{
			String tname=Excelutils.getCellValue(x1, Sheet, i, 0);
		   Thread.sleep(1000);
			String temail=Excelutils.getCellValue(x1, Sheet, i, 1);
			String tphone=Excelutils.getCellValue(x1, Sheet, i, 2);
			
			String tpass=Excelutils.getCellValue(x1, Sheet, i,3);
			String tconpass=Excelutils.getCellValue(x1, Sheet, i, 4);
			String taddr=Excelutils.getCellValue(x1, Sheet, i, 5);
			String tcity=Excelutils.getCellValue(x1, Sheet, i, 6);
			String tpin=Excelutils.getCellValue(x1, Sheet, i, 7);
			String tstate=Excelutils.getCellValue(x1, Sheet, i, 8);
			
			ob.setValues(tname,temail,tphone, tpass, tconpass, taddr, tcity, tpin, tstate,38);
			ob.verifyclick();
		    ob.regClick();
			ob.alert();

			
		}
		
		
	}
	
	

}

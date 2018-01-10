package userInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateACC {

	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver","E://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://gcrit.com/build3/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='bodyContent']/div/div[1]/a[2]/u")).click();
		//RADIO BUTTON
		driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]")).click();
		//ENDS
		driver.findElement(By.name("firstname")).sendKeys("PRASHANTS");
		driver.findElement(By.name("lastname")).sendKeys("SINHA");
		driver.findElement(By.name("dob")).sendKeys("02/01/1991");
		driver.findElement(By.name("email_address")).sendKeys("pk2@gmail.com");
		driver.findElement(By.name("company")).sendKeys("VIPL");
		driver.findElement(By.name("street_address")).sendKeys("Pirmohani");
		driver.findElement(By.name("postcode")).sendKeys("800003");
		driver.findElement(By.name("city")).sendKeys("Patna");
		driver.findElement(By.name("state")).sendKeys("Bihar");
		//DropDown
		Select dropdown=new Select(driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[4]/table/tbody/tr[6]/td[2]/select")));
		dropdown.selectByVisibleText("India");
		//End
		driver.findElement(By.name("telephone")).sendKeys("8985268741");
		//CheckBOX
		driver.findElement(By.name("newsletter")).click();
		//END
		driver.findElement(By.name("password")).sendKeys("sinha@123");
		driver.findElement(By.name("confirmation")).sendKeys("sinha@123");
		driver.findElement(By.id("tdb4")).click();
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		String confirmationmessage=driver.findElement(By.tagName("h1")).getText();
		System.out.println(confirmationmessage);
		
		if(confirmationmessage.equals("Your Account Has Been Created!"))
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("failed");
		}
		driver.close();
	}
}

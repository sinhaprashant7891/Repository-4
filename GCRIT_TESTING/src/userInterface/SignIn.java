package userInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignIn {
	public static void main(String[]args)
	{
	System.setProperty("webdriver.chrome.driver","E://chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://gcrit.com/build3/");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath(".//*[@id='bodyContent']/div/div[1]/a[1]/u")).click();
	driver.findElement(By.name("email_address")).sendKeys("pk2@gmail.com");
	driver.findElement(By.name("password")).sendKeys("sinha@123");
	driver.findElement(By.id("tdb5")).click();
	
	String url=driver.getCurrentUrl();
	System.out.println(url);
	if(url.contains("http://www.gcrit.com/build3/index.php"))
	{
		System.out.println("Passed");
	}
	else
	{
		System.out.println("Failed");
	}
	driver.close();
	}
}

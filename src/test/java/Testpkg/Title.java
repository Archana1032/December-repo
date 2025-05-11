package Testpkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Title 
{

	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.cakehut.in/");
		driver.manage().window().maximize();
		
	}
	@Test
	public void display()
	{
		String gtitle = driver.getTitle();
		System.out.println("Title is : "+gtitle);
	}
@AfterTest
public void teardown()
{
	driver.quit();
}
}

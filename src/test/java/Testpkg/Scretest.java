package Testpkg;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Pagepkg.Screshotpage;

public class Scretest {
	WebDriver driver;
@BeforeTest
public void setUp()
{
	driver=new ChromeDriver();
	driver.get("https://www.cakehut.in/");
	driver.manage().window().maximize();
	
}
@Test
public void testpgm() throws Exception
{
	Screshotpage obj=new Screshotpage(driver);
	obj.scrpgm();
}
}
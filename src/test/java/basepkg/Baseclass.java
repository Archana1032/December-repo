
package basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Baseclass 
{
	 public static WebDriver driver;
	 @BeforeTest
	 public void setUp()
	 {
	  driver=new ChromeDriver();
	  driver.get("https://www.cakehut.in/index.php?route=account/login");
	  driver.manage().window().maximize();
	  //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 }
		
	 public void tearDown()
	 {
	  driver.quit();
	 }
	}


   



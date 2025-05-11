package Pagepkg;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

public class Screshotpage {
WebDriver driver;

public Screshotpage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public void scrpgm() throws Exception
{
	 File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(s, new File("C:\\Users\\ASUS\\Desktop\\Selenium Works\\screnshoot\\screnshot1.png"));
    System.out.println("Screenshots saved successfully");
}
}

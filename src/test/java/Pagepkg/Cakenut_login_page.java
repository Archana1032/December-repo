package Pagepkg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cakenut_login_page {

        WebDriver driver;

        // Locators using @FindBy
        @FindBy(id="input-email")
        WebElement Username;

        @FindBy(id ="input-password")
        WebElement pswrd;

        By Sign = By.xpath("//input[@value='Login']");
       
       public Cakenut_login_page (WebDriver driver)
       {
        this.driver=driver;
        PageFactory.initElements(driver,this);
       }

       
       public void setvalue(String email, String password) 
       {
           Username.sendKeys(email);
           pswrd.sendKeys(password);
       }

       // Method to click login button
       public void log_btn() 
       {
           driver.findElement(Sign).click();
       }
   }

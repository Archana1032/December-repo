
	package Testpkg;

	import org.testng.annotations.Test;
	import basepkg.Baseclass;
	import Pagepkg.Cakenut_login_page;
	import utilities.CakeNut_Excelutils;

	public class CakeNut_login_Test extends Baseclass {

	    @Test
	    public void datadrivenLoginTest() throws Exception {
	        // Initialize the page object
	        Cakenut_login_page obj = new Cakenut_login_page(driver);

	        // Excel path and sheet name
	        String xl = "C:\\Users\\user\\Desktop\\Seleniumworks\\CakeNut.xlsx";
	        String Sheet = "CakeNut";

	        // Get row count
	        int rowcount = CakeNut_Excelutils.getRowcount(xl, Sheet);

	        for (int i = 1; i <= rowcount; i++) 
	        {
	            // Read username and password from Excel
	            String Username = CakeNut_Excelutils.getCellValString(xl, Sheet, i, 0);
	            String password = CakeNut_Excelutils.getCellValString(xl, Sheet, i, 1);

	            System.out.println("Username: " + Username);
	            System.out.println("Password: " + password);

	            // Perform login
	            obj.setvalue(Username, password);
	            obj.log_btn();
	            Thread.sleep(2000);

	            // Validate URL
	            String expurl = "https://www.cakehut.in/index.php?route=account/account";
	            String acturl = driver.getCurrentUrl();
	            System.out.println("Actual URL: " + acturl);

	            // Write result back to Excel (assuming column 2 for result)
	            CakeNut_Excelutils.setCellValue(xl, Sheet, rowcount, expurl, acturl);

	            if (expurl.equals(acturl)) 
	            {
	                System.out.println("Login Successful");
	            } else 
	            {
	                System.out.println("Login Failed");
	            }

	            // Return to login page for next attempt
	            driver.get("https://www.cakehut.in/index.php?route=account/login");
	        }
	    }
	}

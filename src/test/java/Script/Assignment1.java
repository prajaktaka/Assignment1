package Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import Pages.Register;
import Pages.logIn;
import Pages.Search_For_Product_And_Add_to_Cart;


public class Assignment1
{
	WebDriver driver;
	Register register;
	logIn login;
	Search_For_Product_And_Add_to_Cart add;
		
		@BeforeTest
		public void TestSetUp() throws InterruptedException
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			driver.get("https://demo.nopcommerce.com/");	
			driver.manage().window().maximize();
		
		}
		
		@Test
	    public void Testng() throws InterruptedException 
	    {	
			register=new Register(driver);
			register.Click_On_Register();
			login= new logIn(driver);
			login.Click_On_Log_In();
			add= new Search_For_Product_And_Add_to_Cart(driver);
			add.Click_On_Add();
		}
		
		
}

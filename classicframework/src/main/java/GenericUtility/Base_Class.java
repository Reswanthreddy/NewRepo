package GenericUtility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

import ObjectRepository.Login_Page;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {
	public static WebDriver driver;
	public JavaScriptUtility js;
	public Login_Page login;
	PropertyUtility  ppt = new PropertyUtility();
	
	public void LaunchingTheBrowser() throws IOException {
		if(ppt.readingDataFromPropertyFile("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		}
		else if (ppt.readingDataFromPropertyFile("browser").equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(ppt.readingDataFromPropertyFile("url"));
	}
	@BeforeMethod
	public void loadingOject() {
		js=new JavaScriptUtility();
		login = new Login_Page(driver);
	}
	@AfterClass
	public void closingBrowser() {
		driver.quit();
	}

}

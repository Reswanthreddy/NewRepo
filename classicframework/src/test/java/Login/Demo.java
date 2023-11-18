package Login;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().clearDriverCache().setup();
		WebDriverManager.chromedriver().clearResolutionCache().setup();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	}
	
	
}

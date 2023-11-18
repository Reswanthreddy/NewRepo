package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	public  Login_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Log in")
	private WebElement loginLink;
	
	@FindBy(id = "Email")
	private WebElement MailId;
	
	@FindBy(name = "Password")
	private WebElement Pswd;
	
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement Login;

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getMailId() {
		return MailId;
	}

	public WebElement getPswd() {
		return Pswd;
	}

	public WebElement getLogin() {
		return Login;
	}
	
	
	
}

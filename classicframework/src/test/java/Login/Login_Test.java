package Login;

import org.testng.annotations.Test;

import GenericUtility.Base_Class;

public class Login_Test  extends Base_Class{

	@Test
	public void loginToDemowebshop() {
		login.getLoginLink().click();
		login.getMailId().sendKeys("reswanthreddy@gmail.com");
		login.getPswd().sendKeys("*********");
		login.getLogin().click();
	}

}


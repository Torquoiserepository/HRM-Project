package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseHRMClass;

public class PomLogin extends BaseHRMClass{
	//create object repository
		@FindBy(css="#txtUsername") WebElement Username;
		@FindBy(id="txtPassword") WebElement Password;
		@FindBy(id="btnLogin") WebElement Login;
		
		//initiate page element
		public PomLogin() {
			
		PageFactory.initElements(driver, this);
		}
		
		public void typeusername(String name) {
			Username.sendKeys(name);
		}
		
		public void typepassword(String password) {
			Password.sendKeys(password);
		}
		
		public void button() {
			Login.click();
		}
		
		public String verify() {
			return driver.getTitle();
		}
	}

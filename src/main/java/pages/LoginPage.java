package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	//storing webelements
	
	@FindBy (how= How.XPATH,using = "//*[@id=\"username\"]") WebElement USERNAME_ELEMENT;
	@FindBy (how= How.XPATH,using = "//*[@id=\"password\"]") WebElement PASSWORD_ELEMENT;
	@FindBy (how= How.XPATH,using = "/html/body/div/div/div/form/div[3]/button") WebElement SIGN_IN_BUTTON_ELEMENT;
	public String getPageTitle;
	
	
	//Corresponding methods for each element

	public void insertUserName(String username) {
		
		
		USERNAME_ELEMENT.sendKeys(username);
		
	}
	
	public void insertPassword(String password) {
		
		PASSWORD_ELEMENT.sendKeys(password);
	}
	
	public void signinButton() {
		SIGN_IN_BUTTON_ELEMENT.click();
	}
	
	
		
	}
	



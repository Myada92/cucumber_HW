package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DashboardPage extends BasePage {
	
	WebDriver driver;
	public DashboardPage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	@FindBy (how= How.XPATH,using = "//span[contains( text() , 'Dashboard')]") WebElement DASHBOARD_ELEMENT;
	@FindBy (how= How.XPATH,using = "//*[@id=\"side-menu\"]/li[10]/a/span[1]") WebElement BANK_Cash_ELEMENT;
	@FindBy (how= How.XPATH,using = "//*[@id=\"side-menu\"]/li[10]/ul/li[1]/a") WebElement NEW_ACCOUNT_ELEMENT;
	@FindBy (how= How.XPATH,using = "//*[@id=\"account\"]") WebElement ACCOUNT_TITLE_ELEMENT;
	@FindBy (how= How.XPATH,using = "//*[@id=\"description\"]") WebElement DESCRIPTION_ELEMENT;
	@FindBy (how= How.XPATH,using = "//*[@id=\"balance\"]") WebElement Initial_Balance_ELEMENT;
	@FindBy (how= How.XPATH,using = "//*[@id=\"account_number\"]") WebElement Account_NUMBER_ELEMENT;
	@FindBy (how= How.XPATH,using = "//*[@id=\"contact_person\"]") WebElement Contact_PERSON_ELEMENT;
	@FindBy (how= How.XPATH,using = "//*[@id=\"contact_phone\"]") WebElement PHONE_NUMBER_ELEMENT;
	@FindBy (how= How.XPATH,using = "//*[@id=\"ib_url\"]") WebElement Internet_Banking_URL;
	@FindBy (how= How.XPATH,using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/form/button") WebElement SUBMIT_ELEMENT;
	@FindBy (how= How.XPATH,using = "//div[@class='alert alert-success fade in']") WebElement ACCOUNT_HAS_BEEN_ADDED_SUCCSSEFULLY ;

	@Test
	
	
	public void ValidateDashboard() {
		
		Assert.assertEquals(DASHBOARD_ELEMENT.getText(), "Dashboard", "dashboard not found");
		
	}
	public void bankandCashMenue() {
		BANK_Cash_ELEMENT.click();
	}
	public void addNewAccount() {
		 NEW_ACCOUNT_ELEMENT.click();	
	}
	public void fillTheAcoountTiltle(String title) {
		String insertTitle = title + generateRandomNum(9999);
		ACCOUNT_TITLE_ELEMENT.sendKeys(insertTitle);
	}
	public void insertTheDiscription(String desc) {
		String insertDiscription = desc + generateRandomNum(999);
		DESCRIPTION_ELEMENT.sendKeys(insertDiscription);
	}
	public void enterInitialBalance(String init) {
		Initial_Balance_ELEMENT.sendKeys(init);
	}
	public void insertAccountNumber(String accountNum) {
		String insertAccountNumber = accountNum + generateRandomNum(999);
		Account_NUMBER_ELEMENT.sendKeys(insertAccountNumber);
	}
	public void insertContactInfo(String contact) {
		String insertContactInfo = contact + generateRandomNum(999);
		Contact_PERSON_ELEMENT.sendKeys(insertContactInfo);
		
	}
	public void insertPhoneNumber(String phone) {
		String insertPhoneNum = phone + generateRandomNum(999);

		PHONE_NUMBER_ELEMENT.sendKeys(insertPhoneNum);

}
	public void internetBankingURL(String url) {
		Internet_Banking_URL.sendKeys(url);
	}
	public void submit_button() {
		SUBMIT_ELEMENT.click();
	}
//	public void validationofAccountCreation(String message) {
//		Assert.assertEquals(ACCOUNT_HAS_BEEN_ADDED_SUCCSSEFULLY.getText(), message, "Account can not be added");
//	}
}

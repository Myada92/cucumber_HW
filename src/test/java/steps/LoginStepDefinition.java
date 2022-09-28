package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BasePage;
import pages.DashboardPage;
import pages.LoginPage;


public class LoginStepDefinition extends BasePage {
	LoginPage loginPage;
	WebDriver driver;
	DashboardPage dashboardPage;
	

	@Before

	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\myada\\Selenium\\crm\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.techfios.com/billing/?ng=admin/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		loginPage = PageFactory.initElements(driver, LoginPage.class);

	}

	@Given("^User is on techfios login page$")
	public void user_is_on_techfios_login_page() {

	}

	@When("^User enters username as \"([^\"]*)\"$")
	public void User_enters_username(String username) {

		loginPage.insertUserName(username);

	}

	@When("^User enters password as \"([^\"]*)\"$")

	public void Userenterspasswordas(String password) {
		loginPage.insertPassword(password);

	}

	@And("^User clicks on signin button$")

	public void user_clicks_on_signin_button() {
		loginPage.signinButton();

	}

	@Then("^User land on Dashboard page$")
	public void User_should_land_on_Dashboard_page() {
		dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.ValidateDashboard();

	}

	@And("^User shoulld clicks on bankCash$")
	public void User_clicks_on_bank_Cash() {

		dashboardPage.bankandCashMenue();
	}

	@And("^User clicks on newAccount$")
	public void User_clicks_on_newAccount() {

		dashboardPage.addNewAccount();

	}

	@And("^User enters accountTitle as \"([^\"]*)\" in accounts page$")  
	public void user_enters_title_in_accounts_page(String title) {

		dashboardPage.fillTheAcoountTiltle(title);
	}

	@And("^User enters description as \"([^\"]*)\"in accounts page$")
	public void user_enters_description_in_accounts_page(String description) { 

		dashboardPage.insertTheDiscription(description);
	}

	@And("^User enters initialBalance as \"([^\"]*)\"in accounts page$")
	public void user_enters_initialBalance_in_accounts_page(String initialBalance) {

		dashboardPage.enterInitialBalance(initialBalance);
	}
	@And("^User enters accountNumber as \"([^\"]*)\"in accounts page$")
	public void user_enters_accountNumber_in_accounts_page(String account) {
		dashboardPage.insertAccountNumber(account);
	}
	@And("^User enters contactPerson as \"([^\"]*)\"in accounts page$")
	public void user_enters_contactPerson_in_accounts_page(String contact) {
		dashboardPage.insertContactInfo(contact);
	}
	@And("^User enters Phone as\"([^\"]*)\"in accounts page$")
	public void user_enters_Phone_in_accounts_page(String phone) {
		dashboardPage.insertPhoneNumber(phone);
	}
	@And("^User enters internetBankingURL as \"([^\"]*)\"in accounts page$")
	public void user_enters_internetBankingURL_in_accounts_page(String URL) {
		dashboardPage.internetBankingURL(URL);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@And("^User clicks on submit$")
	public void user_clicks_on_submit() {
		
		dashboardPage.submit_button();
		
	}
//	@Then("^User should validate account created successfully$")
//	public void account_created_successfully(String message) {	
//		
//	}
	
	
//	public void tearDown() {
//		driver.close();
//		driver.quit();
//	}

}
package pages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static WebDriver driver;

	public static WebDriver init() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\myada\\Selenium\\crm\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.techfios.com/billing/?ng=admin/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		return driver;

	}

//	public void takeScreenshot(WebDriver driver) {
//
//		// create reference object from the interface
//		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
//
//		// take the screenshot from type file
//		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
//
//		// to save the screenshot in the user current directory so everyone can see it
//		String currentDirectory = System.getProperty("user.dir");
//		try {
//			FileUtils.copyFile(sourceFile, new File(currentDirectory + "/screenshots/" + System.currentTimeMillis() + ".png"));
//		} catch (IOException e) {
//
//			e.printStackTrace();
//		}
//		SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_HHmmss");
//		Date date = new Date();
//		String label = formatter.format(date);
//		try {
//			FileUtils.copyFile(sourceFile, new File(currentDirectory + "/screenshots/" + label + ".png"));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
}

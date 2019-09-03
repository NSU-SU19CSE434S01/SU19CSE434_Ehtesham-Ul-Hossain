package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class LaunchApplication {
	
	static WebDriver driver;
	
	static JavascriptExecutor jse;

	public static void main(String[] args) {
		
		LaunchApplication test = new LaunchApplication();
		test.invokeBrowser();
		
		
	}
	
public void invokeBrowser() {

		
		try {
			System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
			driver.get("https://www.phptravels.net");
			
			setInputField();
			signupLogin();
			logIn();
			Thread.sleep(3000);
			driver.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	
	}
	

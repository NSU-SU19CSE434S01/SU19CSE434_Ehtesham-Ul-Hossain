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

public static void setInputField() {
	
	try {
		driver.findElement(By.xpath("//*[@id=\"body-section\"]/section/div[2]/div/div/div[2]/ul/li[3]/a")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"s2id_autogen3\"]/a/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/div/input")).sendKeys("Sydney");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[18]/div/input")).sendKeys(Keys.RETURN);
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"tchkin\"]/div/input")).click();
		Thread.sleep(1000);
		
		driver.findElements(By.cssSelector
	            ("body > div:nth-child(16) > div.datepicker-days > table > tbody > tr:nth-child(5) > td:nth-child(5)")).get(0).click();
		Thread.sleep(2000);

//		driver.findElement(By.xpath("//*[@id=\"adults\"]/option[4]")).sendKeys(Keys.RETURN);
		
		Select select = new Select(driver.findElement(By.id("adults")));
		Thread.sleep(1000);
		select.selectByIndex(1);
		Thread.sleep(1000);
		
		Select select2 = new Select(driver.findElement(By.id("tourtype")));
		Thread.sleep(1000);
		select2.selectByIndex(1);
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//*[@id=\"tours\"]/form/div[5]/button")).click();
		Thread.sleep(3000);
		
		jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0,1200)");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"body-section\"]/div[3]/div[2]/div[2]/div/div/form/div/div[2]/input")).click();
		Thread.sleep(1000);
	
		driver.findElements(By.cssSelector
	            ("body > div.datepicker.dropdown-menu > div.datepicker-days > table > tbody > tr:nth-child(5) > td:nth-child(4)")).get(0).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"body-section\"]/div[3]/div[2]/div[2]/div/div/form/div/div[2]/button")).click();
		Thread.sleep(3000);
		
		jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0,1400)");
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//*[@id=\"body-section\"]/div[3]/div[2]/div[2]/div/form/div[4]/button")).click();
		//driver.findElement(By.linkText("Book Now")).click();
		driver.findElement(By.cssSelector("#body-section > div:nth-child(7) > div.panel.panel-default > div.panel-body > div > form > div:nth-child(5) > button")).click();
		Thread.sleep(3000);
		//#body-section > div:nth-child(7) > div.panel.panel-default > div.panel-body > div > form > div:nth-child(5) > button

		driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[1]/div[2]/input")).sendKeys("Ehtesham Ul Hossain");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[1]/div[3]/input")).sendKeys("Khan Rafez");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[2]/div[2]/input")).sendKeys("rafezkhan6@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[2]/div[3]/input")).sendKeys("rafezkhan6@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[3]/div[2]/input")).sendKeys("01988621558");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[4]/div[2]/input")).sendKeys("Dhaka, Bangladesh");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"s2id_autogen1\"]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"s2id_autogen1\"]/a")).sendKeys("Bangladesh");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"s2id_autogen1\"]/a")).sendKeys(Keys.RETURN);
		Thread.sleep(1000);
		
		jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0,200)");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[8]/div/div[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"special\"]/div/textarea")).sendKeys("I need some extra facility: one car for whole tour ");			
		Thread.sleep(2000);
		
		jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0,1200)");
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//*[@id=\"body-section\"]/div[1]/div/div/div/div[1]/div[2]/div[4]/button")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"body-section\"]/div[1]/div[2]/div[2]/center/button[2]")).click();
		Thread.sleep(1000);
		
		Select select4 = new Select(driver.findElement(By.id("gateway")));
		Thread.sleep(1000);
		select4.selectByIndex(3);
		Thread.sleep(1000);
//		new WebDriverWait(driver, 20).until(
//		          webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
//		
		
		//Thread.sleep(6000);
		//driver.close();
		
		

		
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
	

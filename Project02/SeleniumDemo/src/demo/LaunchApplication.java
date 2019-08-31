package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApplication {

	public static void main(String[] args) {

			System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://phptravels.com/demo/");
			driver.manage().window().maximize();
			

			driver.findElement(By.cssSelector("#Main > section.grey-box > div > div > div:nth-child(2) > div > div > div.col-md-9 > div.col-md-12 > div > div:nth-child(1) > div > a")).click();
			
			driver.findElement(By.xpath("//*[@id=\"li_myaccount\"]/a")).click();
			
			
			
			
	}

}

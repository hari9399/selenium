package seleniumday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserlaunch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ezhil\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		String currentUrl = driver.getCurrentUrl();
		WebElement txtusername = driver.findElement(By.id("email"));
		txtusername.sendKeys("hari123");
		WebElement txtpassword = driver.findElement(By.id("pass"));
		txtpassword.sendKeys("12345678");
		WebElement btnlogin = driver.findElement(By.xpath("//button[@value='1']"));
		btnlogin.click();
		//WebElement txtlogin = driver.findElement(By.xpath("//h2[@contains(text(),'life')]"));
		//String name = txtlogin.getText();
		
	}

}

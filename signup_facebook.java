package find_element_by_id;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class signup_facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohamed Abdallah\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@data-type='text']")).sendKeys("mohamed");
		driver.findElement(By.xpath("(//input[@data-type='text'])[2]")).sendKeys("sayed");
		driver.findElement(By.xpath("(//input[@data-type='text'])[3]")).sendKeys("test@yahoo.com");
		driver.findElement(By.xpath("(//input[@data-type='text'])[4]")).sendKeys("test@yahoo.com");
		driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("test@123");
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		Select dayvalue = new Select(day);
		Select monthvalue = new Select(month);
		Select yearvalue = new Select(year);
		dayvalue.selectByValue("7");
		monthvalue.selectByValue("10");
		yearvalue.selectByValue("1995");
		WebElement sex=driver.findElement(By.xpath("//input[@value=2]"));
		sex.click();
		WebElement submit=driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
		/*
		 * driver.get("https://www.spicejet.com");
		 * driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).
		 * click(); driver.findElement(By.xpath("//a[@value='JAI']")).click();
		 * driver.findElement(By.xpath("(//a[@value='AIP'])[2]")).click();
		 */

	}

}

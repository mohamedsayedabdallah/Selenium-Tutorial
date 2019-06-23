package find_element_by_id;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_by_link_test {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohamed Sayed\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("msa200946@yahoo.com");
		driver.findElement(By.id("pass")).sendKeys("asmaa@123");
		driver.findElement(By.name("firstname")).sendKeys("حاتم");
		driver.findElement(By.name("reg_email__")).sendKeys("hatem@yahoo.com");
		driver.findElement(By.xpath("//input[contains(@id,'u_0_')]")).click();

	}

}

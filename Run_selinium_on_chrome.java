package first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Run_selinium_on_chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohamed Sayed\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String x = driver.getCurrentUrl();
		System.out.println(x);
		if (x.contentEquals("https://www.facebook.com/")) {
			System.out.println("hi");
		}
		String title = driver.getTitle();
		System.out.println(title);

	}

}
